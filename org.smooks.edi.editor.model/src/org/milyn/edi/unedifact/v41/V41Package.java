/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.milyn.edi.unedifact.v41.V41Factory
 * @model kind="package"
 * @generated
 */
public interface V41Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "v41";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.milyn.edi.unedifact.v41";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "v41";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	V41Package eINSTANCE = org.milyn.edi.unedifact.v41.impl.V41PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.DatetimeImpl <em>Datetime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.DatetimeImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME__DATE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME__TIME = 1;

	/**
	 * The number of structural features of the '<em>Datetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.DocumentRootImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Un Edifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UN_EDIFACT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl <em>Implementationguideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getImplementationguideline()
	 * @generated
	 */
	int IMPLEMENTATIONGUIDELINE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATIONGUIDELINE__ID = 0;

	/**
	 * The feature id for the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATIONGUIDELINE__VERSION_NUM = 1;

	/**
	 * The feature id for the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATIONGUIDELINE__RELEASE_NUM = 2;

	/**
	 * The feature id for the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE = 3;

	/**
	 * The number of structural features of the '<em>Implementationguideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATIONGUIDELINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl <em>Interchange Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getInterchangeMessageType()
	 * @generated
	 */
	int INTERCHANGE_MESSAGE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>UNH</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCHANGE_MESSAGE_TYPE__UNH = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCHANGE_MESSAGE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>UNT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCHANGE_MESSAGE_TYPE__UNT = 2;

	/**
	 * The number of structural features of the '<em>Interchange Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCHANGE_MESSAGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl <em>Messageidentifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getMessageidentifier()
	 * @generated
	 */
	int MESSAGEIDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__VERSION_NUM = 1;

	/**
	 * The feature id for the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__RELEASE_NUM = 2;

	/**
	 * The feature id for the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Association Assigned Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE = 4;

	/**
	 * The feature id for the '<em><b>Code List Dir Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM = 5;

	/**
	 * The feature id for the '<em><b>Type Sub Function Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID = 6;

	/**
	 * The number of structural features of the '<em>Messageidentifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEIDENTIFIER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.MessageversionImpl <em>Messageversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.MessageversionImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getMessageversion()
	 * @generated
	 */
	int MESSAGEVERSION = 5;

	/**
	 * The feature id for the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEVERSION__VERSION_NUM = 0;

	/**
	 * The feature id for the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEVERSION__RELEASE_NUM = 1;

	/**
	 * The feature id for the '<em><b>Association Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEVERSION__ASSOCIATION_CODE = 2;

	/**
	 * The number of structural features of the '<em>Messageversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEVERSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.RecipientImpl <em>Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.RecipientImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getRecipient()
	 * @generated
	 */
	int RECIPIENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Code Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__CODE_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__INTERNAL_ID = 2;

	/**
	 * The feature id for the '<em><b>Internal Sub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__INTERNAL_SUB_ID = 3;

	/**
	 * The number of structural features of the '<em>Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.RecipientappImpl <em>Recipientapp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.RecipientappImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getRecipientapp()
	 * @generated
	 */
	int RECIPIENTAPP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENTAPP__ID = 0;

	/**
	 * The feature id for the '<em><b>Code Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENTAPP__CODE_QUALIFIER = 1;

	/**
	 * The number of structural features of the '<em>Recipientapp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENTAPP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.RecipientrefImpl <em>Recipientref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.RecipientrefImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getRecipientref()
	 * @generated
	 */
	int RECIPIENTREF = 8;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENTREF__REF = 0;

	/**
	 * The feature id for the '<em><b>Ref Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENTREF__REF_QUALIFIER = 1;

	/**
	 * The number of structural features of the '<em>Recipientref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENTREF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.ScenarioImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = 0;

	/**
	 * The feature id for the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VERSION_NUM = 1;

	/**
	 * The feature id for the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RELEASE_NUM = 2;

	/**
	 * The feature id for the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTROLLING_AGENCY_CODE = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.SenderImpl <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.SenderImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Code Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__CODE_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__INTERNAL_ID = 2;

	/**
	 * The feature id for the '<em><b>Internal Sub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__INTERNAL_SUB_ID = 3;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.SenderappImpl <em>Senderapp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.SenderappImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSenderapp()
	 * @generated
	 */
	int SENDERAPP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERAPP__ID = 0;

	/**
	 * The feature id for the '<em><b>Code Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERAPP__CODE_QUALIFIER = 1;

	/**
	 * The number of structural features of the '<em>Senderapp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDERAPP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.SubsetImpl <em>Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.SubsetImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSubset()
	 * @generated
	 */
	int SUBSET = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__ID = 0;

	/**
	 * The feature id for the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__VERSION_NUM = 1;

	/**
	 * The feature id for the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__RELEASE_NUM = 2;

	/**
	 * The feature id for the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__CONTROLLING_AGENCY_CODE = 3;

	/**
	 * The number of structural features of the '<em>Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl <em>Syntaxidentifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSyntaxidentifier()
	 * @generated
	 */
	int SYNTAXIDENTIFIER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAXIDENTIFIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAXIDENTIFIER__VERSION_NUM = 1;

	/**
	 * The feature id for the '<em><b>Service Code List Dir Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Coded Character Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING = 3;

	/**
	 * The feature id for the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAXIDENTIFIER__RELEASE_NUM = 4;

	/**
	 * The number of structural features of the '<em>Syntaxidentifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAXIDENTIFIER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.TransferstatusImpl <em>Transferstatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.TransferstatusImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getTransferstatus()
	 * @generated
	 */
	int TRANSFERSTATUS = 14;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERSTATUS__SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>First And Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERSTATUS__FIRST_AND_LAST = 1;

	/**
	 * The number of structural features of the '<em>Transferstatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERSTATUS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UnbImpl <em>Unb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UnbImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnb()
	 * @generated
	 */
	int UNB = 15;

	/**
	 * The feature id for the '<em><b>Syntax Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__SYNTAX_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__SENDER = 1;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__RECIPIENT = 2;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__DATE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Control Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__CONTROL_REF = 4;

	/**
	 * The feature id for the '<em><b>Recipient Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__RECIPIENT_REF = 5;

	/**
	 * The feature id for the '<em><b>Application Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__APPLICATION_REF = 6;

	/**
	 * The feature id for the '<em><b>Processing Priority Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__PROCESSING_PRIORITY_CODE = 7;

	/**
	 * The feature id for the '<em><b>Ack Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__ACK_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__AGREEMENT_ID = 9;

	/**
	 * The feature id for the '<em><b>Test Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB__TEST_INDICATOR = 10;

	/**
	 * The number of structural features of the '<em>Unb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNB_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UneImpl <em>Une</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UneImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUne()
	 * @generated
	 */
	int UNE = 16;

	/**
	 * The feature id for the '<em><b>Control Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNE__CONTROL_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Group Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNE__GROUP_REF = 1;

	/**
	 * The number of structural features of the '<em>Une</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UnEdifactImpl <em>Un Edifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UnEdifactImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnEdifact()
	 * @generated
	 */
	int UN_EDIFACT = 17;

	/**
	 * The feature id for the '<em><b>UNB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_EDIFACT__UNB = 0;

	/**
	 * The feature id for the '<em><b>Interchange Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_EDIFACT__INTERCHANGE_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>UNZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_EDIFACT__UNZ = 2;

	/**
	 * The number of structural features of the '<em>Un Edifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_EDIFACT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UngImpl <em>Ung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UngImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUng()
	 * @generated
	 */
	int UNG = 18;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Sender App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__SENDER_APP = 1;

	/**
	 * The feature id for the '<em><b>Recipient App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__RECIPIENT_APP = 2;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__DATE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Group Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__GROUP_REF = 4;

	/**
	 * The feature id for the '<em><b>Controlling Agency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__CONTROLLING_AGENCY_CODE = 5;

	/**
	 * The feature id for the '<em><b>Message Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__MESSAGE_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Application Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG__APPLICATION_PASSWORD = 7;

	/**
	 * The number of structural features of the '<em>Ung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNG_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UnhImpl <em>Unh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UnhImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnh()
	 * @generated
	 */
	int UNH = 19;

	/**
	 * The feature id for the '<em><b>Message Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__MESSAGE_REF_NUM = 0;

	/**
	 * The feature id for the '<em><b>Message Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__MESSAGE_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Common Access Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__COMMON_ACCESS_REF = 2;

	/**
	 * The feature id for the '<em><b>Transfer Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__TRANSFER_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__SUBSET = 4;

	/**
	 * The feature id for the '<em><b>Implementation Guideline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__IMPLEMENTATION_GUIDELINE = 5;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH__SCENARIO = 6;

	/**
	 * The number of structural features of the '<em>Unh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNH_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UntImpl <em>Unt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UntImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnt()
	 * @generated
	 */
	int UNT = 20;

	/**
	 * The feature id for the '<em><b>Segment Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNT__SEGMENT_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Message Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNT__MESSAGE_REF_NUM = 1;

	/**
	 * The number of structural features of the '<em>Unt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.milyn.edi.unedifact.v41.impl.UnzImpl <em>Unz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.milyn.edi.unedifact.v41.impl.UnzImpl
	 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnz()
	 * @generated
	 */
	int UNZ = 21;

	/**
	 * The feature id for the '<em><b>Control Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZ__CONTROL_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Control Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZ__CONTROL_REF = 1;

	/**
	 * The number of structural features of the '<em>Unz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZ_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Datetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime</em>'.
	 * @see org.milyn.edi.unedifact.v41.Datetime
	 * @generated
	 */
	EClass getDatetime();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Datetime#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.milyn.edi.unedifact.v41.Datetime#getDate()
	 * @see #getDatetime()
	 * @generated
	 */
	EAttribute getDatetime_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Datetime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.milyn.edi.unedifact.v41.Datetime#getTime()
	 * @see #getDatetime()
	 * @generated
	 */
	EAttribute getDatetime_Time();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.milyn.edi.unedifact.v41.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.milyn.edi.unedifact.v41.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.milyn.edi.unedifact.v41.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.milyn.edi.unedifact.v41.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.milyn.edi.unedifact.v41.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.milyn.edi.unedifact.v41.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.milyn.edi.unedifact.v41.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.DocumentRoot#getUnEdifact <em>Un Edifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Un Edifact</em>'.
	 * @see org.milyn.edi.unedifact.v41.DocumentRoot#getUnEdifact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnEdifact();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Implementationguideline <em>Implementationguideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementationguideline</em>'.
	 * @see org.milyn.edi.unedifact.v41.Implementationguideline
	 * @generated
	 */
	EClass getImplementationguideline();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Implementationguideline#getId()
	 * @see #getImplementationguideline()
	 * @generated
	 */
	EAttribute getImplementationguideline_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getVersionNum <em>Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Implementationguideline#getVersionNum()
	 * @see #getImplementationguideline()
	 * @generated
	 */
	EAttribute getImplementationguideline_VersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getReleaseNum <em>Release Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Implementationguideline#getReleaseNum()
	 * @see #getImplementationguideline()
	 * @generated
	 */
	EAttribute getImplementationguideline_ReleaseNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Implementationguideline#getControllingAgencyCode <em>Controlling Agency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlling Agency Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Implementationguideline#getControllingAgencyCode()
	 * @see #getImplementationguideline()
	 * @generated
	 */
	EAttribute getImplementationguideline_ControllingAgencyCode();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType <em>Interchange Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interchange Message Type</em>'.
	 * @see org.milyn.edi.unedifact.v41.InterchangeMessageType
	 * @generated
	 */
	EClass getInterchangeMessageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNH <em>UNH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UNH</em>'.
	 * @see org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNH()
	 * @see #getInterchangeMessageType()
	 * @generated
	 */
	EReference getInterchangeMessageType_UNH();

	/**
	 * Returns the meta object for the attribute list '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.milyn.edi.unedifact.v41.InterchangeMessageType#getAny()
	 * @see #getInterchangeMessageType()
	 * @generated
	 */
	EAttribute getInterchangeMessageType_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNT <em>UNT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UNT</em>'.
	 * @see org.milyn.edi.unedifact.v41.InterchangeMessageType#getUNT()
	 * @see #getInterchangeMessageType()
	 * @generated
	 */
	EReference getInterchangeMessageType_UNT();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Messageidentifier <em>Messageidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messageidentifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier
	 * @generated
	 */
	EClass getMessageidentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getId()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getVersionNum <em>Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getVersionNum()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_VersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getReleaseNum <em>Release Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getReleaseNum()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_ReleaseNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getControllingAgencyCode <em>Controlling Agency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlling Agency Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getControllingAgencyCode()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_ControllingAgencyCode();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getAssociationAssignedCode <em>Association Assigned Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Assigned Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getAssociationAssignedCode()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_AssociationAssignedCode();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getCodeListDirVersionNum <em>Code List Dir Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code List Dir Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getCodeListDirVersionNum()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_CodeListDirVersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageidentifier#getTypeSubFunctionId <em>Type Sub Function Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Sub Function Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier#getTypeSubFunctionId()
	 * @see #getMessageidentifier()
	 * @generated
	 */
	EAttribute getMessageidentifier_TypeSubFunctionId();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Messageversion <em>Messageversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messageversion</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageversion
	 * @generated
	 */
	EClass getMessageversion();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageversion#getVersionNum <em>Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageversion#getVersionNum()
	 * @see #getMessageversion()
	 * @generated
	 */
	EAttribute getMessageversion_VersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageversion#getReleaseNum <em>Release Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageversion#getReleaseNum()
	 * @see #getMessageversion()
	 * @generated
	 */
	EAttribute getMessageversion_ReleaseNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Messageversion#getAssociationCode <em>Association Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Messageversion#getAssociationCode()
	 * @see #getMessageversion()
	 * @generated
	 */
	EAttribute getMessageversion_AssociationCode();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Recipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipient</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipient
	 * @generated
	 */
	EClass getRecipient();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipient#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipient#getId()
	 * @see #getRecipient()
	 * @generated
	 */
	EAttribute getRecipient_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipient#getCodeQualifier <em>Code Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Qualifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipient#getCodeQualifier()
	 * @see #getRecipient()
	 * @generated
	 */
	EAttribute getRecipient_CodeQualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipient#getInternalId <em>Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipient#getInternalId()
	 * @see #getRecipient()
	 * @generated
	 */
	EAttribute getRecipient_InternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipient#getInternalSubId <em>Internal Sub Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Sub Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipient#getInternalSubId()
	 * @see #getRecipient()
	 * @generated
	 */
	EAttribute getRecipient_InternalSubId();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Recipientapp <em>Recipientapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipientapp</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipientapp
	 * @generated
	 */
	EClass getRecipientapp();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipientapp#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipientapp#getId()
	 * @see #getRecipientapp()
	 * @generated
	 */
	EAttribute getRecipientapp_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipientapp#getCodeQualifier <em>Code Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Qualifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipientapp#getCodeQualifier()
	 * @see #getRecipientapp()
	 * @generated
	 */
	EAttribute getRecipientapp_CodeQualifier();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Recipientref <em>Recipientref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipientref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipientref
	 * @generated
	 */
	EClass getRecipientref();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipientref#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipientref#getRef()
	 * @see #getRecipientref()
	 * @generated
	 */
	EAttribute getRecipientref_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Recipientref#getRefQualifier <em>Ref Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Qualifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Recipientref#getRefQualifier()
	 * @see #getRecipientref()
	 * @generated
	 */
	EAttribute getRecipientref_RefQualifier();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.milyn.edi.unedifact.v41.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Scenario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Scenario#getId()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Scenario#getVersionNum <em>Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Scenario#getVersionNum()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_VersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Scenario#getReleaseNum <em>Release Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Scenario#getReleaseNum()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ReleaseNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Scenario#getControllingAgencyCode <em>Controlling Agency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlling Agency Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Scenario#getControllingAgencyCode()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ControllingAgencyCode();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see org.milyn.edi.unedifact.v41.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Sender#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Sender#getId()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Sender#getCodeQualifier <em>Code Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Qualifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Sender#getCodeQualifier()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_CodeQualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Sender#getInternalId <em>Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Sender#getInternalId()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_InternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Sender#getInternalSubId <em>Internal Sub Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Sub Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Sender#getInternalSubId()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_InternalSubId();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Senderapp <em>Senderapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Senderapp</em>'.
	 * @see org.milyn.edi.unedifact.v41.Senderapp
	 * @generated
	 */
	EClass getSenderapp();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Senderapp#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Senderapp#getId()
	 * @see #getSenderapp()
	 * @generated
	 */
	EAttribute getSenderapp_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Senderapp#getCodeQualifier <em>Code Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Qualifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Senderapp#getCodeQualifier()
	 * @see #getSenderapp()
	 * @generated
	 */
	EAttribute getSenderapp_CodeQualifier();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Subset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subset</em>'.
	 * @see org.milyn.edi.unedifact.v41.Subset
	 * @generated
	 */
	EClass getSubset();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Subset#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Subset#getId()
	 * @see #getSubset()
	 * @generated
	 */
	EAttribute getSubset_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Subset#getVersionNum <em>Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Subset#getVersionNum()
	 * @see #getSubset()
	 * @generated
	 */
	EAttribute getSubset_VersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Subset#getReleaseNum <em>Release Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Subset#getReleaseNum()
	 * @see #getSubset()
	 * @generated
	 */
	EAttribute getSubset_ReleaseNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Subset#getControllingAgencyCode <em>Controlling Agency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlling Agency Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Subset#getControllingAgencyCode()
	 * @see #getSubset()
	 * @generated
	 */
	EAttribute getSubset_ControllingAgencyCode();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier <em>Syntaxidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntaxidentifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier
	 * @generated
	 */
	EClass getSyntaxidentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier#getId()
	 * @see #getSyntaxidentifier()
	 * @generated
	 */
	EAttribute getSyntaxidentifier_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getVersionNum <em>Version Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier#getVersionNum()
	 * @see #getSyntaxidentifier()
	 * @generated
	 */
	EAttribute getSyntaxidentifier_VersionNum();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getServiceCodeListDirVersion <em>Service Code List Dir Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Code List Dir Version</em>'.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier#getServiceCodeListDirVersion()
	 * @see #getSyntaxidentifier()
	 * @generated
	 */
	EAttribute getSyntaxidentifier_ServiceCodeListDirVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getCodedCharacterEncoding <em>Coded Character Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coded Character Encoding</em>'.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier#getCodedCharacterEncoding()
	 * @see #getSyntaxidentifier()
	 * @generated
	 */
	EAttribute getSyntaxidentifier_CodedCharacterEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getReleaseNum <em>Release Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier#getReleaseNum()
	 * @see #getSyntaxidentifier()
	 * @generated
	 */
	EAttribute getSyntaxidentifier_ReleaseNum();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Transferstatus <em>Transferstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transferstatus</em>'.
	 * @see org.milyn.edi.unedifact.v41.Transferstatus
	 * @generated
	 */
	EClass getTransferstatus();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Transferstatus#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.milyn.edi.unedifact.v41.Transferstatus#getSequence()
	 * @see #getTransferstatus()
	 * @generated
	 */
	EAttribute getTransferstatus_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Transferstatus#getFirstAndLast <em>First And Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First And Last</em>'.
	 * @see org.milyn.edi.unedifact.v41.Transferstatus#getFirstAndLast()
	 * @see #getTransferstatus()
	 * @generated
	 */
	EAttribute getTransferstatus_FirstAndLast();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Unb <em>Unb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unb</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb
	 * @generated
	 */
	EClass getUnb();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unb#getSyntaxIdentifier <em>Syntax Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Syntax Identifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getSyntaxIdentifier()
	 * @see #getUnb()
	 * @generated
	 */
	EReference getUnb_SyntaxIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unb#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getSender()
	 * @see #getUnb()
	 * @generated
	 */
	EReference getUnb_Sender();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unb#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getRecipient()
	 * @see #getUnb()
	 * @generated
	 */
	EReference getUnb_Recipient();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unb#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getDateTime()
	 * @see #getUnb()
	 * @generated
	 */
	EReference getUnb_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unb#getControlRef <em>Control Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getControlRef()
	 * @see #getUnb()
	 * @generated
	 */
	EAttribute getUnb_ControlRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unb#getRecipientRef <em>Recipient Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getRecipientRef()
	 * @see #getUnb()
	 * @generated
	 */
	EReference getUnb_RecipientRef();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unb#getApplicationRef <em>Application Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getApplicationRef()
	 * @see #getUnb()
	 * @generated
	 */
	EAttribute getUnb_ApplicationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unb#getProcessingPriorityCode <em>Processing Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Priority Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getProcessingPriorityCode()
	 * @see #getUnb()
	 * @generated
	 */
	EAttribute getUnb_ProcessingPriorityCode();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unb#getAckRequest <em>Ack Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ack Request</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getAckRequest()
	 * @see #getUnb()
	 * @generated
	 */
	EAttribute getUnb_AckRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unb#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getAgreementId()
	 * @see #getUnb()
	 * @generated
	 */
	EAttribute getUnb_AgreementId();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unb#getTestIndicator <em>Test Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Indicator</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unb#getTestIndicator()
	 * @see #getUnb()
	 * @generated
	 */
	EAttribute getUnb_TestIndicator();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Une <em>Une</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Une</em>'.
	 * @see org.milyn.edi.unedifact.v41.Une
	 * @generated
	 */
	EClass getUne();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Une#getControlCount <em>Control Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Count</em>'.
	 * @see org.milyn.edi.unedifact.v41.Une#getControlCount()
	 * @see #getUne()
	 * @generated
	 */
	EAttribute getUne_ControlCount();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Une#getGroupRef <em>Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Une#getGroupRef()
	 * @see #getUne()
	 * @generated
	 */
	EAttribute getUne_GroupRef();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.UnEdifact <em>Un Edifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Edifact</em>'.
	 * @see org.milyn.edi.unedifact.v41.UnEdifact
	 * @generated
	 */
	EClass getUnEdifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.UnEdifact#getUNB <em>UNB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UNB</em>'.
	 * @see org.milyn.edi.unedifact.v41.UnEdifact#getUNB()
	 * @see #getUnEdifact()
	 * @generated
	 */
	EReference getUnEdifact_UNB();

	/**
	 * Returns the meta object for the containment reference list '{@link org.milyn.edi.unedifact.v41.UnEdifact#getInterchangeMessage <em>Interchange Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interchange Message</em>'.
	 * @see org.milyn.edi.unedifact.v41.UnEdifact#getInterchangeMessage()
	 * @see #getUnEdifact()
	 * @generated
	 */
	EReference getUnEdifact_InterchangeMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.UnEdifact#getUNZ <em>UNZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UNZ</em>'.
	 * @see org.milyn.edi.unedifact.v41.UnEdifact#getUNZ()
	 * @see #getUnEdifact()
	 * @generated
	 */
	EReference getUnEdifact_UNZ();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Ung <em>Ung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ung</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung
	 * @generated
	 */
	EClass getUng();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Ung#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getGroupId()
	 * @see #getUng()
	 * @generated
	 */
	EAttribute getUng_GroupId();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Ung#getSenderApp <em>Sender App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender App</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getSenderApp()
	 * @see #getUng()
	 * @generated
	 */
	EReference getUng_SenderApp();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Ung#getRecipientApp <em>Recipient App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient App</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getRecipientApp()
	 * @see #getUng()
	 * @generated
	 */
	EReference getUng_RecipientApp();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Ung#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getDateTime()
	 * @see #getUng()
	 * @generated
	 */
	EReference getUng_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Ung#getGroupRef <em>Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getGroupRef()
	 * @see #getUng()
	 * @generated
	 */
	EAttribute getUng_GroupRef();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Ung#getControllingAgencyCode <em>Controlling Agency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlling Agency Code</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getControllingAgencyCode()
	 * @see #getUng()
	 * @generated
	 */
	EAttribute getUng_ControllingAgencyCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Ung#getMessageVersion <em>Message Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Version</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getMessageVersion()
	 * @see #getUng()
	 * @generated
	 */
	EReference getUng_MessageVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Ung#getApplicationPassword <em>Application Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Password</em>'.
	 * @see org.milyn.edi.unedifact.v41.Ung#getApplicationPassword()
	 * @see #getUng()
	 * @generated
	 */
	EAttribute getUng_ApplicationPassword();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Unh <em>Unh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unh</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh
	 * @generated
	 */
	EClass getUnh();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unh#getMessageRefNum <em>Message Ref Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getMessageRefNum()
	 * @see #getUnh()
	 * @generated
	 */
	EAttribute getUnh_MessageRefNum();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unh#getMessageIdentifier <em>Message Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Identifier</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getMessageIdentifier()
	 * @see #getUnh()
	 * @generated
	 */
	EReference getUnh_MessageIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unh#getCommonAccessRef <em>Common Access Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common Access Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getCommonAccessRef()
	 * @see #getUnh()
	 * @generated
	 */
	EAttribute getUnh_CommonAccessRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unh#getTransferStatus <em>Transfer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfer Status</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getTransferStatus()
	 * @see #getUnh()
	 * @generated
	 */
	EReference getUnh_TransferStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unh#getSubset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subset</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getSubset()
	 * @see #getUnh()
	 * @generated
	 */
	EReference getUnh_Subset();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unh#getImplementationGuideline <em>Implementation Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Guideline</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getImplementationGuideline()
	 * @see #getUnh()
	 * @generated
	 */
	EReference getUnh_ImplementationGuideline();

	/**
	 * Returns the meta object for the containment reference '{@link org.milyn.edi.unedifact.v41.Unh#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unh#getScenario()
	 * @see #getUnh()
	 * @generated
	 */
	EReference getUnh_Scenario();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Unt <em>Unt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unt</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unt
	 * @generated
	 */
	EClass getUnt();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unt#getSegmentCount <em>Segment Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Count</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unt#getSegmentCount()
	 * @see #getUnt()
	 * @generated
	 */
	EAttribute getUnt_SegmentCount();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unt#getMessageRefNum <em>Message Ref Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref Num</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unt#getMessageRefNum()
	 * @see #getUnt()
	 * @generated
	 */
	EAttribute getUnt_MessageRefNum();

	/**
	 * Returns the meta object for class '{@link org.milyn.edi.unedifact.v41.Unz <em>Unz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unz</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unz
	 * @generated
	 */
	EClass getUnz();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unz#getControlCount <em>Control Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Count</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unz#getControlCount()
	 * @see #getUnz()
	 * @generated
	 */
	EAttribute getUnz_ControlCount();

	/**
	 * Returns the meta object for the attribute '{@link org.milyn.edi.unedifact.v41.Unz#getControlRef <em>Control Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Ref</em>'.
	 * @see org.milyn.edi.unedifact.v41.Unz#getControlRef()
	 * @see #getUnz()
	 * @generated
	 */
	EAttribute getUnz_ControlRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	V41Factory getV41Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.DatetimeImpl <em>Datetime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.DatetimeImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getDatetime()
		 * @generated
		 */
		EClass DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME__DATE = eINSTANCE.getDatetime_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME__TIME = eINSTANCE.getDatetime_Time();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.DocumentRootImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Un Edifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UN_EDIFACT = eINSTANCE.getDocumentRoot_UnEdifact();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl <em>Implementationguideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.ImplementationguidelineImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getImplementationguideline()
		 * @generated
		 */
		EClass IMPLEMENTATIONGUIDELINE = eINSTANCE.getImplementationguideline();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATIONGUIDELINE__ID = eINSTANCE.getImplementationguideline_Id();

		/**
		 * The meta object literal for the '<em><b>Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATIONGUIDELINE__VERSION_NUM = eINSTANCE.getImplementationguideline_VersionNum();

		/**
		 * The meta object literal for the '<em><b>Release Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATIONGUIDELINE__RELEASE_NUM = eINSTANCE.getImplementationguideline_ReleaseNum();

		/**
		 * The meta object literal for the '<em><b>Controlling Agency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE = eINSTANCE.getImplementationguideline_ControllingAgencyCode();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl <em>Interchange Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.InterchangeMessageTypeImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getInterchangeMessageType()
		 * @generated
		 */
		EClass INTERCHANGE_MESSAGE_TYPE = eINSTANCE.getInterchangeMessageType();

		/**
		 * The meta object literal for the '<em><b>UNH</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCHANGE_MESSAGE_TYPE__UNH = eINSTANCE.getInterchangeMessageType_UNH();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCHANGE_MESSAGE_TYPE__ANY = eINSTANCE.getInterchangeMessageType_Any();

		/**
		 * The meta object literal for the '<em><b>UNT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCHANGE_MESSAGE_TYPE__UNT = eINSTANCE.getInterchangeMessageType_UNT();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl <em>Messageidentifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.MessageidentifierImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getMessageidentifier()
		 * @generated
		 */
		EClass MESSAGEIDENTIFIER = eINSTANCE.getMessageidentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__ID = eINSTANCE.getMessageidentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__VERSION_NUM = eINSTANCE.getMessageidentifier_VersionNum();

		/**
		 * The meta object literal for the '<em><b>Release Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__RELEASE_NUM = eINSTANCE.getMessageidentifier_ReleaseNum();

		/**
		 * The meta object literal for the '<em><b>Controlling Agency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE = eINSTANCE.getMessageidentifier_ControllingAgencyCode();

		/**
		 * The meta object literal for the '<em><b>Association Assigned Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE = eINSTANCE.getMessageidentifier_AssociationAssignedCode();

		/**
		 * The meta object literal for the '<em><b>Code List Dir Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM = eINSTANCE.getMessageidentifier_CodeListDirVersionNum();

		/**
		 * The meta object literal for the '<em><b>Type Sub Function Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID = eINSTANCE.getMessageidentifier_TypeSubFunctionId();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.MessageversionImpl <em>Messageversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.MessageversionImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getMessageversion()
		 * @generated
		 */
		EClass MESSAGEVERSION = eINSTANCE.getMessageversion();

		/**
		 * The meta object literal for the '<em><b>Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEVERSION__VERSION_NUM = eINSTANCE.getMessageversion_VersionNum();

		/**
		 * The meta object literal for the '<em><b>Release Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEVERSION__RELEASE_NUM = eINSTANCE.getMessageversion_ReleaseNum();

		/**
		 * The meta object literal for the '<em><b>Association Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGEVERSION__ASSOCIATION_CODE = eINSTANCE.getMessageversion_AssociationCode();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.RecipientImpl <em>Recipient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.RecipientImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getRecipient()
		 * @generated
		 */
		EClass RECIPIENT = eINSTANCE.getRecipient();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENT__ID = eINSTANCE.getRecipient_Id();

		/**
		 * The meta object literal for the '<em><b>Code Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENT__CODE_QUALIFIER = eINSTANCE.getRecipient_CodeQualifier();

		/**
		 * The meta object literal for the '<em><b>Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENT__INTERNAL_ID = eINSTANCE.getRecipient_InternalId();

		/**
		 * The meta object literal for the '<em><b>Internal Sub Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENT__INTERNAL_SUB_ID = eINSTANCE.getRecipient_InternalSubId();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.RecipientappImpl <em>Recipientapp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.RecipientappImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getRecipientapp()
		 * @generated
		 */
		EClass RECIPIENTAPP = eINSTANCE.getRecipientapp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENTAPP__ID = eINSTANCE.getRecipientapp_Id();

		/**
		 * The meta object literal for the '<em><b>Code Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENTAPP__CODE_QUALIFIER = eINSTANCE.getRecipientapp_CodeQualifier();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.RecipientrefImpl <em>Recipientref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.RecipientrefImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getRecipientref()
		 * @generated
		 */
		EClass RECIPIENTREF = eINSTANCE.getRecipientref();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENTREF__REF = eINSTANCE.getRecipientref_Ref();

		/**
		 * The meta object literal for the '<em><b>Ref Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENTREF__REF_QUALIFIER = eINSTANCE.getRecipientref_RefQualifier();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.ScenarioImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__ID = eINSTANCE.getScenario_Id();

		/**
		 * The meta object literal for the '<em><b>Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__VERSION_NUM = eINSTANCE.getScenario_VersionNum();

		/**
		 * The meta object literal for the '<em><b>Release Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__RELEASE_NUM = eINSTANCE.getScenario_ReleaseNum();

		/**
		 * The meta object literal for the '<em><b>Controlling Agency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__CONTROLLING_AGENCY_CODE = eINSTANCE.getScenario_ControllingAgencyCode();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.SenderImpl <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.SenderImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__ID = eINSTANCE.getSender_Id();

		/**
		 * The meta object literal for the '<em><b>Code Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__CODE_QUALIFIER = eINSTANCE.getSender_CodeQualifier();

		/**
		 * The meta object literal for the '<em><b>Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__INTERNAL_ID = eINSTANCE.getSender_InternalId();

		/**
		 * The meta object literal for the '<em><b>Internal Sub Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__INTERNAL_SUB_ID = eINSTANCE.getSender_InternalSubId();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.SenderappImpl <em>Senderapp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.SenderappImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSenderapp()
		 * @generated
		 */
		EClass SENDERAPP = eINSTANCE.getSenderapp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDERAPP__ID = eINSTANCE.getSenderapp_Id();

		/**
		 * The meta object literal for the '<em><b>Code Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDERAPP__CODE_QUALIFIER = eINSTANCE.getSenderapp_CodeQualifier();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.SubsetImpl <em>Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.SubsetImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSubset()
		 * @generated
		 */
		EClass SUBSET = eINSTANCE.getSubset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSET__ID = eINSTANCE.getSubset_Id();

		/**
		 * The meta object literal for the '<em><b>Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSET__VERSION_NUM = eINSTANCE.getSubset_VersionNum();

		/**
		 * The meta object literal for the '<em><b>Release Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSET__RELEASE_NUM = eINSTANCE.getSubset_ReleaseNum();

		/**
		 * The meta object literal for the '<em><b>Controlling Agency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSET__CONTROLLING_AGENCY_CODE = eINSTANCE.getSubset_ControllingAgencyCode();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl <em>Syntaxidentifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.SyntaxidentifierImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getSyntaxidentifier()
		 * @generated
		 */
		EClass SYNTAXIDENTIFIER = eINSTANCE.getSyntaxidentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAXIDENTIFIER__ID = eINSTANCE.getSyntaxidentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Version Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAXIDENTIFIER__VERSION_NUM = eINSTANCE.getSyntaxidentifier_VersionNum();

		/**
		 * The meta object literal for the '<em><b>Service Code List Dir Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION = eINSTANCE.getSyntaxidentifier_ServiceCodeListDirVersion();

		/**
		 * The meta object literal for the '<em><b>Coded Character Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING = eINSTANCE.getSyntaxidentifier_CodedCharacterEncoding();

		/**
		 * The meta object literal for the '<em><b>Release Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAXIDENTIFIER__RELEASE_NUM = eINSTANCE.getSyntaxidentifier_ReleaseNum();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.TransferstatusImpl <em>Transferstatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.TransferstatusImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getTransferstatus()
		 * @generated
		 */
		EClass TRANSFERSTATUS = eINSTANCE.getTransferstatus();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFERSTATUS__SEQUENCE = eINSTANCE.getTransferstatus_Sequence();

		/**
		 * The meta object literal for the '<em><b>First And Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFERSTATUS__FIRST_AND_LAST = eINSTANCE.getTransferstatus_FirstAndLast();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UnbImpl <em>Unb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UnbImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnb()
		 * @generated
		 */
		EClass UNB = eINSTANCE.getUnb();

		/**
		 * The meta object literal for the '<em><b>Syntax Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNB__SYNTAX_IDENTIFIER = eINSTANCE.getUnb_SyntaxIdentifier();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNB__SENDER = eINSTANCE.getUnb_Sender();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNB__RECIPIENT = eINSTANCE.getUnb_Recipient();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNB__DATE_TIME = eINSTANCE.getUnb_DateTime();

		/**
		 * The meta object literal for the '<em><b>Control Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNB__CONTROL_REF = eINSTANCE.getUnb_ControlRef();

		/**
		 * The meta object literal for the '<em><b>Recipient Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNB__RECIPIENT_REF = eINSTANCE.getUnb_RecipientRef();

		/**
		 * The meta object literal for the '<em><b>Application Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNB__APPLICATION_REF = eINSTANCE.getUnb_ApplicationRef();

		/**
		 * The meta object literal for the '<em><b>Processing Priority Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNB__PROCESSING_PRIORITY_CODE = eINSTANCE.getUnb_ProcessingPriorityCode();

		/**
		 * The meta object literal for the '<em><b>Ack Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNB__ACK_REQUEST = eINSTANCE.getUnb_AckRequest();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNB__AGREEMENT_ID = eINSTANCE.getUnb_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Test Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNB__TEST_INDICATOR = eINSTANCE.getUnb_TestIndicator();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UneImpl <em>Une</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UneImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUne()
		 * @generated
		 */
		EClass UNE = eINSTANCE.getUne();

		/**
		 * The meta object literal for the '<em><b>Control Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNE__CONTROL_COUNT = eINSTANCE.getUne_ControlCount();

		/**
		 * The meta object literal for the '<em><b>Group Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNE__GROUP_REF = eINSTANCE.getUne_GroupRef();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UnEdifactImpl <em>Un Edifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UnEdifactImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnEdifact()
		 * @generated
		 */
		EClass UN_EDIFACT = eINSTANCE.getUnEdifact();

		/**
		 * The meta object literal for the '<em><b>UNB</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UN_EDIFACT__UNB = eINSTANCE.getUnEdifact_UNB();

		/**
		 * The meta object literal for the '<em><b>Interchange Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UN_EDIFACT__INTERCHANGE_MESSAGE = eINSTANCE.getUnEdifact_InterchangeMessage();

		/**
		 * The meta object literal for the '<em><b>UNZ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UN_EDIFACT__UNZ = eINSTANCE.getUnEdifact_UNZ();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UngImpl <em>Ung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UngImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUng()
		 * @generated
		 */
		EClass UNG = eINSTANCE.getUng();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNG__GROUP_ID = eINSTANCE.getUng_GroupId();

		/**
		 * The meta object literal for the '<em><b>Sender App</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNG__SENDER_APP = eINSTANCE.getUng_SenderApp();

		/**
		 * The meta object literal for the '<em><b>Recipient App</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNG__RECIPIENT_APP = eINSTANCE.getUng_RecipientApp();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNG__DATE_TIME = eINSTANCE.getUng_DateTime();

		/**
		 * The meta object literal for the '<em><b>Group Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNG__GROUP_REF = eINSTANCE.getUng_GroupRef();

		/**
		 * The meta object literal for the '<em><b>Controlling Agency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNG__CONTROLLING_AGENCY_CODE = eINSTANCE.getUng_ControllingAgencyCode();

		/**
		 * The meta object literal for the '<em><b>Message Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNG__MESSAGE_VERSION = eINSTANCE.getUng_MessageVersion();

		/**
		 * The meta object literal for the '<em><b>Application Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNG__APPLICATION_PASSWORD = eINSTANCE.getUng_ApplicationPassword();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UnhImpl <em>Unh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UnhImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnh()
		 * @generated
		 */
		EClass UNH = eINSTANCE.getUnh();

		/**
		 * The meta object literal for the '<em><b>Message Ref Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNH__MESSAGE_REF_NUM = eINSTANCE.getUnh_MessageRefNum();

		/**
		 * The meta object literal for the '<em><b>Message Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNH__MESSAGE_IDENTIFIER = eINSTANCE.getUnh_MessageIdentifier();

		/**
		 * The meta object literal for the '<em><b>Common Access Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNH__COMMON_ACCESS_REF = eINSTANCE.getUnh_CommonAccessRef();

		/**
		 * The meta object literal for the '<em><b>Transfer Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNH__TRANSFER_STATUS = eINSTANCE.getUnh_TransferStatus();

		/**
		 * The meta object literal for the '<em><b>Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNH__SUBSET = eINSTANCE.getUnh_Subset();

		/**
		 * The meta object literal for the '<em><b>Implementation Guideline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNH__IMPLEMENTATION_GUIDELINE = eINSTANCE.getUnh_ImplementationGuideline();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNH__SCENARIO = eINSTANCE.getUnh_Scenario();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UntImpl <em>Unt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UntImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnt()
		 * @generated
		 */
		EClass UNT = eINSTANCE.getUnt();

		/**
		 * The meta object literal for the '<em><b>Segment Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNT__SEGMENT_COUNT = eINSTANCE.getUnt_SegmentCount();

		/**
		 * The meta object literal for the '<em><b>Message Ref Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNT__MESSAGE_REF_NUM = eINSTANCE.getUnt_MessageRefNum();

		/**
		 * The meta object literal for the '{@link org.milyn.edi.unedifact.v41.impl.UnzImpl <em>Unz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.milyn.edi.unedifact.v41.impl.UnzImpl
		 * @see org.milyn.edi.unedifact.v41.impl.V41PackageImpl#getUnz()
		 * @generated
		 */
		EClass UNZ = eINSTANCE.getUnz();

		/**
		 * The meta object literal for the '<em><b>Control Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNZ__CONTROL_COUNT = eINSTANCE.getUnz_ControlCount();

		/**
		 * The meta object literal for the '<em><b>Control Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNZ__CONTROL_REF = eINSTANCE.getUnz_ControlRef();

	}

} //V41Package
