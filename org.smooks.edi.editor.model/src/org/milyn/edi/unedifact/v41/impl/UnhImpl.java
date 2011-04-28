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

import org.milyn.edi.unedifact.v41.Implementationguideline;
import org.milyn.edi.unedifact.v41.Messageidentifier;
import org.milyn.edi.unedifact.v41.Scenario;
import org.milyn.edi.unedifact.v41.Subset;
import org.milyn.edi.unedifact.v41.Transferstatus;
import org.milyn.edi.unedifact.v41.Unh;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getMessageRefNum <em>Message Ref Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getMessageIdentifier <em>Message Identifier</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getCommonAccessRef <em>Common Access Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getTransferStatus <em>Transfer Status</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getImplementationGuideline <em>Implementation Guideline</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnhImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnhImpl extends EObjectImpl implements Unh {
	/**
	 * The default value of the '{@link #getMessageRefNum() <em>Message Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRefNum()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_REF_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageRefNum() <em>Message Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRefNum()
	 * @generated
	 * @ordered
	 */
	protected String messageRefNum = MESSAGE_REF_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageIdentifier() <em>Message Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Messageidentifier messageIdentifier;

	/**
	 * The default value of the '{@link #getCommonAccessRef() <em>Common Access Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonAccessRef()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMON_ACCESS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommonAccessRef() <em>Common Access Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonAccessRef()
	 * @generated
	 * @ordered
	 */
	protected String commonAccessRef = COMMON_ACCESS_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransferStatus() <em>Transfer Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferStatus()
	 * @generated
	 * @ordered
	 */
	protected Transferstatus transferStatus;

	/**
	 * The cached value of the '{@link #getSubset() <em>Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubset()
	 * @generated
	 * @ordered
	 */
	protected Subset subset;

	/**
	 * The cached value of the '{@link #getImplementationGuideline() <em>Implementation Guideline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGuideline()
	 * @generated
	 * @ordered
	 */
	protected Implementationguideline implementationGuideline;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnhImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.UNH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageRefNum() {
		return messageRefNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRefNum(String newMessageRefNum) {
		String oldMessageRefNum = messageRefNum;
		messageRefNum = newMessageRefNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__MESSAGE_REF_NUM, oldMessageRefNum, messageRefNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messageidentifier getMessageIdentifier() {
		return messageIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageIdentifier(Messageidentifier newMessageIdentifier, NotificationChain msgs) {
		Messageidentifier oldMessageIdentifier = messageIdentifier;
		messageIdentifier = newMessageIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNH__MESSAGE_IDENTIFIER, oldMessageIdentifier, newMessageIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageIdentifier(Messageidentifier newMessageIdentifier) {
		if (newMessageIdentifier != messageIdentifier) {
			NotificationChain msgs = null;
			if (messageIdentifier != null)
				msgs = ((InternalEObject)messageIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__MESSAGE_IDENTIFIER, null, msgs);
			if (newMessageIdentifier != null)
				msgs = ((InternalEObject)newMessageIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__MESSAGE_IDENTIFIER, null, msgs);
			msgs = basicSetMessageIdentifier(newMessageIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__MESSAGE_IDENTIFIER, newMessageIdentifier, newMessageIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommonAccessRef() {
		return commonAccessRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonAccessRef(String newCommonAccessRef) {
		String oldCommonAccessRef = commonAccessRef;
		commonAccessRef = newCommonAccessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__COMMON_ACCESS_REF, oldCommonAccessRef, commonAccessRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transferstatus getTransferStatus() {
		return transferStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferStatus(Transferstatus newTransferStatus, NotificationChain msgs) {
		Transferstatus oldTransferStatus = transferStatus;
		transferStatus = newTransferStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNH__TRANSFER_STATUS, oldTransferStatus, newTransferStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferStatus(Transferstatus newTransferStatus) {
		if (newTransferStatus != transferStatus) {
			NotificationChain msgs = null;
			if (transferStatus != null)
				msgs = ((InternalEObject)transferStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__TRANSFER_STATUS, null, msgs);
			if (newTransferStatus != null)
				msgs = ((InternalEObject)newTransferStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__TRANSFER_STATUS, null, msgs);
			msgs = basicSetTransferStatus(newTransferStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__TRANSFER_STATUS, newTransferStatus, newTransferStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset getSubset() {
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubset(Subset newSubset, NotificationChain msgs) {
		Subset oldSubset = subset;
		subset = newSubset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNH__SUBSET, oldSubset, newSubset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubset(Subset newSubset) {
		if (newSubset != subset) {
			NotificationChain msgs = null;
			if (subset != null)
				msgs = ((InternalEObject)subset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__SUBSET, null, msgs);
			if (newSubset != null)
				msgs = ((InternalEObject)newSubset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__SUBSET, null, msgs);
			msgs = basicSetSubset(newSubset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__SUBSET, newSubset, newSubset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementationguideline getImplementationGuideline() {
		return implementationGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationGuideline(Implementationguideline newImplementationGuideline, NotificationChain msgs) {
		Implementationguideline oldImplementationGuideline = implementationGuideline;
		implementationGuideline = newImplementationGuideline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNH__IMPLEMENTATION_GUIDELINE, oldImplementationGuideline, newImplementationGuideline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationGuideline(Implementationguideline newImplementationGuideline) {
		if (newImplementationGuideline != implementationGuideline) {
			NotificationChain msgs = null;
			if (implementationGuideline != null)
				msgs = ((InternalEObject)implementationGuideline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__IMPLEMENTATION_GUIDELINE, null, msgs);
			if (newImplementationGuideline != null)
				msgs = ((InternalEObject)newImplementationGuideline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__IMPLEMENTATION_GUIDELINE, null, msgs);
			msgs = basicSetImplementationGuideline(newImplementationGuideline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__IMPLEMENTATION_GUIDELINE, newImplementationGuideline, newImplementationGuideline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UNH__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UNH__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNH__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V41Package.UNH__MESSAGE_IDENTIFIER:
				return basicSetMessageIdentifier(null, msgs);
			case V41Package.UNH__TRANSFER_STATUS:
				return basicSetTransferStatus(null, msgs);
			case V41Package.UNH__SUBSET:
				return basicSetSubset(null, msgs);
			case V41Package.UNH__IMPLEMENTATION_GUIDELINE:
				return basicSetImplementationGuideline(null, msgs);
			case V41Package.UNH__SCENARIO:
				return basicSetScenario(null, msgs);
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
			case V41Package.UNH__MESSAGE_REF_NUM:
				return getMessageRefNum();
			case V41Package.UNH__MESSAGE_IDENTIFIER:
				return getMessageIdentifier();
			case V41Package.UNH__COMMON_ACCESS_REF:
				return getCommonAccessRef();
			case V41Package.UNH__TRANSFER_STATUS:
				return getTransferStatus();
			case V41Package.UNH__SUBSET:
				return getSubset();
			case V41Package.UNH__IMPLEMENTATION_GUIDELINE:
				return getImplementationGuideline();
			case V41Package.UNH__SCENARIO:
				return getScenario();
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
			case V41Package.UNH__MESSAGE_REF_NUM:
				setMessageRefNum((String)newValue);
				return;
			case V41Package.UNH__MESSAGE_IDENTIFIER:
				setMessageIdentifier((Messageidentifier)newValue);
				return;
			case V41Package.UNH__COMMON_ACCESS_REF:
				setCommonAccessRef((String)newValue);
				return;
			case V41Package.UNH__TRANSFER_STATUS:
				setTransferStatus((Transferstatus)newValue);
				return;
			case V41Package.UNH__SUBSET:
				setSubset((Subset)newValue);
				return;
			case V41Package.UNH__IMPLEMENTATION_GUIDELINE:
				setImplementationGuideline((Implementationguideline)newValue);
				return;
			case V41Package.UNH__SCENARIO:
				setScenario((Scenario)newValue);
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
			case V41Package.UNH__MESSAGE_REF_NUM:
				setMessageRefNum(MESSAGE_REF_NUM_EDEFAULT);
				return;
			case V41Package.UNH__MESSAGE_IDENTIFIER:
				setMessageIdentifier((Messageidentifier)null);
				return;
			case V41Package.UNH__COMMON_ACCESS_REF:
				setCommonAccessRef(COMMON_ACCESS_REF_EDEFAULT);
				return;
			case V41Package.UNH__TRANSFER_STATUS:
				setTransferStatus((Transferstatus)null);
				return;
			case V41Package.UNH__SUBSET:
				setSubset((Subset)null);
				return;
			case V41Package.UNH__IMPLEMENTATION_GUIDELINE:
				setImplementationGuideline((Implementationguideline)null);
				return;
			case V41Package.UNH__SCENARIO:
				setScenario((Scenario)null);
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
			case V41Package.UNH__MESSAGE_REF_NUM:
				return MESSAGE_REF_NUM_EDEFAULT == null ? messageRefNum != null : !MESSAGE_REF_NUM_EDEFAULT.equals(messageRefNum);
			case V41Package.UNH__MESSAGE_IDENTIFIER:
				return messageIdentifier != null;
			case V41Package.UNH__COMMON_ACCESS_REF:
				return COMMON_ACCESS_REF_EDEFAULT == null ? commonAccessRef != null : !COMMON_ACCESS_REF_EDEFAULT.equals(commonAccessRef);
			case V41Package.UNH__TRANSFER_STATUS:
				return transferStatus != null;
			case V41Package.UNH__SUBSET:
				return subset != null;
			case V41Package.UNH__IMPLEMENTATION_GUIDELINE:
				return implementationGuideline != null;
			case V41Package.UNH__SCENARIO:
				return scenario != null;
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
		result.append(" (messageRefNum: ");
		result.append(messageRefNum);
		result.append(", commonAccessRef: ");
		result.append(commonAccessRef);
		result.append(')');
		return result.toString();
	}

} //UnhImpl
