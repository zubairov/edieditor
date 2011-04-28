package org.smooks.edi.editor.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.milyn.edisax.EDIParser;
import org.milyn.edisax.unedifact.registry.MappingsRegistry;

/**
 * EDI-specific resource factory implementation
 * 
 * @author zubairov
 *
 */
public class EDIFactResourceFactoryImpl extends ResourceFactoryImpl {

	private MappingsRegistry reg;
	
    public static final String FEATURE_VALIDATE = EDIParser.FEATURE_VALIDATE;

    public static final String FEATURE_IGNORE_NEWLINES = EDIParser.FEATURE_IGNORE_NEWLINES;
	

	public EDIFactResourceFactoryImpl(MappingsRegistry registry) {
		this.reg = registry;
	}
	
	@Override
	public Resource createResource(URI uri) {
		return new EDIXMLResource(uri, reg);
	}
	
}
