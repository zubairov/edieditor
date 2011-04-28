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

import org.milyn.edi.unedifact.v41.Une;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Une</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UneImpl#getControlCount <em>Control Count</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UneImpl#getGroupRef <em>Group Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UneImpl extends EObjectImpl implements Une {
	/**
	 * The default value of the '{@link #getControlCount() <em>Control Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlCount()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlCount() <em>Control Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlCount()
	 * @generated
	 * @ordered
	 */
	protected String controlCount = CONTROL_COUNT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.UNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlCount() {
		return controlCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlCount(String newControlCount) {
		String oldControlCount = controlCount;
		controlCount = newControlCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNE__CONTROL_COUNT, oldControlCount, controlCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UNE__GROUP_REF, oldGroupRef, groupRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.UNE__CONTROL_COUNT:
				return getControlCount();
			case V41Package.UNE__GROUP_REF:
				return getGroupRef();
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
			case V41Package.UNE__CONTROL_COUNT:
				setControlCount((String)newValue);
				return;
			case V41Package.UNE__GROUP_REF:
				setGroupRef((String)newValue);
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
			case V41Package.UNE__CONTROL_COUNT:
				setControlCount(CONTROL_COUNT_EDEFAULT);
				return;
			case V41Package.UNE__GROUP_REF:
				setGroupRef(GROUP_REF_EDEFAULT);
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
			case V41Package.UNE__CONTROL_COUNT:
				return CONTROL_COUNT_EDEFAULT == null ? controlCount != null : !CONTROL_COUNT_EDEFAULT.equals(controlCount);
			case V41Package.UNE__GROUP_REF:
				return GROUP_REF_EDEFAULT == null ? groupRef != null : !GROUP_REF_EDEFAULT.equals(groupRef);
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
		result.append(" (controlCount: ");
		result.append(controlCount);
		result.append(", groupRef: ");
		result.append(groupRef);
		result.append(')');
		return result.toString();
	}

} //UneImpl
