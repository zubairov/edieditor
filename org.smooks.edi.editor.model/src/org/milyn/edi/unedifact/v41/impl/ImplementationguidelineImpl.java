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

import org.milyn.edi.unedifact.v41.Implementationguideline;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementationguideline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl#getReleaseNum <em>Release Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl#getControllingAgencyCode <em>Controlling Agency Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationguidelineImpl extends EObjectImpl implements Implementationguideline {
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
	 * The default value of the '{@link #getControllingAgencyCode() <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllingAgencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLING_AGENCY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllingAgencyCode() <em>Controlling Agency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllingAgencyCode()
	 * @generated
	 * @ordered
	 */
	protected String controllingAgencyCode = CONTROLLING_AGENCY_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationguidelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.IMPLEMENTATIONGUIDELINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.IMPLEMENTATIONGUIDELINE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.IMPLEMENTATIONGUIDELINE__VERSION_NUM, oldVersionNum, versionNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.IMPLEMENTATIONGUIDELINE__RELEASE_NUM, oldReleaseNum, releaseNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllingAgencyCode() {
		return controllingAgencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllingAgencyCode(String newControllingAgencyCode) {
		String oldControllingAgencyCode = controllingAgencyCode;
		controllingAgencyCode = newControllingAgencyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE, oldControllingAgencyCode, controllingAgencyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.IMPLEMENTATIONGUIDELINE__ID:
				return getId();
			case V41Package.IMPLEMENTATIONGUIDELINE__VERSION_NUM:
				return getVersionNum();
			case V41Package.IMPLEMENTATIONGUIDELINE__RELEASE_NUM:
				return getReleaseNum();
			case V41Package.IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE:
				return getControllingAgencyCode();
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
			case V41Package.IMPLEMENTATIONGUIDELINE__ID:
				setId((String)newValue);
				return;
			case V41Package.IMPLEMENTATIONGUIDELINE__VERSION_NUM:
				setVersionNum((String)newValue);
				return;
			case V41Package.IMPLEMENTATIONGUIDELINE__RELEASE_NUM:
				setReleaseNum((String)newValue);
				return;
			case V41Package.IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE:
				setControllingAgencyCode((String)newValue);
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
			case V41Package.IMPLEMENTATIONGUIDELINE__ID:
				setId(ID_EDEFAULT);
				return;
			case V41Package.IMPLEMENTATIONGUIDELINE__VERSION_NUM:
				setVersionNum(VERSION_NUM_EDEFAULT);
				return;
			case V41Package.IMPLEMENTATIONGUIDELINE__RELEASE_NUM:
				setReleaseNum(RELEASE_NUM_EDEFAULT);
				return;
			case V41Package.IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE:
				setControllingAgencyCode(CONTROLLING_AGENCY_CODE_EDEFAULT);
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
			case V41Package.IMPLEMENTATIONGUIDELINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case V41Package.IMPLEMENTATIONGUIDELINE__VERSION_NUM:
				return VERSION_NUM_EDEFAULT == null ? versionNum != null : !VERSION_NUM_EDEFAULT.equals(versionNum);
			case V41Package.IMPLEMENTATIONGUIDELINE__RELEASE_NUM:
				return RELEASE_NUM_EDEFAULT == null ? releaseNum != null : !RELEASE_NUM_EDEFAULT.equals(releaseNum);
			case V41Package.IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE:
				return CONTROLLING_AGENCY_CODE_EDEFAULT == null ? controllingAgencyCode != null : !CONTROLLING_AGENCY_CODE_EDEFAULT.equals(controllingAgencyCode);
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
		result.append(", versionNum: ");
		result.append(versionNum);
		result.append(", releaseNum: ");
		result.append(releaseNum);
		result.append(", controllingAgencyCode: ");
		result.append(controllingAgencyCode);
		result.append(')');
		return result.toString();
	}

} //ImplementationguidelineImpl
