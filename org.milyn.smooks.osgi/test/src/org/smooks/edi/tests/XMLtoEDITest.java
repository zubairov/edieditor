/*
 * Milyn - Copyright (C) 2006 - 2011
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (version 2.1) as published by the Free Software
 * Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU Lesser General Public License for more details:
 * http://www.gnu.org/licenses/lgpl.txt
 */
package org.smooks.edi.tests;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.milyn.ect.EdiDirectory;
import org.milyn.ect.ecore.ECoreGenerator;
import org.milyn.edi.unedifact.v41.DocumentRoot;
import org.milyn.edi.unedifact.v41.InterchangeMessageType;
import org.milyn.edi.unedifact.v41.UnEdifact;
import org.milyn.edi.unedifact.v41.V41Package;
import org.milyn.edisax.model.EdifactModel;
import org.milyn.edisax.model.internal.Edimap;
import org.milyn.edisax.util.EDIUtils;
import org.smooks.edi.editor.resource.EDIWriter;
import org.xml.sax.SAXException;

/**
 * Testing a simple idea of loading XML to ECore model and then transofrming it
 * back to UN/EDIFACT
 * 
 * @author zubairov
 */
public class XMLtoEDITest extends TestCase {

	public void testXMLtoEDI() throws Exception {
		// Setup resource set
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl());
		// Use all schema information when parsing document
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		
		// Register Envelope factory model to the Ecore Registry
		assertNotNull(V41Package.eINSTANCE);
		// Now we need to register other packages
		registerEDIPackages(rs);
		// Start parsing
		java.net.URI uri = XMLtoEDITest.class.getResource("ediout.xml").toURI();
		Resource resource = rs.getResource(URI.createURI(uri.toString()), true);
		resource.load(null);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		UnEdifact interchange = root.getUnEdifact();
		EList<InterchangeMessageType> msgs = interchange.getInterchangeMessage();
		assertEquals(2, msgs.size());
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		EDIWriter.INSTANCE.write(out, interchange);
		out.flush();
	}

	private void registerEDIPackages(ResourceSet rs) throws IOException, SAXException {
		String urn = "urn:org.milyn.edi.unedifact:d99a-mapping:*";
		Map<String, EdifactModel> result = new LinkedHashMap<String, EdifactModel>();
		EDIUtils.loadMappingModels(urn.toLowerCase(), result, java.net.URI.create("/"));
		List<Edimap> messageModels = new ArrayList<Edimap>();
		Edimap commonModel = null;
		for (String key : result.keySet()) {
			Edimap edifactModel = result.get(key).getEdimap();
			if (key.startsWith("__")) {
				commonModel = edifactModel;
			} else {
				messageModels.add(edifactModel);
			}
		}
		EdiDirectory dir = new EdiDirectory(commonModel, messageModels);
		Set<EPackage> packages = ECoreGenerator.INSTANCE.generatePackages(dir);
		for (EPackage epkg : packages) {
			rs.getPackageRegistry().put(epkg.getNsURI(), epkg);
		}
	}

}
