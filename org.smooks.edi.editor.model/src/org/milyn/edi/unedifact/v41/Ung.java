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
 * A representation of the model object '<em><b>Ung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getSenderApp <em>Sender App</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getRecipientApp <em>Recipient App</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getControllingAgencyCode <em>Controlling Agency Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getMessageVersion <em>Message Version</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Ung#getApplicationPassword <em>Application Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getUng()
 * @model extendedMetaData="name='Ung' kind='elementOnly'"
 *        annotation="smooks-mapping-data segcode='UNG' segcodePattern='^UNG' truncable='true' ignoreUnmappedFields='false' description='UNG - Group Header' type='segment'"
 * @generated
 */
public interface Ung extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_GroupId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupId' namespace='##targetNamespace'"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Sender App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender App</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender App</em>' containment reference.
	 * @see #setSenderApp(Senderapp)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_SenderApp()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='senderApp' namespace='##targetNamespace'"
	 * @generated
	 */
	Senderapp getSenderApp();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getSenderApp <em>Sender App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender App</em>' containment reference.
	 * @see #getSenderApp()
	 * @generated
	 */
	void setSenderApp(Senderapp value);

	/**
	 * Returns the value of the '<em><b>Recipient App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient App</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient App</em>' containment reference.
	 * @see #setRecipientApp(Recipientapp)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_RecipientApp()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='recipientApp' namespace='##targetNamespace'"
	 * @generated
	 */
	Recipientapp getRecipientApp();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getRecipientApp <em>Recipient App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient App</em>' containment reference.
	 * @see #getRecipientApp()
	 * @generated
	 */
	void setRecipientApp(Recipientapp value);

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
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_DateTime()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Datetime getDateTime();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Datetime value);

	/**
	 * Returns the value of the '<em><b>Group Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Ref</em>' attribute.
	 * @see #setGroupRef(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_GroupRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace'"
	 *        annotation="smooks-mapping-data truncable='true' required='true' type='field' maxLength='1' minLength='0'"
	 * @generated
	 */
	String getGroupRef();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getGroupRef <em>Group Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Ref</em>' attribute.
	 * @see #getGroupRef()
	 * @generated
	 */
	void setGroupRef(String value);

	/**
	 * Returns the value of the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlling Agency Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlling Agency Code</em>' attribute.
	 * @see #setControllingAgencyCode(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_ControllingAgencyCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='controllingAgencyCode' namespace='##targetNamespace'"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 * @generated
	 */
	String getControllingAgencyCode();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getControllingAgencyCode <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlling Agency Code</em>' attribute.
	 * @see #getControllingAgencyCode()
	 * @generated
	 */
	void setControllingAgencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Message Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Version</em>' containment reference.
	 * @see #setMessageVersion(Messageversion)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_MessageVersion()
	 * @model containment="true"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 *        extendedMetaData="kind='element' name='messageVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Messageversion getMessageVersion();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getMessageVersion <em>Message Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Version</em>' containment reference.
	 * @see #getMessageVersion()
	 * @generated
	 */
	void setMessageVersion(Messageversion value);

	/**
	 * Returns the value of the '<em><b>Application Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Password</em>' attribute.
	 * @see #setApplicationPassword(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getUng_ApplicationPassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='applicationPassword' namespace='##targetNamespace'"
	 *        annotation="smooks-mapping-data truncable='true' required='false' type='field' maxLength='1' minLength='0'"
	 * @generated
	 */
	String getApplicationPassword();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Ung#getApplicationPassword <em>Application Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Password</em>' attribute.
	 * @see #getApplicationPassword()
	 * @generated
	 */
	void setApplicationPassword(String value);

} // Ung
