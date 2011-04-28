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
import org.milyn.edi.unedifact.v41.Recipient;
import org.milyn.edi.unedifact.v41.Recipientref;
import org.milyn.edi.unedifact.v41.Sender;
import org.milyn.edi.unedifact.v41.Syntaxidentifier;
import org.milyn.edi.unedifact.v41.Unb;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getSyntaxIdentifier <em>Syntax Identifier</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getControlRef <em>Control Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getRecipientRef <em>Recipient Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getApplicationRef <em>Application Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getProcessingPriorityCode <em>Processing Priority Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getAckRequest <em>Ack Request</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnbImpl#getTestIndicator <em>Test Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnbImpl extends EObjectImpl implements Unb {
	/**
	 * The cached value of the '{@link #getSyntaxIdentifier() <em>Syntax Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntaxIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Syntaxidentifier syntaxIdentifier;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Sender sender;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Recipient recipient;

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
	 * The default value of the '{@link #getControlRef() <em>Control Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlRef() <em>Control Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlRef()
	 * @generated
	 * @ordered
	 */
	protected String controlRef = CONTROL_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecipientRef() <em>Recipient Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientRef()
	 * @generated
	 * @ordered
	 */
	protected Recipientref recipientRef;

	/**
	 * The default value of the '{@link #getApplicationRef() <em>Application Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationRef() <em>Application Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRef()
	 * @generated
	 * @ordered
	 */
	protected String applicationRef = APPLICATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingPriorityCode() <em>Processing Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSING_PRIORITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessingPriorityCode() <em>Processing Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected String processingPriorityCode = PROCESSING_PRIORITY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAckRequest() <em>Ack Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAckRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String ACK_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAckRequest() <em>Ack Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAckRequest()
	 * @generated
	 * @ordered
	 */
	protected String ackRequest = ACK_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected String agreementId = AGREEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestIndicator() <em>Test Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestIndicator() <em>Test Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIndicator()
	 * @generated
	 * @ordered
	 */
	protected String testIndicator = TEST_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.UNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syntaxidentifier getSyntaxIdentifier() {
		return syntaxIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntaxIdentifier(Syntaxidentifier newSyntaxIdentifier, NotificationChain msgs) {
		Syntaxidentifier oldSyntaxIdentifier = syntaxIdentifier;
		syntaxIdentifier = newSyntaxIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNB__SYNTAX_IDENTIFIER, oldSyntaxIdentifier, newSyntaxIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntaxIdentifier(Syntaxidentifier newSyntaxIdentifier) {
		if (newSyntaxIdentifier != syntaxIdentifier) {
			NotificationChain msgs = null;
			if (syntaxIdentifier != null)
				msgs = ((InternalEObject)syntaxIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__SYNTAX_IDENTIFIER, null, msgs);
			if (newSyntaxIdentifier != null)
				msgs = ((InternalEObject)newSyntaxIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__SYNTAX_IDENTIFIER, null, msgs);
			msgs = basicSetSyntaxIdentifier(newSyntaxIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__SYNTAX_IDENTIFIER, newSyntaxIdentifier, newSyntaxIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sender getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Sender newSender, NotificationChain msgs) {
		Sender oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNB__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Sender newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipient getRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipient(Recipient newRecipient, NotificationChain msgs) {
		Recipient oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNB__RECIPIENT, oldRecipient, newRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(Recipient newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__RECIPIENT, null, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__RECIPIENT, null, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__RECIPIENT, newRecipient, newRecipient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNB__DATE_TIME, oldDateTime, newDateTime);
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
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlRef() {
		return controlRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlRef(String newControlRef) {
		String oldControlRef = controlRef;
		controlRef = newControlRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__CONTROL_REF, oldControlRef, controlRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipientref getRecipientRef() {
		return recipientRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientRef(Recipientref newRecipientRef, NotificationChain msgs) {
		Recipientref oldRecipientRef = recipientRef;
		recipientRef = newRecipientRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNB__RECIPIENT_REF, oldRecipientRef, newRecipientRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientRef(Recipientref newRecipientRef) {
		if (newRecipientRef != recipientRef) {
			NotificationChain msgs = null;
			if (recipientRef != null)
				msgs = ((InternalEObject)recipientRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__RECIPIENT_REF, null, msgs);
			if (newRecipientRef != null)
				msgs = ((InternalEObject)newRecipientRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNB__RECIPIENT_REF, null, msgs);
			msgs = basicSetRecipientRef(newRecipientRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__RECIPIENT_REF, newRecipientRef, newRecipientRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationRef() {
		return applicationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRef(String newApplicationRef) {
		String oldApplicationRef = applicationRef;
		applicationRef = newApplicationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__APPLICATION_REF, oldApplicationRef, applicationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessingPriorityCode() {
		return processingPriorityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingPriorityCode(String newProcessingPriorityCode) {
		String oldProcessingPriorityCode = processingPriorityCode;
		processingPriorityCode = newProcessingPriorityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__PROCESSING_PRIORITY_CODE, oldProcessingPriorityCode, processingPriorityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAckRequest() {
		return ackRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAckRequest(String newAckRequest) {
		String oldAckRequest = ackRequest;
		ackRequest = newAckRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__ACK_REQUEST, oldAckRequest, ackRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreementId() {
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementId(String newAgreementId) {
		String oldAgreementId = agreementId;
		agreementId = newAgreementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__AGREEMENT_ID, oldAgreementId, agreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestIndicator() {
		return testIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestIndicator(String newTestIndicator) {
		String oldTestIndicator = testIndicator;
		testIndicator = newTestIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNB__TEST_INDICATOR, oldTestIndicator, testIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V41Package.UNB__SYNTAX_IDENTIFIER:
				return basicSetSyntaxIdentifier(null, msgs);
			case V41Package.UNB__SENDER:
				return basicSetSender(null, msgs);
			case V41Package.UNB__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case V41Package.UNB__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case V41Package.UNB__RECIPIENT_REF:
				return basicSetRecipientRef(null, msgs);
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
			case V41Package.UNB__SYNTAX_IDENTIFIER:
				return getSyntaxIdentifier();
			case V41Package.UNB__SENDER:
				return getSender();
			case V41Package.UNB__RECIPIENT:
				return getRecipient();
			case V41Package.UNB__DATE_TIME:
				return getDateTime();
			case V41Package.UNB__CONTROL_REF:
				return getControlRef();
			case V41Package.UNB__RECIPIENT_REF:
				return getRecipientRef();
			case V41Package.UNB__APPLICATION_REF:
				return getApplicationRef();
			case V41Package.UNB__PROCESSING_PRIORITY_CODE:
				return getProcessingPriorityCode();
			case V41Package.UNB__ACK_REQUEST:
				return getAckRequest();
			case V41Package.UNB__AGREEMENT_ID:
				return getAgreementId();
			case V41Package.UNB__TEST_INDICATOR:
				return getTestIndicator();
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
			case V41Package.UNB__SYNTAX_IDENTIFIER:
				setSyntaxIdentifier((Syntaxidentifier)newValue);
				return;
			case V41Package.UNB__SENDER:
				setSender((Sender)newValue);
				return;
			case V41Package.UNB__RECIPIENT:
				setRecipient((Recipient)newValue);
				return;
			case V41Package.UNB__DATE_TIME:
				setDateTime((Datetime)newValue);
				return;
			case V41Package.UNB__CONTROL_REF:
				setControlRef((String)newValue);
				return;
			case V41Package.UNB__RECIPIENT_REF:
				setRecipientRef((Recipientref)newValue);
				return;
			case V41Package.UNB__APPLICATION_REF:
				setApplicationRef((String)newValue);
				return;
			case V41Package.UNB__PROCESSING_PRIORITY_CODE:
				setProcessingPriorityCode((String)newValue);
				return;
			case V41Package.UNB__ACK_REQUEST:
				setAckRequest((String)newValue);
				return;
			case V41Package.UNB__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case V41Package.UNB__TEST_INDICATOR:
				setTestIndicator((String)newValue);
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
			case V41Package.UNB__SYNTAX_IDENTIFIER:
				setSyntaxIdentifier((Syntaxidentifier)null);
				return;
			case V41Package.UNB__SENDER:
				setSender((Sender)null);
				return;
			case V41Package.UNB__RECIPIENT:
				setRecipient((Recipient)null);
				return;
			case V41Package.UNB__DATE_TIME:
				setDateTime((Datetime)null);
				return;
			case V41Package.UNB__CONTROL_REF:
				setControlRef(CONTROL_REF_EDEFAULT);
				return;
			case V41Package.UNB__RECIPIENT_REF:
				setRecipientRef((Recipientref)null);
				return;
			case V41Package.UNB__APPLICATION_REF:
				setApplicationRef(APPLICATION_REF_EDEFAULT);
				return;
			case V41Package.UNB__PROCESSING_PRIORITY_CODE:
				setProcessingPriorityCode(PROCESSING_PRIORITY_CODE_EDEFAULT);
				return;
			case V41Package.UNB__ACK_REQUEST:
				setAckRequest(ACK_REQUEST_EDEFAULT);
				return;
			case V41Package.UNB__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case V41Package.UNB__TEST_INDICATOR:
				setTestIndicator(TEST_INDICATOR_EDEFAULT);
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
			case V41Package.UNB__SYNTAX_IDENTIFIER:
				return syntaxIdentifier != null;
			case V41Package.UNB__SENDER:
				return sender != null;
			case V41Package.UNB__RECIPIENT:
				return recipient != null;
			case V41Package.UNB__DATE_TIME:
				return dateTime != null;
			case V41Package.UNB__CONTROL_REF:
				return CONTROL_REF_EDEFAULT == null ? controlRef != null : !CONTROL_REF_EDEFAULT.equals(controlRef);
			case V41Package.UNB__RECIPIENT_REF:
				return recipientRef != null;
			case V41Package.UNB__APPLICATION_REF:
				return APPLICATION_REF_EDEFAULT == null ? applicationRef != null : !APPLICATION_REF_EDEFAULT.equals(applicationRef);
			case V41Package.UNB__PROCESSING_PRIORITY_CODE:
				return PROCESSING_PRIORITY_CODE_EDEFAULT == null ? processingPriorityCode != null : !PROCESSING_PRIORITY_CODE_EDEFAULT.equals(processingPriorityCode);
			case V41Package.UNB__ACK_REQUEST:
				return ACK_REQUEST_EDEFAULT == null ? ackRequest != null : !ACK_REQUEST_EDEFAULT.equals(ackRequest);
			case V41Package.UNB__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case V41Package.UNB__TEST_INDICATOR:
				return TEST_INDICATOR_EDEFAULT == null ? testIndicator != null : !TEST_INDICATOR_EDEFAULT.equals(testIndicator);
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
		result.append(" (controlRef: ");
		result.append(controlRef);
		result.append(", applicationRef: ");
		result.append(applicationRef);
		result.append(", processingPriorityCode: ");
		result.append(processingPriorityCode);
		result.append(", ackRequest: ");
		result.append(ackRequest);
		result.append(", agreementId: ");
		result.append(agreementId);
		result.append(", testIndicator: ");
		result.append(testIndicator);
		result.append(')');
		return result.toString();
	}

} //UnbImpl
