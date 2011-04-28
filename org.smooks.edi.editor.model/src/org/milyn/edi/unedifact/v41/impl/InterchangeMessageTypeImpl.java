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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.milyn.edi.unedifact.v41.InterchangeMessageType;
import org.milyn.edi.unedifact.v41.Unh;
import org.milyn.edi.unedifact.v41.Unt;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interchange Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl#getUNH <em>UNH</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl#getUNT <em>UNT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterchangeMessageTypeImpl extends EObjectImpl implements InterchangeMessageType {
	/**
	 * The cached value of the '{@link #getUNH() <em>UNH</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNH()
	 * @generated
	 * @ordered
	 */
	protected Unh uNH;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The cached value of the '{@link #getUNT() <em>UNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNT()
	 * @generated
	 * @ordered
	 */
	protected Unt uNT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterchangeMessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.INTERCHANGE_MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unh getUNH() {
		return uNH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUNH(Unh newUNH, NotificationChain msgs) {
		Unh oldUNH = uNH;
		uNH = newUNH;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.INTERCHANGE_MESSAGE_TYPE__UNH, oldUNH, newUNH);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNH(Unh newUNH) {
		if (newUNH != uNH) {
			NotificationChain msgs = null;
			if (uNH != null)
				msgs = ((InternalEObject)uNH).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.INTERCHANGE_MESSAGE_TYPE__UNH, null, msgs);
			if (newUNH != null)
				msgs = ((InternalEObject)newUNH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.INTERCHANGE_MESSAGE_TYPE__UNH, null, msgs);
			msgs = basicSetUNH(newUNH, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.INTERCHANGE_MESSAGE_TYPE__UNH, newUNH, newUNH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V41Package.INTERCHANGE_MESSAGE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unt getUNT() {
		return uNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUNT(Unt newUNT, NotificationChain msgs) {
		Unt oldUNT = uNT;
		uNT = newUNT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.INTERCHANGE_MESSAGE_TYPE__UNT, oldUNT, newUNT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNT(Unt newUNT) {
		if (newUNT != uNT) {
			NotificationChain msgs = null;
			if (uNT != null)
				msgs = ((InternalEObject)uNT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.INTERCHANGE_MESSAGE_TYPE__UNT, null, msgs);
			if (newUNT != null)
				msgs = ((InternalEObject)newUNT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.INTERCHANGE_MESSAGE_TYPE__UNT, null, msgs);
			msgs = basicSetUNT(newUNT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.INTERCHANGE_MESSAGE_TYPE__UNT, newUNT, newUNT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNH:
				return basicSetUNH(null, msgs);
			case V41Package.INTERCHANGE_MESSAGE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNT:
				return basicSetUNT(null, msgs);
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
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNH:
				return getUNH();
			case V41Package.INTERCHANGE_MESSAGE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNT:
				return getUNT();
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
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNH:
				setUNH((Unh)newValue);
				return;
			case V41Package.INTERCHANGE_MESSAGE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNT:
				setUNT((Unt)newValue);
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
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNH:
				setUNH((Unh)null);
				return;
			case V41Package.INTERCHANGE_MESSAGE_TYPE__ANY:
				getAny().clear();
				return;
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNT:
				setUNT((Unt)null);
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
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNH:
				return uNH != null;
			case V41Package.INTERCHANGE_MESSAGE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case V41Package.INTERCHANGE_MESSAGE_TYPE__UNT:
				return uNT != null;
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //InterchangeMessageTypeImpl
