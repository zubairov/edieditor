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
 * A representation of the model object '<em><b>Messageidentifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getReleaseNum <em>Release Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getControllingAgencyCode <em>Controlling Agency Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getAssociationAssignedCode <em>Association Assigned Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getCodeListDirVersionNum <em>Code List Dir Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Messageidentifier#getTypeSubFunctionId <em>Type Sub Function Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier()
 * @model extendedMetaData="name='Messageidentifier' kind='elementOnly'"
 *        annotation="smooks-mapping-data type='field' maxLength='1' minLength='0'"
 * @generated
 */
public interface Messageidentifier extends EObject {
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getId <em>Id</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_VersionNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='versionNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getVersionNum <em>Version Num</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_ReleaseNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='releaseNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReleaseNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getReleaseNum <em>Release Num</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_ControllingAgencyCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='controllingAgencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControllingAgencyCode();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getControllingAgencyCode <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlling Agency Code</em>' attribute.
	 * @see #getControllingAgencyCode()
	 * @generated
	 */
	void setControllingAgencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Association Assigned Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Assigned Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Assigned Code</em>' attribute.
	 * @see #setAssociationAssignedCode(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_AssociationAssignedCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='associationAssignedCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssociationAssignedCode();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getAssociationAssignedCode <em>Association Assigned Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Assigned Code</em>' attribute.
	 * @see #getAssociationAssignedCode()
	 * @generated
	 */
	void setAssociationAssignedCode(String value);

	/**
	 * Returns the value of the '<em><b>Code List Dir Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code List Dir Version Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Dir Version Num</em>' attribute.
	 * @see #setCodeListDirVersionNum(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_CodeListDirVersionNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='codeListDirVersionNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCodeListDirVersionNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getCodeListDirVersionNum <em>Code List Dir Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Dir Version Num</em>' attribute.
	 * @see #getCodeListDirVersionNum()
	 * @generated
	 */
	void setCodeListDirVersionNum(String value);

	/**
	 * Returns the value of the '<em><b>Type Sub Function Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Sub Function Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Sub Function Id</em>' attribute.
	 * @see #setTypeSubFunctionId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getMessageidentifier_TypeSubFunctionId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='typeSubFunctionId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTypeSubFunctionId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getTypeSubFunctionId <em>Type Sub Function Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Sub Function Id</em>' attribute.
	 * @see #getTypeSubFunctionId()
	 * @generated
	 */
	void setTypeSubFunctionId(String value);

} // Messageidentifier
