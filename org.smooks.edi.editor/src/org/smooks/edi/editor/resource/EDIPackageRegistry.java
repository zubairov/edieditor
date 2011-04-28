package org.smooks.edi.editor.resource;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.milyn.edisax.model.EdifactModel;
import org.milyn.edisax.unedifact.UNEdifactInterchangeParser.MappingRegistry;
import org.mylin.ecore.model.EdimapAdapter;
import org.mylin.ecore.model.envelope.EnvelopePackage;
import org.xml.sax.SAXException;

/**
 * A ultimate registry that serves to EMF loading framework as well as to UN
 * EDIFACT parser.
 * 
 * Loading models on demand
 * 
 * @author zubairov
 * 
 */
public class EDIPackageRegistry extends EPackageRegistryImpl implements
		Registry, MappingRegistry {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -400421356940005210L;
	
	private EPackage cuscar;

	private EPackage common;

	public EDIPackageRegistry() {
		super(EPackage.Registry.INSTANCE);
		// We need to initialize EnvelopePackage
		// so that it would register itself to 
		// global package registry
		EnvelopePackage.eINSTANCE.getNsPrefix();
		try {
			cuscar = loadModel("cuscar.ecore");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			common = loadModel("commonDefinitions.ecore");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public EdifactModel getModel(String lookupName) throws SAXException {
		return new EdifactModel(new EdimapAdapter(cuscar));
	}

	/**
	 * Loading CUSCAR ecore model
	 * 
	 * @param modelName
	 *            TODO
	 * 
	 * @return
	 * @throws IOException
	 */
	private EPackage loadModel(String modelName) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new EcoreResourceFactoryImpl());
		Resource resource = rs.getResource(URI.createFileURI(modelName), true);
		EPackage pkg = (EPackage) resource.getAllContents().next();
		return pkg;
	}

	@Override
	public EPackage getEPackage(String nsURI) {
		if (nsURI != null && nsURI.endsWith("CUSCAR")) {
			return cuscar;
		}
		if (nsURI != null && nsURI.equals("http://smooks.org/UNEDI/local/modelsetDefinitions")) {
			return common;
		}
		return super.getEPackage(nsURI);
	}

	@Override
	public EFactory getEFactory(String nsURI) {
		if (nsURI != null && nsURI.endsWith("CUSCAR")) {
			return cuscar.getEFactoryInstance();
		}
		if (nsURI != null && nsURI.equals("http://smooks.org/UNEDI/local/modelsetDefinitions")) {
			return common.getEFactoryInstance();
		}
		return super.getEFactory(nsURI);
	}

}
