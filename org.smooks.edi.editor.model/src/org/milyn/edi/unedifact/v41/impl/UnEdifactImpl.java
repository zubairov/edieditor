/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.milyn.edi.unedifact.v41.InterchangeMessageType;
import org.milyn.edi.unedifact.v41.UnEdifact;
import org.milyn.edi.unedifact.v41.Unb;
import org.milyn.edi.unedifact.v41.Unz;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Un Edifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnEdifactImpl#getUNB <em>UNB</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnEdifactImpl#getInterchangeMessage <em>Interchange Message</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.UnEdifactImpl#getUNZ <em>UNZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnEdifactImpl extends EObjectImpl implements UnEdifact {
	/**
	 * The cached value of the '{@link #getUNB() <em>UNB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNB()
	 * @generated
	 * @ordered
	 */
	protected Unb uNB;

	/**
	 * The cached value of the '{@link #getInterchangeMessage() <em>Interchange Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterchangeMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<InterchangeMessageType> interchangeMessage;

	/**
	 * The cached value of the '{@link #getUNZ() <em>UNZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNZ()
	 * @generated
	 * @ordered
	 */
	protected Unz uNZ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnEdifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.UN_EDIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unb getUNB() {
		return uNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUNB(Unb newUNB, NotificationChain msgs) {
		Unb oldUNB = uNB;
		uNB = newUNB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UN_EDIFACT__UNB, oldUNB, newUNB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNB(Unb newUNB) {
		if (newUNB != uNB) {
			NotificationChain msgs = null;
			if (uNB != null)
				msgs = ((InternalEObject)uNB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UN_EDIFACT__UNB, null, msgs);
			if (newUNB != null)
				msgs = ((InternalEObject)newUNB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UN_EDIFACT__UNB, null, msgs);
			msgs = basicSetUNB(newUNB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UN_EDIFACT__UNB, newUNB, newUNB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterchangeMessageType> getInterchangeMessage() {
		if (interchangeMessage == null) {
			interchangeMessage = new EObjectContainmentEList<InterchangeMessageType>(InterchangeMessageType.class, this, V41Package.UN_EDIFACT__INTERCHANGE_MESSAGE);
		}
		return interchangeMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unz getUNZ() {
		return uNZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUNZ(Unz newUNZ, NotificationChain msgs) {
		Unz oldUNZ = uNZ;
		uNZ = newUNZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V41Package.UN_EDIFACT__UNZ, oldUNZ, newUNZ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNZ(Unz newUNZ) {
		if (newUNZ != uNZ) {
			NotificationChain msgs = null;
			if (uNZ != null)
				msgs = ((InternalEObject)uNZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V41Package.UN_EDIFACT__UNZ, null, msgs);
			if (newUNZ != null)
				msgs = ((InternalEObject)newUNZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V41Package.UN_EDIFACT__UNZ, null, msgs);
			msgs = basicSetUNZ(newUNZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.UN_EDIFACT__UNZ, newUNZ, newUNZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V41Package.UN_EDIFACT__UNB:
				return basicSetUNB(null, msgs);
			case V41Package.UN_EDIFACT__INTERCHANGE_MESSAGE:
				return ((InternalEList<?>)getInterchangeMessage()).basicRemove(otherEnd, msgs);
			case V41Package.UN_EDIFACT__UNZ:
				return basicSetUNZ(null, msgs);
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
			case V41Package.UN_EDIFACT__UNB:
				return getUNB();
			case V41Package.UN_EDIFACT__INTERCHANGE_MESSAGE:
				return getInterchangeMessage();
			case V41Package.UN_EDIFACT__UNZ:
				return getUNZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V41Package.UN_EDIFACT__UNB:
				setUNB((Unb)newValue);
				return;
			case V41Package.UN_EDIFACT__INTERCHANGE_MESSAGE:
				getInterchangeMessage().clear();
				getInterchangeMessage().addAll((Collection<? extends InterchangeMessageType>)newValue);
				return;
			case V41Package.UN_EDIFACT__UNZ:
				setUNZ((Unz)newValue);
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
			case V41Package.UN_EDIFACT__UNB:
				setUNB((Unb)null);
				return;
			case V41Package.UN_EDIFACT__INTERCHANGE_MESSAGE:
				getInterchangeMessage().clear();
				return;
			case V41Package.UN_EDIFACT__UNZ:
				setUNZ((Unz)null);
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
			case V41Package.UN_EDIFACT__UNB:
				return uNB != null;
			case V41Package.UN_EDIFACT__INTERCHANGE_MESSAGE:
				return interchangeMessage != null && !interchangeMessage.isEmpty();
			case V41Package.UN_EDIFACT__UNZ:
				return uNZ != null;
		}
		return super.eIsSet(featureID);
	}

} //UnEdifactImpl
