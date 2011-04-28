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
 * A representation of the model object '<em><b>Unt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unt#getSegmentCount <em>Segment Count</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unt#getMessageRefNum <em>Message Ref Num</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getUnt()
 * @model extendedMetaData="name='Unt' kind='elementOnly'"
 * @generated
 */
public interface Unt extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Count</em>' attribute.
	 * @see #setSegmentCount(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnt_SegmentCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='segmentCount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSegmentCount();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unt#getSegmentCount <em>Segment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Count</em>' attribute.
	 * @see #getSegmentCount()
	 * @generated
	 */
	void setSegmentCount(String value);

	/**
	 * Returns the value of the '<em><b>Message Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Ref Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref Num</em>' attribute.
	 * @see #setMessageRefNum(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnt_MessageRefNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='messageRefNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessageRefNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unt#getMessageRefNum <em>Message Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref Num</em>' attribute.
	 * @see #getMessageRefNum()
	 * @generated
	 */
	void setMessageRefNum(String value);

} // Unt
