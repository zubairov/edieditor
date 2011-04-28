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
 * A representation of the model object '<em><b>Sender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Sender#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Sender#getCodeQualifier <em>Code Qualifier</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Sender#getInternalId <em>Internal Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Sender#getInternalSubId <em>Internal Sub Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getSender()
 * @model extendedMetaData="name='Sender' kind='elementOnly'"
 * @generated
 */
public interface Sender extends EObject {
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSender_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Sender#getId <em>Id</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSender_CodeQualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='codeQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCodeQualifier();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Sender#getCodeQualifier <em>Code Qualifier</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSender_InternalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='internalId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInternalId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Sender#getInternalId <em>Internal Id</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSender_InternalSubId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='internalSubId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInternalSubId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Sender#getInternalSubId <em>Internal Sub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Id</em>' attribute.
	 * @see #getInternalSubId()
	 * @generated
	 */
	void setInternalSubId(String value);

} // Sender
