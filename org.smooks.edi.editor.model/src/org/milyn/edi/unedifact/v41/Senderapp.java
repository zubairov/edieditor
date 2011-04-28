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
 * A representation of the model object '<em><b>Senderapp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Senderapp#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Senderapp#getCodeQualifier <em>Code Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getSenderapp()
 * @model extendedMetaData="name='Senderapp' kind='elementOnly'"
 * @generated
 */
public interface Senderapp extends EObject {
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSenderapp_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Senderapp#getId <em>Id</em>}' attribute.
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSenderapp_CodeQualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='codeQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCodeQualifier();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Senderapp#getCodeQualifier <em>Code Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Qualifier</em>' attribute.
	 * @see #getCodeQualifier()
	 * @generated
	 */
	void setCodeQualifier(String value);

} // Senderapp
