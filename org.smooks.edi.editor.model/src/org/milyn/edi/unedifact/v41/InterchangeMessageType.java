/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interchange Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNH <em>UNH</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getAny <em>Any</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNT <em>UNT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getInterchangeMessageType()
 * @model extendedMetaData="name='interchangeMessageType' kind='elementOnly'"
 * @generated
 */
public interface InterchangeMessageType extends EObject {
	/**
	 * Returns the value of the '<em><b>UNH</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UNH</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UNH</em>' containment reference.
	 * @see #setUNH(Unh)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getInterchangeMessageType_UNH()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UNH' namespace='##targetNamespace'"
	 * @generated
	 */
	Unh getUNH();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNH <em>UNH</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UNH</em>' containment reference.
	 * @see #getUNH()
	 * @generated
	 */
	void setUNH(Unh value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.milyn.edi.unedifact.v41.V41Package#getInterchangeMessageType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>UNT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UNT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UNT</em>' containment reference.
	 * @see #setUNT(Unt)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getInterchangeMessageType_UNT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UNT' namespace='##targetNamespace'"
	 * @generated
	 */
	Unt getUNT();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNT <em>UNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UNT</em>' containment reference.
	 * @see #getUNT()
	 * @generated
	 */
	void setUNT(Unt value);

} // InterchangeMessageType
