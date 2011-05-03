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
 * A representation of the model object '<em><b>Datetime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Datetime#getDate <em>Date</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Datetime#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getDatetime()
 * @model extendedMetaData="name='Datetime' kind='elementOnly'"
 *        annotation="smooks-mapping-data type='field' maxLength='1' minLength='0'"
 * @generated
 */
public interface Datetime extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getDatetime_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Datetime#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getDatetime_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='component' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Datetime#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

} // Datetime
