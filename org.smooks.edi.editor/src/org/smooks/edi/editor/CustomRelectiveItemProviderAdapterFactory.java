package org.smooks.edi.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

/**
 * Extension of {@link ReflectiveItemProviderAdapterFactory} to produce custom label adapter
 * 
 * @author zubairov
 *
 */
public class CustomRelectiveItemProviderAdapterFactory extends
		ReflectiveItemProviderAdapterFactory implements AdapterFactory {

	public CustomRelectiveItemProviderAdapterFactory() {
		super();
	    reflectiveItemProviderAdapter = new CustomReflectiveItemProvider(this);
	}
	
}
