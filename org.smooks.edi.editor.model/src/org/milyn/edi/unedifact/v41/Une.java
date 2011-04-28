/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Une</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Une#getControlCount <em>Control Count</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Une#getGroupRef <em>Group Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getUne()
 * @model extendedMetaData="name='Une' kind='elementOnly'"
 * @generated
 */
public interface Une extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Count</em>' attribute.
	 * @see #setControlCount(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUne_ControlCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='controlCount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlCount();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Une#getControlCount <em>Control Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Count</em>' attribute.
	 * @see #getControlCount()
	 * @generated
	 */
	void setControlCount(String value);

	/**
	 * Returns the value of the '<em><b>Group Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Ref</em>' attribute.
	 * @see #setGroupRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUne_GroupRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Une#getGroupRef <em>Group Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Ref</em>' attribute.
	 * @see #getGroupRef()
	 * @generated
	 */
	void setGroupRef(String value);

} // Une
