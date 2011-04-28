/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.milyn.edi.unedifact.v41.Unt;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UntImpl#getSegmentCount <em>Segment Count</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UntImpl#getMessageRefNum <em>Message Ref Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UntImpl extends EObjectImpl implements Unt {
	/**
	 * The default value of the '{@link #getSegmentCount() <em>Segment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentCount()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentCount() <em>Segment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentCount()
	 * @generated
	 * @ordered
	 */
	protected String segmentCount = SEGMENT_COUNT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UntImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.UNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSegmentCount() {
		return segmentCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentCount(String newSegmentCount) {
		String oldSegmentCount = segmentCount;
		segmentCount = newSegmentCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNT__SEGMENT_COUNT, oldSegmentCount, segmentCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNT__MESSAGE_REF_NUM, oldMessageRefNum, messageRefNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.UNT__SEGMENT_COUNT:
				return getSegmentCount();
			case V41Package.UNT__MESSAGE_REF_NUM:
				return getMessageRefNum();
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
			case V41Package.UNT__SEGMENT_COUNT:
				setSegmentCount((String)newValue);
				return;
			case V41Package.UNT__MESSAGE_REF_NUM:
				setMessageRefNum((String)newValue);
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
			case V41Package.UNT__SEGMENT_COUNT:
				setSegmentCount(SEGMENT_COUNT_EDEFAULT);
				return;
			case V41Package.UNT__MESSAGE_REF_NUM:
				setMessageRefNum(MESSAGE_REF_NUM_EDEFAULT);
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
			case V41Package.UNT__SEGMENT_COUNT:
				return SEGMENT_COUNT_EDEFAULT == null ? segmentCount != null : !SEGMENT_COUNT_EDEFAULT.equals(segmentCount);
			case V41Package.UNT__MESSAGE_REF_NUM:
				return MESSAGE_REF_NUM_EDEFAULT == null ? messageRefNum != null : !MESSAGE_REF_NUM_EDEFAULT.equals(messageRefNum);
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
		result.append(" (segmentCount: ");
		result.append(segmentCount);
		result.append(", messageRefNum: ");
		result.append(messageRefNum);
		result.append(')');
		return result.toString();
	}

} //UntImpl
