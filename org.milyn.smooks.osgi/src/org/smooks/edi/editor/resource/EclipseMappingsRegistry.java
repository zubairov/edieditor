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
package org.smooks.edi.editor.resource;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.milyn.ect.EdiDirectory;
import org.milyn.ect.ecore.ECoreGenerator;
import org.milyn.edisax.EDIConfigurationException;
import org.milyn.edisax.model.EdifactModel;
import org.milyn.edisax.model.internal.Edimap;
import org.milyn.edisax.unedifact.registry.AbstractMappingsRegistry;
import org.milyn.edisax.unedifact.registry.MappingsRegistry;
import org.milyn.edisax.util.EDIUtils;
import org.xml.sax.SAXException;

/**
 * Specific {@link MappingsRegistry} which is using Eclipse-specific discovery mechanisms
 * 
 * @author zubairov
 *
 */
public class EclipseMappingsRegistry extends AbstractMappingsRegistry {

	private static final String XML_CATALOG_CONTRIBUTIONS_EXTENSION_POINT = "org.eclipse.wst.xml.core.catalogContributions";

	private Registry packageRegistry;
	
	/**
	 * {@link MappingsRegistry} needs a reference of {@link Registry}
	 * to register loaded models
	 * 
	 * @param reg
	 */
	public EclipseMappingsRegistry(Registry reg) {
		this.packageRegistry = reg;
	}

	@Override
	protected Map<String, EdifactModel> demandLoading(String[] nameComponents)
			throws EDIConfigurationException, IOException, SAXException {
		String targetURI = ("urn:org.milyn.edi.unedifact:" + nameComponents[3]
				+ ":" + nameComponents[1] + nameComponents[2] + ":" + nameComponents[0])
				.toLowerCase();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint ep = registry
				.getExtensionPoint(XML_CATALOG_CONTRIBUTIONS_EXTENSION_POINT);
		if (ep != null) {
			IExtension[] extensions = ep.getExtensions();
			for (IExtension extension : extensions) {
				try {
					IConfigurationElement confEl = extension
							.getConfigurationElements()[0];
					IConfigurationElement[] children = confEl.getChildren();
					for (IConfigurationElement child : children) {
						String uri = child.getAttribute("uri");
						String name = child.getAttribute("name");
						if (uri != null && name != null) {
							if (targetURI.equals(name)) {
								return loadModel(uri);
							}
						}
					}
				} catch (Exception e) {
					System.err
							.println("Failed to process extension contribution from "
									+ extension.getContributor().getName());
					e.printStackTrace();
				}
			}
		}
		return Collections.emptyMap();
	}

	private Map<String, EdifactModel> loadModel(String uri) throws EDIConfigurationException, IOException, SAXException, URISyntaxException {
		Map<String, EdifactModel> result = new LinkedHashMap<String, EdifactModel>();
		URI platformURI = URI.createURI(uri);
		if (platformURI.isPlatform()) {
			String fragment = platformURI.segment(1);
			URI modelListURI = URI.createURI("platform:/fragment/" + fragment + "/" + EDIUtils.EDI_MAPPING_MODEL_ZIP_LIST_FILE);
			URL url = new URL(CommonPlugin.resolve(modelListURI).toString());
			List<String> mappingModelList = EDIUtils.getMappingModelList(url.openStream());
			EDIUtils.loadMappingModels(result, new java.net.URI("/"), mappingModelList);
			// Now we shall register ECORE models
			EdiDirectory dir = createEDIDirectory(result);
			Set<EPackage> packages = ECoreGenerator.INSTANCE.generatePackages(dir);
			for (EPackage pkg : packages) {
				packageRegistry.put(pkg.getNsURI(), pkg);
			}
		}
		return result;
	}

	/**
	 * Creates a {@link EdiDirectory} instance based on the {@link Map}
	 * 
	 * @param models
	 * @return
	 */
	private EdiDirectory createEDIDirectory(Map<String, EdifactModel> models) {
		String commonModelName = EDIUtils.toLookupName(EDIUtils.MODEL_SET_DEFINITIONS_DESCRIPTION);
		EdifactModel commonModel = models.get(commonModelName);
		List<Edimap> restModels = new LinkedList<Edimap>();
		Set<String> keys = models.keySet();
		for (String key : keys) {
			if (!commonModelName.equals(key)) {
				EdifactModel edifactModel = models.get(key);
				restModels.add(edifactModel.getEdimap());
			}
		}
		return new EdiDirectory(commonModel.getEdimap(), restModels);
	}


}
