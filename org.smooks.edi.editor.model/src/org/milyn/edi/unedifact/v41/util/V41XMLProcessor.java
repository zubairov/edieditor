/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.milyn.edi.unedifact.v41.V41Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class V41XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V41XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		V41Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the V41ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new V41ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new V41ResourceFactoryImpl());
		}
		return registrations;
	}

} //V41XMLProcessor
