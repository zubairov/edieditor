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

import org.milyn.edi.unedifact.v41.Recipientref;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipientref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.RecipientrefImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.RecipientrefImpl#getRefQualifier <em>Ref Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipientrefImpl extends EObjectImpl implements Recipientref {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefQualifier() <em>Ref Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefQualifier() <em>Ref Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefQualifier()
	 * @generated
	 * @ordered
	 */
	protected String refQualifier = REF_QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipientrefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.RECIPIENTREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.RECIPIENTREF__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefQualifier() {
		return refQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefQualifier(String newRefQualifier) {
		String oldRefQualifier = refQualifier;
		refQualifier = newRefQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.RECIPIENTREF__REF_QUALIFIER, oldRefQualifier, refQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.RECIPIENTREF__REF:
				return getRef();
			case V41Package.RECIPIENTREF__REF_QUALIFIER:
				return getRefQualifier();
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
			case V41Package.RECIPIENTREF__REF:
				setRef((String)newValue);
				return;
			case V41Package.RECIPIENTREF__REF_QUALIFIER:
				setRefQualifier((String)newValue);
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
			case V41Package.RECIPIENTREF__REF:
				setRef(REF_EDEFAULT);
				return;
			case V41Package.RECIPIENTREF__REF_QUALIFIER:
				setRefQualifier(REF_QUALIFIER_EDEFAULT);
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
			case V41Package.RECIPIENTREF__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case V41Package.RECIPIENTREF__REF_QUALIFIER:
				return REF_QUALIFIER_EDEFAULT == null ? refQualifier != null : !REF_QUALIFIER_EDEFAULT.equals(refQualifier);
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(", refQualifier: ");
		result.append(refQualifier);
		result.append(')');
		return result.toString();
	}

} //RecipientrefImpl
