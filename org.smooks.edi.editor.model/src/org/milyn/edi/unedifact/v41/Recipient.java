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
 * A representation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Recipient#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Recipient#getCodeQualifier <em>Code Qualifier</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Recipient#getInternalId <em>Internal Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Recipient#getInternalSubId <em>Internal Sub Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipient()
 * @model extendedMetaData="name='Recipient' kind='elementOnly'"
 *        annotation="smooks-mapping-data type='field' maxLength='1' minLength='0'"
 * @generated
 */
public interface Recipient extends EObject {
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipient_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Recipient#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Code Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Qualifier</em>' attribute.
	 * @see #setCodeQualifier(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipient_CodeQualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='codeQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCodeQualifier();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Recipient#getCodeQualifier <em>Code Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Qualifier</em>' attribute.
	 * @see #getCodeQualifier()
	 * @generated
	 */
	void setCodeQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Id</em>' attribute.
	 * @see #setInternalId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipient_InternalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='internalId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInternalId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Recipient#getInternalId <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Id</em>' attribute.
	 * @see #getInternalId()
	 * @generated
	 */
	void setInternalId(String value);

	/**
	 * Returns the value of the '<em><b>Internal Sub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Sub Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Sub Id</em>' attribute.
	 * @see #setInternalSubId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipient_InternalSubId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='internalSubId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInternalSubId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Recipient#getInternalSubId <em>Internal Sub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Id</em>' attribute.
	 * @see #getInternalSubId()
	 * @generated
	 */
	void setInternalSubId(String value);

} // Recipient
