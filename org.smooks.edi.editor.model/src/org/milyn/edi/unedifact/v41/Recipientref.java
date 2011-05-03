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
 * A representation of the model object '<em><b>Recipientref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Recipientref#getRef <em>Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Recipientref#getRefQualifier <em>Ref Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipientref()
 * @model extendedMetaData="name='Recipientref' kind='elementOnly'"
 *        annotation="smooks-mapping-data type='field' maxLength='1' minLength='0'"
 * @generated
 */
public interface Recipientref extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipientref_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Recipientref#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Ref Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Qualifier</em>' attribute.
	 * @see #setRefQualifier(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getRecipientref_RefQualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='refQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefQualifier();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Recipientref#getRefQualifier <em>Ref Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Qualifier</em>' attribute.
	 * @see #getRefQualifier()
	 * @generated
	 */
	void setRefQualifier(String value);

} // Recipientref
