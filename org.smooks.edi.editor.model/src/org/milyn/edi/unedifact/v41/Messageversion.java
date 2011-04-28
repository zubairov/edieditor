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
 * A representation of the model object '<em><b>Messageversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageversion#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageversion#getReleaseNum <em>Release Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageversion#getAssociationCode <em>Association Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageversion()
 * @model extendedMetaData="name='Messageversion' kind='elementOnly'"
 * @generated
 */
public interface Messageversion extends EObject {
	/**
	 * Returns the value of the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Num</em>' attribute.
	 * @see #setVersionNum(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageversion_VersionNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageversion#getVersionNum <em>Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Num</em>' attribute.
	 * @see #getVersionNum()
	 * @generated
	 */
	void setVersionNum(String value);

	/**
	 * Returns the value of the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Num</em>' attribute.
	 * @see #setReleaseNum(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageversion_ReleaseNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='releaseNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReleaseNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageversion#getReleaseNum <em>Release Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Num</em>' attribute.
	 * @see #getReleaseNum()
	 * @generated
	 */
	void setReleaseNum(String value);

	/**
	 * Returns the value of the '<em><b>Association Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Code</em>' attribute.
	 * @see #setAssociationCode(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageversion_AssociationCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='associationCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssociationCode();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageversion#getAssociationCode <em>Association Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Code</em>' attribute.
	 * @see #getAssociationCode()
	 * @generated
	 */
	void setAssociationCode(String value);

} // Messageversion
