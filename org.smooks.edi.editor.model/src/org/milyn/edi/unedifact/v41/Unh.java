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
 * A representation of the model object '<em><b>Unh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getMessageRefNum <em>Message Ref Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getMessageIdentifier <em>Message Identifier</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getCommonAccessRef <em>Common Access Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getTransferStatus <em>Transfer Status</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getImplementationGuideline <em>Implementation Guideline</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unh#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh()
 * @model extendedMetaData="name='Unh' kind='elementOnly'"
 *        annotation="smooks-mapping-data segcode='UNH' segcodePattern='^UNH' truncable='true' ignoreUnmappedFields='false' description='UNH - Message Header' type='segment'"
 * @generated
 */
public interface Unh extends EObject {
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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_MessageRefNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='messageRefNum' namespace='##targetNamespace'"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='field' maxLength='1' minLength='0'"
	 * @generated
	 */
	String getMessageRefNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getMessageRefNum <em>Message Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref Num</em>' attribute.
	 * @see #getMessageRefNum()
	 * @generated
	 */
	void setMessageRefNum(String value);

	/**
	 * Returns the value of the '<em><b>Message Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Identifier</em>' containment reference.
	 * @see #setMessageIdentifier(Messageidentifier)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_MessageIdentifier()
	 * @model containment="true" required="true"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='messageIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Messageidentifier getMessageIdentifier();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getMessageIdentifier <em>Message Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Identifier</em>' containment reference.
	 * @see #getMessageIdentifier()
	 * @generated
	 */
	void setMessageIdentifier(Messageidentifier value);

	/**
	 * Returns the value of the '<em><b>Common Access Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Access Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Access Ref</em>' attribute.
	 * @see #setCommonAccessRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_CommonAccessRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='commonAccessRef' namespace='##targetNamespace'"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 * @generated
	 */
	String getCommonAccessRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getCommonAccessRef <em>Common Access Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Access Ref</em>' attribute.
	 * @see #getCommonAccessRef()
	 * @generated
	 */
	void setCommonAccessRef(String value);

	/**
	 * Returns the value of the '<em><b>Transfer Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Status</em>' containment reference.
	 * @see #setTransferStatus(Transferstatus)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_TransferStatus()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='transferStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	Transferstatus getTransferStatus();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getTransferStatus <em>Transfer Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Status</em>' containment reference.
	 * @see #getTransferStatus()
	 * @generated
	 */
	void setTransferStatus(Transferstatus value);

	/**
	 * Returns the value of the '<em><b>Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset</em>' containment reference.
	 * @see #setSubset(Subset)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_Subset()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='subset' namespace='##targetNamespace'"
	 * @generated
	 */
	Subset getSubset();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getSubset <em>Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset</em>' containment reference.
	 * @see #getSubset()
	 * @generated
	 */
	void setSubset(Subset value);

	/**
	 * Returns the value of the '<em><b>Implementation Guideline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Guideline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Guideline</em>' containment reference.
	 * @see #setImplementationGuideline(Implementationguideline)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_ImplementationGuideline()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='implementationGuideline' namespace='##targetNamespace'"
	 * @generated
	 */
	Implementationguideline getImplementationGuideline();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getImplementationGuideline <em>Implementation Guideline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Guideline</em>' containment reference.
	 * @see #getImplementationGuideline()
	 * @generated
	 */
	void setImplementationGuideline(Implementationguideline value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(Scenario)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnh_Scenario()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='scenario' namespace='##targetNamespace'"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unh#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // Unh
