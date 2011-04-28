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
 * A representation of the model object '<em><b>Unb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getSyntaxIdentifier <em>Syntax Identifier</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getSender <em>Sender</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getControlRef <em>Control Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getRecipientRef <em>Recipient Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getApplicationRef <em>Application Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getProcessingPriorityCode <em>Processing Priority Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getAckRequest <em>Ack Request</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Unb#getTestIndicator <em>Test Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb()
 * @model extendedMetaData="name='Unb' kind='elementOnly'"
 * @generated
 */
public interface Unb extends EObject {
	/**
	 * Returns the value of the '<em><b>Syntax Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syntax Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax Identifier</em>' containment reference.
	 * @see #setSyntaxIdentifier(Syntaxidentifier)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_SyntaxIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='syntaxIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Syntaxidentifier getSyntaxIdentifier();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getSyntaxIdentifier <em>Syntax Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax Identifier</em>' containment reference.
	 * @see #getSyntaxIdentifier()
	 * @generated
	 */
	void setSyntaxIdentifier(Syntaxidentifier value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Sender)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_Sender()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sender' namespace='##targetNamespace'"
	 * @generated
	 */
	Sender getSender();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Sender value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference.
	 * @see #setRecipient(Recipient)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_Recipient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	Recipient getRecipient();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getRecipient <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' containment reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Recipient value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(Datetime)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_DateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Datetime getDateTime();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Datetime value);

	/**
	 * Returns the value of the '<em><b>Control Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Ref</em>' attribute.
	 * @see #setControlRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_ControlRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='controlRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getControlRef <em>Control Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Ref</em>' attribute.
	 * @see #getControlRef()
	 * @generated
	 */
	void setControlRef(String value);

	/**
	 * Returns the value of the '<em><b>Recipient Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Ref</em>' containment reference.
	 * @see #setRecipientRef(Recipientref)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_RecipientRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipientRef' namespace='##targetNamespace'"
	 * @generated
	 */
	Recipientref getRecipientRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getRecipientRef <em>Recipient Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Ref</em>' containment reference.
	 * @see #getRecipientRef()
	 * @generated
	 */
	void setRecipientRef(Recipientref value);

	/**
	 * Returns the value of the '<em><b>Application Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Ref</em>' attribute.
	 * @see #setApplicationRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_ApplicationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='applicationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplicationRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getApplicationRef <em>Application Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Ref</em>' attribute.
	 * @see #getApplicationRef()
	 * @generated
	 */
	void setApplicationRef(String value);

	/**
	 * Returns the value of the '<em><b>Processing Priority Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Priority Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Priority Code</em>' attribute.
	 * @see #setProcessingPriorityCode(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_ProcessingPriorityCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='processingPriorityCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProcessingPriorityCode();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getProcessingPriorityCode <em>Processing Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Priority Code</em>' attribute.
	 * @see #getProcessingPriorityCode()
	 * @generated
	 */
	void setProcessingPriorityCode(String value);

	/**
	 * Returns the value of the '<em><b>Ack Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ack Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ack Request</em>' attribute.
	 * @see #setAckRequest(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_AckRequest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ackRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAckRequest();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getAckRequest <em>Ack Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ack Request</em>' attribute.
	 * @see #getAckRequest()
	 * @generated
	 */
	void setAckRequest(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_AgreementId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='agreementId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Test Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Indicator</em>' attribute.
	 * @see #setTestIndicator(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUnb_TestIndicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='testIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestIndicator();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Unb#getTestIndicator <em>Test Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Indicator</em>' attribute.
	 * @see #getTestIndicator()
	 * @generated
	 */
	void setTestIndicator(String value);

} // Unb
