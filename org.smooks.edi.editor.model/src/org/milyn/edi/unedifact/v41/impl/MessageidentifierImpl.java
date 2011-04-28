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

import org.milyn.edi.unedifact.v41.Messageidentifier;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messageidentifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getReleaseNum <em>Release Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getControllingAgencyCode <em>Controlling Agency Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getAssociationAssignedCode <em>Association Assigned Code</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getCodeListDirVersionNum <em>Code List Dir Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl#getTypeSubFunctionId <em>Type Sub Function Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageidentifierImpl extends EObjectImpl implements Messageidentifier {
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
	 * The default value of the '{@link #getAssociationAssignedCode() <em>Association Assigned Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationAssignedCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_ASSIGNED_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationAssignedCode() <em>Association Assigned Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationAssignedCode()
	 * @generated
	 * @ordered
	 */
	protected String associationAssignedCode = ASSOCIATION_ASSIGNED_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListDirVersionNum() <em>Code List Dir Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListDirVersionNum()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_DIR_VERSION_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListDirVersionNum() <em>Code List Dir Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListDirVersionNum()
	 * @generated
	 * @ordered
	 */
	protected String codeListDirVersionNum = CODE_LIST_DIR_VERSION_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeSubFunctionId() <em>Type Sub Function Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSubFunctionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SUB_FUNCTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeSubFunctionId() <em>Type Sub Function Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSubFunctionId()
	 * @generated
	 * @ordered
	 */
	protected String typeSubFunctionId = TYPE_SUB_FUNCTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageidentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V41Package.Literals.MESSAGEIDENTIFIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__VERSION_NUM, oldVersionNum, versionNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__RELEASE_NUM, oldReleaseNum, releaseNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE, oldControllingAgencyCode, controllingAgencyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationAssignedCode() {
		return associationAssignedCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationAssignedCode(String newAssociationAssignedCode) {
		String oldAssociationAssignedCode = associationAssignedCode;
		associationAssignedCode = newAssociationAssignedCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE, oldAssociationAssignedCode, associationAssignedCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeListDirVersionNum() {
		return codeListDirVersionNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeListDirVersionNum(String newCodeListDirVersionNum) {
		String oldCodeListDirVersionNum = codeListDirVersionNum;
		codeListDirVersionNum = newCodeListDirVersionNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM, oldCodeListDirVersionNum, codeListDirVersionNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeSubFunctionId() {
		return typeSubFunctionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSubFunctionId(String newTypeSubFunctionId) {
		String oldTypeSubFunctionId = typeSubFunctionId;
		typeSubFunctionId = newTypeSubFunctionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V41Package.MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID, oldTypeSubFunctionId, typeSubFunctionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V41Package.MESSAGEIDENTIFIER__ID:
				return getId();
			case V41Package.MESSAGEIDENTIFIER__VERSION_NUM:
				return getVersionNum();
			case V41Package.MESSAGEIDENTIFIER__RELEASE_NUM:
				return getReleaseNum();
			case V41Package.MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE:
				return getControllingAgencyCode();
			case V41Package.MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE:
				return getAssociationAssignedCode();
			case V41Package.MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM:
				return getCodeListDirVersionNum();
			case V41Package.MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID:
				return getTypeSubFunctionId();
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
			case V41Package.MESSAGEIDENTIFIER__ID:
				setId((String)newValue);
				return;
			case V41Package.MESSAGEIDENTIFIER__VERSION_NUM:
				setVersionNum((String)newValue);
				return;
			case V41Package.MESSAGEIDENTIFIER__RELEASE_NUM:
				setReleaseNum((String)newValue);
				return;
			case V41Package.MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE:
				setControllingAgencyCode((String)newValue);
				return;
			case V41Package.MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE:
				setAssociationAssignedCode((String)newValue);
				return;
			case V41Package.MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM:
				setCodeListDirVersionNum((String)newValue);
				return;
			case V41Package.MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID:
				setTypeSubFunctionId((String)newValue);
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
			case V41Package.MESSAGEIDENTIFIER__ID:
				setId(ID_EDEFAULT);
				return;
			case V41Package.MESSAGEIDENTIFIER__VERSION_NUM:
				setVersionNum(VERSION_NUM_EDEFAULT);
				return;
			case V41Package.MESSAGEIDENTIFIER__RELEASE_NUM:
				setReleaseNum(RELEASE_NUM_EDEFAULT);
				return;
			case V41Package.MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE:
				setControllingAgencyCode(CONTROLLING_AGENCY_CODE_EDEFAULT);
				return;
			case V41Package.MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE:
				setAssociationAssignedCode(ASSOCIATION_ASSIGNED_CODE_EDEFAULT);
				return;
			case V41Package.MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM:
				setCodeListDirVersionNum(CODE_LIST_DIR_VERSION_NUM_EDEFAULT);
				return;
			case V41Package.MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID:
				setTypeSubFunctionId(TYPE_SUB_FUNCTION_ID_EDEFAULT);
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
			case V41Package.MESSAGEIDENTIFIER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case V41Package.MESSAGEIDENTIFIER__VERSION_NUM:
				return VERSION_NUM_EDEFAULT == null ? versionNum != null : !VERSION_NUM_EDEFAULT.equals(versionNum);
			case V41Package.MESSAGEIDENTIFIER__RELEASE_NUM:
				return RELEASE_NUM_EDEFAULT == null ? releaseNum != null : !RELEASE_NUM_EDEFAULT.equals(releaseNum);
			case V41Package.MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE:
				return CONTROLLING_AGENCY_CODE_EDEFAULT == null ? controllingAgencyCode != null : !CONTROLLING_AGENCY_CODE_EDEFAULT.equals(controllingAgencyCode);
			case V41Package.MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE:
				return ASSOCIATION_ASSIGNED_CODE_EDEFAULT == null ? associationAssignedCode != null : !ASSOCIATION_ASSIGNED_CODE_EDEFAULT.equals(associationAssignedCode);
			case V41Package.MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM:
				return CODE_LIST_DIR_VERSION_NUM_EDEFAULT == null ? codeListDirVersionNum != null : !CODE_LIST_DIR_VERSION_NUM_EDEFAULT.equals(codeListDirVersionNum);
			case V41Package.MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID:
				return TYPE_SUB_FUNCTION_ID_EDEFAULT == null ? typeSubFunctionId != null : !TYPE_SUB_FUNCTION_ID_EDEFAULT.equals(typeSubFunctionId);
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
		result.append(", associationAssignedCode: ");
		result.append(associationAssignedCode);
		result.append(", codeListDirVersionNum: ");
		result.append(codeListDirVersionNum);
		result.append(", typeSubFunctionId: ");
		result.append(typeSubFunctionId);
		result.append(')');
		return result.toString();
	}

} //MessageidentifierImpl
