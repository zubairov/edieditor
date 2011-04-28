package org.smooks.edi.editor;

import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.milyn.edisax.unedifact.registry.LazyMappingsRegistry;
import org.smooks.edi.editor.resource.EDIFactResourceFactoryImpl;

public class EDIEditor extends EcoreEditor {

	public EDIEditor() {
		super();
		editingDomain.getResourceSet().getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("edi", new EDIFactResourceFactoryImpl(new LazyMappingsRegistry()));
		editingDomain.getResourceSet().getLoadOptions().put(EDIFactResourceFactoryImpl.FEATURE_IGNORE_NEWLINES, true);
		editingDomain.getResourceSet().getLoadOptions().put(EDIFactResourceFactoryImpl.FEATURE_VALIDATE, true);
		editingDomain.getResourceSet().getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		// Initialize Envelope factory
		EnvelopeFactory.eINSTANCE.getEnvelopePackage();
		// Initialize adapter factories
	    // Create an adapter factory that yields item providers.
	    //
	    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	    adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
	    adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
	    adapterFactory.addAdapterFactory(new CustomRelectiveItemProviderAdapterFactory());
	}

}
