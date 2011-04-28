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

import org.milyn.edi.unedifact.v41.Transferstatus;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transferstatus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.TransferstatusImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.TransferstatusImpl#getFirstAndLast <em>First And Last</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransferstatusImpl extends EObjectImpl implements Transferstatus {
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected String sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstAndLast() <em>First And Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAndLast()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_AND_LAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstAndLast() <em>First And Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAndLast()
	 * @generated
	 * @ordered
	 */
	protected String firstAndLast = FIRST_AND_LAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferstatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.TRANSFERSTATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(String newSequence) {
		String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.TRANSFERSTATUS__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstAndLast() {
		return firstAndLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstAndLast(String newFirstAndLast) {
		String oldFirstAndLast = firstAndLast;
		firstAndLast = newFirstAndLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.TRANSFERSTATUS__FIRST_AND_LAST, oldFirstAndLast, firstAndLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.TRANSFERSTATUS__SEQUENCE:
				return getSequence();
			case V41Package.TRANSFERSTATUS__FIRST_AND_LAST:
				return getFirstAndLast();
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
			case V41Package.TRANSFERSTATUS__SEQUENCE:
				setSequence((String)newValue);
				return;
			case V41Package.TRANSFERSTATUS__FIRST_AND_LAST:
				setFirstAndLast((String)newValue);
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
			case V41Package.TRANSFERSTATUS__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case V41Package.TRANSFERSTATUS__FIRST_AND_LAST:
				setFirstAndLast(FIRST_AND_LAST_EDEFAULT);
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
			case V41Package.TRANSFERSTATUS__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
			case V41Package.TRANSFERSTATUS__FIRST_AND_LAST:
				return FIRST_AND_LAST_EDEFAULT == null ? firstAndLast != null : !FIRST_AND_LAST_EDEFAULT.equals(firstAndLast);
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
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(", firstAndLast: ");
		result.append(firstAndLast);
		result.append(')');
		return result.toString();
	}

} //TransferstatusImpl
