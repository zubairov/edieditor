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

import org.milyn.edi.unedifact.v41.Syntaxidentifier;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntaxidentifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl#getServiceCodeListDirVersion <em>Service Code List Dir Version</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl#getCodedCharacterEncoding <em>Coded Character Encoding</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl#getReleaseNum <em>Release Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyntaxidentifierImpl extends EObjectImpl implements Syntaxidentifier {
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
	 * The default value of the '{@link #getServiceCodeListDirVersion() <em>Service Code List Dir Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCodeListDirVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CODE_LIST_DIR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceCodeListDirVersion() <em>Service Code List Dir Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCodeListDirVersion()
	 * @generated
	 * @ordered
	 */
	protected String serviceCodeListDirVersion = SERVICE_CODE_LIST_DIR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodedCharacterEncoding() <em>Coded Character Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedCharacterEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_CHARACTER_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodedCharacterEncoding() <em>Coded Character Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedCharacterEncoding()
	 * @generated
	 * @ordered
	 */
	protected String codedCharacterEncoding = CODED_CHARACTER_ENCODING_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxidentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.SYNTAXIDENTIFIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SYNTAXIDENTIFIER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SYNTAXIDENTIFIER__VERSION_NUM, oldVersionNum, versionNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceCodeListDirVersion() {
		return serviceCodeListDirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCodeListDirVersion(String newServiceCodeListDirVersion) {
		String oldServiceCodeListDirVersion = serviceCodeListDirVersion;
		serviceCodeListDirVersion = newServiceCodeListDirVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION, oldServiceCodeListDirVersion, serviceCodeListDirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodedCharacterEncoding() {
		return codedCharacterEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodedCharacterEncoding(String newCodedCharacterEncoding) {
		String oldCodedCharacterEncoding = codedCharacterEncoding;
		codedCharacterEncoding = newCodedCharacterEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING, oldCodedCharacterEncoding, codedCharacterEncoding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.SYNTAXIDENTIFIER__RELEASE_NUM, oldReleaseNum, releaseNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.SYNTAXIDENTIFIER__ID:
				return getId();
			case V41Package.SYNTAXIDENTIFIER__VERSION_NUM:
				return getVersionNum();
			case V41Package.SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION:
				return getServiceCodeListDirVersion();
			case V41Package.SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING:
				return getCodedCharacterEncoding();
			case V41Package.SYNTAXIDENTIFIER__RELEASE_NUM:
				return getReleaseNum();
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
			case V41Package.SYNTAXIDENTIFIER__ID:
				setId((String)newValue);
				return;
			case V41Package.SYNTAXIDENTIFIER__VERSION_NUM:
				setVersionNum((String)newValue);
				return;
			case V41Package.SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION:
				setServiceCodeListDirVersion((String)newValue);
				return;
			case V41Package.SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING:
				setCodedCharacterEncoding((String)newValue);
				return;
			case V41Package.SYNTAXIDENTIFIER__RELEASE_NUM:
				setReleaseNum((String)newValue);
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
			case V41Package.SYNTAXIDENTIFIER__ID:
				setId(ID_EDEFAULT);
				return;
			case V41Package.SYNTAXIDENTIFIER__VERSION_NUM:
				setVersionNum(VERSION_NUM_EDEFAULT);
				return;
			case V41Package.SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION:
				setServiceCodeListDirVersion(SERVICE_CODE_LIST_DIR_VERSION_EDEFAULT);
				return;
			case V41Package.SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING:
				setCodedCharacterEncoding(CODED_CHARACTER_ENCODING_EDEFAULT);
				return;
			case V41Package.SYNTAXIDENTIFIER__RELEASE_NUM:
				setReleaseNum(RELEASE_NUM_EDEFAULT);
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
			case V41Package.SYNTAXIDENTIFIER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case V41Package.SYNTAXIDENTIFIER__VERSION_NUM:
				return VERSION_NUM_EDEFAULT == null ? versionNum != null : !VERSION_NUM_EDEFAULT.equals(versionNum);
			case V41Package.SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION:
				return SERVICE_CODE_LIST_DIR_VERSION_EDEFAULT == null ? serviceCodeListDirVersion != null : !SERVICE_CODE_LIST_DIR_VERSION_EDEFAULT.equals(serviceCodeListDirVersion);
			case V41Package.SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING:
				return CODED_CHARACTER_ENCODING_EDEFAULT == null ? codedCharacterEncoding != null : !CODED_CHARACTER_ENCODING_EDEFAULT.equals(codedCharacterEncoding);
			case V41Package.SYNTAXIDENTIFIER__RELEASE_NUM:
				return RELEASE_NUM_EDEFAULT == null ? releaseNum != null : !RELEASE_NUM_EDEFAULT.equals(releaseNum);
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
		result.append(", serviceCodeListDirVersion: ");
		result.append(serviceCodeListDirVersion);
		result.append(", codedCharacterEncoding: ");
		result.append(codedCharacterEncoding);
		result.append(", releaseNum: ");
		result.append(releaseNum);
		result.append(')');
		return result.toString();
	}

} //SyntaxidentifierImpl
