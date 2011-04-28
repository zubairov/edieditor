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

import org.milyn.edi.unedifact.v41.Messageversion;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messageversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageversionImpl#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageversionImpl#getReleaseNum <em>Release Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageversionImpl#getAssociationCode <em>Association Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageversionImpl extends EObjectImpl implements Messageversion {
	/**
	 * The default value of the '{@link #getVersionNum() <em>Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNum()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionNum() <em>Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNum()
	 * @generated
	 * @ordered
	 */
	protected String versionNum = VERSION_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseNum() <em>Release Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseNum()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseNum() <em>Release Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseNum()
	 * @generated
	 * @ordered
	 */
	protected String releaseNum = RELEASE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociationCode() <em>Association Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationCode() <em>Association Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationCode()
	 * @generated
	 * @ordered
	 */
	protected String associationCode = ASSOCIATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.MESSAGEVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionNum() {
		return versionNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNum(String newVersionNum) {
		String oldVersionNum = versionNum;
		versionNum = newVersionNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEVERSION__VERSION_NUM, oldVersionNum, versionNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleaseNum() {
		return releaseNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseNum(String newReleaseNum) {
		String oldReleaseNum = releaseNum;
		releaseNum = newReleaseNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEVERSION__RELEASE_NUM, oldReleaseNum, releaseNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationCode() {
		return associationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationCode(String newAssociationCode) {
		String oldAssociationCode = associationCode;
		associationCode = newAssociationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEVERSION__ASSOCIATION_CODE, oldAssociationCode, associationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.MESSAGEVERSION__VERSION_NUM:
				return getVersionNum();
			case V41Package.MESSAGEVERSION__RELEASE_NUM:
				return getReleaseNum();
			case V41Package.MESSAGEVERSION__ASSOCIATION_CODE:
				return getAssociationCode();
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
			case V41Package.MESSAGEVERSION__VERSION_NUM:
				setVersionNum((String)newValue);
				return;
			case V41Package.MESSAGEVERSION__RELEASE_NUM:
				setReleaseNum((String)newValue);
				return;
			case V41Package.MESSAGEVERSION__ASSOCIATION_CODE:
				setAssociationCode((String)newValue);
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
			case V41Package.MESSAGEVERSION__VERSION_NUM:
				setVersionNum(VERSION_NUM_EDEFAULT);
				return;
			case V41Package.MESSAGEVERSION__RELEASE_NUM:
				setReleaseNum(RELEASE_NUM_EDEFAULT);
				return;
			case V41Package.MESSAGEVERSION__ASSOCIATION_CODE:
				setAssociationCode(ASSOCIATION_CODE_EDEFAULT);
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
			case V41Package.MESSAGEVERSION__VERSION_NUM:
				return VERSION_NUM_EDEFAULT == null ? versionNum != null : !VERSION_NUM_EDEFAULT.equals(versionNum);
			case V41Package.MESSAGEVERSION__RELEASE_NUM:
				return RELEASE_NUM_EDEFAULT == null ? releaseNum != null : !RELEASE_NUM_EDEFAULT.equals(releaseNum);
			case V41Package.MESSAGEVERSION__ASSOCIATION_CODE:
				return ASSOCIATION_CODE_EDEFAULT == null ? associationCode != null : !ASSOCIATION_CODE_EDEFAULT.equals(associationCode);
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
		result.append(" (versionNum: ");
		result.append(versionNum);
		result.append(", releaseNum: ");
		result.append(releaseNum);
		result.append(", associationCode: ");
		result.append(associationCode);
		result.append(')');
		return result.toString();
	}

} //MessageversionImpl
