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
 * A representation of the model object '<em><b>Unz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unz#getControlCount <em>Control Count</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unz#getControlRef <em>Control Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getUnz()
 * @model extendedMetaData="name='Unz' kind='elementOnly'"
 * @generated
 */
public interface Unz extends EObject {
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnz_ControlCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='controlCount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlCount();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unz#getControlCount <em>Control Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Count</em>' attribute.
	 * @see #getControlCount()
	 * @generated
	 */
	void setControlCount(String value);

	/**
	 * Returns the value of the '<em><b>Control Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Ref</em>' attribute.
	 * @see #setControlRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnz_ControlRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='controlRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unz#getControlRef <em>Control Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Ref</em>' attribute.
	 * @see #getControlRef()
	 * @generated
	 */
	void setControlRef(String value);

} // Unz
