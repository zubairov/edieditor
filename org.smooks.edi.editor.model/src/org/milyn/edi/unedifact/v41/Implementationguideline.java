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
 * A representation of the model object '<em><b>Implementationguideline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Implementationguideline#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Implementationguideline#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Implementationguideline#getReleaseNum <em>Release Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Implementationguideline#getControllingAgencyCode <em>Controlling Agency Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getImplementationguideline()
 * @model extendedMetaData="name='Implementationguideline' kind='elementOnly'"
 * @generated
 */
public interface Implementationguideline extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getImplementationguideline_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getImplementationguideline_VersionNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='versionNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getVersionNum <em>Version Num</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getImplementationguideline_ReleaseNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='releaseNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReleaseNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getReleaseNum <em>Release Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Num</em>' attribute.
	 * @see #getReleaseNum()
	 * @generated
	 */
	void setReleaseNum(String value);

	/**
	 * Returns the value of the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlling Agency Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlling Agency Code</em>' attribute.
	 * @see #setControllingAgencyCode(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getImplementationguideline_ControllingAgencyCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='controllingAgencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControllingAgencyCode();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getControllingAgencyCode <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlling Agency Code</em>' attribute.
	 * @see #getControllingAgencyCode()
	 * @generated
	 */
	void setControllingAgencyCode(String value);

} // Implementationguideline
