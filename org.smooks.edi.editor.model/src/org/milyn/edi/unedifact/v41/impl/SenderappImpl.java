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

import org.milyn.edi.unedifact.v41.Senderapp;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Senderapp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SenderappImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SenderappImpl#getCodeQualifier <em>Code Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderappImpl extends EObjectImpl implements Senderapp {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeQualifier() <em>Code Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeQualifier() <em>Code Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeQualifier()
	 * @generated
	 * @ordered
	 */
	protected String codeQualifier = CODE_QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderappImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.SENDERAPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SENDERAPP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeQualifier() {
		return codeQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeQualifier(String newCodeQualifier) {
		String oldCodeQualifier = codeQualifier;
		codeQualifier = newCodeQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SENDERAPP__CODE_QUALIFIER, oldCodeQualifier, codeQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.SENDERAPP__ID:
				return getId();
			case V41Package.SENDERAPP__CODE_QUALIFIER:
				return getCodeQualifier();
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
			case V41Package.SENDERAPP__ID:
				setId((String)newValue);
				return;
			case V41Package.SENDERAPP__CODE_QUALIFIER:
				setCodeQualifier((String)newValue);
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
			case V41Package.SENDERAPP__ID:
				setId(ID_EDEFAULT);
				return;
			case V41Package.SENDERAPP__CODE_QUALIFIER:
				setCodeQualifier(CODE_QUALIFIER_EDEFAULT);
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
			case V41Package.SENDERAPP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case V41Package.SENDERAPP__CODE_QUALIFIER:
				return CODE_QUALIFIER_EDEFAULT == null ? codeQualifier != null : !CODE_QUALIFIER_EDEFAULT.equals(codeQualifier);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", codeQualifier: ");
		result.append(codeQualifier);
		result.append(')');
		return result.toString();
	}

} //SenderappImpl
