/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.milyn.edi.unedifact.v41.Datetime;
import org.milyn.edi.unedifact.v41.Messageversion;
import org.milyn.edi.unedifact.v41.Recipientapp;
import org.milyn.edi.unedifact.v41.Senderapp;
import org.milyn.edi.unedifact.v41.Ung;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getSenderApp <em>Sender App</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getRecipientApp <em>Recipient App</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getControllingAgencyCode <em>Controlling Agency Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getMessageVersion <em>Message Version</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UngImpl#getApplicationPassword <em>Application Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UngImpl extends EObjectImpl implements Ung {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSenderApp() <em>Sender App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderApp()
	 * @generated
	 * @ordered
	 */
	protected Senderapp senderApp;

	/**
	 * The cached value of the '{@link #getRecipientApp() <em>Recipient App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientApp()
	 * @generated
	 * @ordered
	 */
	protected Recipientapp recipientApp;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Datetime dateTime;

	/**
	 * The default value of the '{@link #getGroupRef() <em>Group Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupRef()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupRef() <em>Group Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupRef()
	 * @generated
	 * @ordered
	 */
	protected String groupRef = GROUP_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getControllingAgencyCode() <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllingAgencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLING_AGENCY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllingAgencyCode() <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllingAgencyCode()
	 * @generated
	 * @ordered
	 */
	protected String controllingAgencyCode = CONTROLLING_AGENCY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageVersion() <em>Message Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageVersion()
	 * @generated
	 * @ordered
	 */
	protected Messageversion messageVersion;

	/**
	 * The default value of the '{@link #getApplicationPassword() <em>Application Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationPassword() <em>Application Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationPassword()
	 * @generated
	 * @ordered
	 */
	protected String applicationPassword = APPLICATION_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UngImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.UNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Senderapp getSenderApp() {
		return senderApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenderApp(Senderapp newSenderApp, NotificationChain msgs) {
		Senderapp oldSenderApp = senderApp;
		senderApp = newSenderApp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNG__SENDER_APP, oldSenderApp, newSenderApp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderApp(Senderapp newSenderApp) {
		if (newSenderApp != senderApp) {
			NotificationChain msgs = null;
			if (senderApp != null)
				msgs = ((InternalEObject)senderApp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__SENDER_APP, null, msgs);
			if (newSenderApp != null)
				msgs = ((InternalEObject)newSenderApp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__SENDER_APP, null, msgs);
			msgs = basicSetSenderApp(newSenderApp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__SENDER_APP, newSenderApp, newSenderApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipientapp getRecipientApp() {
		return recipientApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientApp(Recipientapp newRecipientApp, NotificationChain msgs) {
		Recipientapp oldRecipientApp = recipientApp;
		recipientApp = newRecipientApp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNG__RECIPIENT_APP, oldRecipientApp, newRecipientApp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientApp(Recipientapp newRecipientApp) {
		if (newRecipientApp != recipientApp) {
			NotificationChain msgs = null;
			if (recipientApp != null)
				msgs = ((InternalEObject)recipientApp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__RECIPIENT_APP, null, msgs);
			if (newRecipientApp != null)
				msgs = ((InternalEObject)newRecipientApp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__RECIPIENT_APP, null, msgs);
			msgs = basicSetRecipientApp(newRecipientApp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__RECIPIENT_APP, newRecipientApp, newRecipientApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datetime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(Datetime newDateTime, NotificationChain msgs) {
		Datetime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNG__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Datetime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupRef() {
		return groupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupRef(String newGroupRef) {
		String oldGroupRef = groupRef;
		groupRef = newGroupRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__GROUP_REF, oldGroupRef, groupRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllingAgencyCode() {
		return controllingAgencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllingAgencyCode(String newControllingAgencyCode) {
		String oldControllingAgencyCode = controllingAgencyCode;
		controllingAgencyCode = newControllingAgencyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__CONTROLLING_AGENCY_CODE, oldControllingAgencyCode, controllingAgencyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messageversion getMessageVersion() {
		return messageVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageVersion(Messageversion newMessageVersion, NotificationChain msgs) {
		Messageversion oldMessageVersion = messageVersion;
		messageVersion = newMessageVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNG__MESSAGE_VERSION, oldMessageVersion, newMessageVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageVersion(Messageversion newMessageVersion) {
		if (newMessageVersion != messageVersion) {
			NotificationChain msgs = null;
			if (messageVersion != null)
				msgs = ((InternalEObject)messageVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__MESSAGE_VERSION, null, msgs);
			if (newMessageVersion != null)
				msgs = ((InternalEObject)newMessageVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNG__MESSAGE_VERSION, null, msgs);
			msgs = basicSetMessageVersion(newMessageVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__MESSAGE_VERSION, newMessageVersion, newMessageVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationPassword() {
		return applicationPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationPassword(String newApplicationPassword) {
		String oldApplicationPassword = applicationPassword;
		applicationPassword = newApplicationPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNG__APPLICATION_PASSWORD, oldApplicationPassword, applicationPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V41Package.UNG__SENDER_APP:
				return basicSetSenderApp(null, msgs);
			case V41Package.UNG__RECIPIENT_APP:
				return basicSetRecipientApp(null, msgs);
			case V41Package.UNG__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case V41Package.UNG__MESSAGE_VERSION:
				return basicSetMessageVersion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.UNG__GROUP_ID:
				return getGroupId();
			case V41Package.UNG__SENDER_APP:
				return getSenderApp();
			case V41Package.UNG__RECIPIENT_APP:
				return getRecipientApp();
			case V41Package.UNG__DATE_TIME:
				return getDateTime();
			case V41Package.UNG__GROUP_REF:
				return getGroupRef();
			case V41Package.UNG__CONTROLLING_AGENCY_CODE:
				return getControllingAgencyCode();
			case V41Package.UNG__MESSAGE_VERSION:
				return getMessageVersion();
			case V41Package.UNG__APPLICATION_PASSWORD:
				return getApplicationPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V41Package.UNG__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case V41Package.UNG__SENDER_APP:
				setSenderApp((Senderapp)newValue);
				return;
			case V41Package.UNG__RECIPIENT_APP:
				setRecipientApp((Recipientapp)newValue);
				return;
			case V41Package.UNG__DATE_TIME:
				setDateTime((Datetime)newValue);
				return;
			case V41Package.UNG__GROUP_REF:
				setGroupRef((String)newValue);
				return;
			case V41Package.UNG__CONTROLLING_AGENCY_CODE:
				setControllingAgencyCode((String)newValue);
				return;
			case V41Package.UNG__MESSAGE_VERSION:
				setMessageVersion((Messageversion)newValue);
				return;
			case V41Package.UNG__APPLICATION_PASSWORD:
				setApplicationPassword((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case V41Package.UNG__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case V41Package.UNG__SENDER_APP:
				setSenderApp((Senderapp)null);
				return;
			case V41Package.UNG__RECIPIENT_APP:
				setRecipientApp((Recipientapp)null);
				return;
			case V41Package.UNG__DATE_TIME:
				setDateTime((Datetime)null);
				return;
			case V41Package.UNG__GROUP_REF:
				setGroupRef(GROUP_REF_EDEFAULT);
				return;
			case V41Package.UNG__CONTROLLING_AGENCY_CODE:
				setControllingAgencyCode(CONTROLLING_AGENCY_CODE_EDEFAULT);
				return;
			case V41Package.UNG__MESSAGE_VERSION:
				setMessageVersion((Messageversion)null);
				return;
			case V41Package.UNG__APPLICATION_PASSWORD:
				setApplicationPassword(APPLICATION_PASSWORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case V41Package.UNG__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case V41Package.UNG__SENDER_APP:
				return senderApp != null;
			case V41Package.UNG__RECIPIENT_APP:
				return recipientApp != null;
			case V41Package.UNG__DATE_TIME:
				return dateTime != null;
			case V41Package.UNG__GROUP_REF:
				return GROUP_REF_EDEFAULT == null ? groupRef != null : !GROUP_REF_EDEFAULT.equals(groupRef);
			case V41Package.UNG__CONTROLLING_AGENCY_CODE:
				return CONTROLLING_AGENCY_CODE_EDEFAULT == null ? controllingAgencyCode != null : !CONTROLLING_AGENCY_CODE_EDEFAULT.equals(controllingAgencyCode);
			case V41Package.UNG__MESSAGE_VERSION:
				return messageVersion != null;
			case V41Package.UNG__APPLICATION_PASSWORD:
				return APPLICATION_PASSWORD_EDEFAULT == null ? applicationPassword != null : !APPLICATION_PASSWORD_EDEFAULT.equals(applicationPassword);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", groupRef: ");
		result.append(groupRef);
		result.append(", controllingAgencyCode: ");
		result.append(controllingAgencyCode);
		result.append(", applicationPassword: ");
		result.append(applicationPassword);
		result.append(')');
		return result.toString();
	}

} //UngImpl
