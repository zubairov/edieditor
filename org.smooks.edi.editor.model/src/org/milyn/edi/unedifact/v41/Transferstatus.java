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
 * A representation of the model object '<em><b>Transferstatus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Transferstatus#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Transferstatus#getFirstAndLast <em>First And Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getTransferstatus()
 * @model extendedMetaData="name='Transferstatus' kind='elementOnly'"
 * @generated
 */
public interface Transferstatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getTransferstatus_Sequence()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSequence();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Transferstatus#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(String value);

	/**
	 * Returns the value of the '<em><b>First And Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First And Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First And Last</em>' attribute.
	 * @see #setFirstAndLast(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getTransferstatus_FirstAndLast()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='firstAndLast' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstAndLast();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Transferstatus#getFirstAndLast <em>First And Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First And Last</em>' attribute.
	 * @see #getFirstAndLast()
	 * @generated
	 */
	void setFirstAndLast(String value);

} // Transferstatus
