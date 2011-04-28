/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.milyn.edi.unedifact.v41.Datetime;
import org.milyn.edi.unedifact.v41.DocumentRoot;
import org.milyn.edi.unedifact.v41.Implementationguideline;
import org.milyn.edi.unedifact.v41.InterchangeMessageType;
import org.milyn.edi.unedifact.v41.Messageidentifier;
import org.milyn.edi.unedifact.v41.Messageversion;
import org.milyn.edi.unedifact.v41.Recipient;
import org.milyn.edi.unedifact.v41.Recipientapp;
import org.milyn.edi.unedifact.v41.Recipientref;
import org.milyn.edi.unedifact.v41.Scenario;
import org.milyn.edi.unedifact.v41.Sender;
import org.milyn.edi.unedifact.v41.Senderapp;
import org.milyn.edi.unedifact.v41.Subset;
import org.milyn.edi.unedifact.v41.Syntaxidentifier;
import org.milyn.edi.unedifact.v41.Transferstatus;
import org.milyn.edi.unedifact.v41.UnEdifact;
import org.milyn.edi.unedifact.v41.Unb;
import org.milyn.edi.unedifact.v41.Une;
import org.milyn.edi.unedifact.v41.Ung;
import org.milyn.edi.unedifact.v41.Unh;
import org.milyn.edi.unedifact.v41.Unt;
import org.milyn.edi.unedifact.v41.Unz;
import org.milyn.edi.unedifact.v41.V41Factory;
import org.milyn.edi.unedifact.v41.V41Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class V41PackageImpl extends EPackageImpl implements V41Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationguidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interchangeMessageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageidentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipientappEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipientrefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderappEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxidentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferstatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unEdifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unhEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unzEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.milyn.edi.unedifact.v41.V41Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private V41PackageImpl() {
		super(eNS_URI, V41Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link V41Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static V41Package init() {
		if (isInited) return (V41Package)EPackage.Registry.INSTANCE.getEPackage(V41Package.eNS_URI);

		// Obtain or create and register package
		V41PackageImpl theV41Package = (V41PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof V41PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new V41PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theV41Package.createPackageContents();

		// Initialize created meta-data
		theV41Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theV41Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(V41Package.eNS_URI, theV41Package);
		return theV41Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatetime() {
		return datetimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetime_Date() {
		return (EAttribute)datetimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetime_Time() {
		return (EAttribute)datetimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UnEdifact() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationguideline() {
		return implementationguidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationguideline_Id() {
		return (EAttribute)implementationguidelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationguideline_VersionNum() {
		return (EAttribute)implementationguidelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationguideline_ReleaseNum() {
		return (EAttribute)implementationguidelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationguideline_ControllingAgencyCode() {
		return (EAttribute)implementationguidelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterchangeMessageType() {
		return interchangeMessageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterchangeMessageType_UNH() {
		return (EReference)interchangeMessageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterchangeMessageType_Any() {
		return (EAttribute)interchangeMessageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterchangeMessageType_UNT() {
		return (EReference)interchangeMessageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageidentifier() {
		return messageidentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_Id() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_VersionNum() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_ReleaseNum() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_ControllingAgencyCode() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_AssociationAssignedCode() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_CodeListDirVersionNum() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageidentifier_TypeSubFunctionId() {
		return (EAttribute)messageidentifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageversion() {
		return messageversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageversion_VersionNum() {
		return (EAttribute)messageversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageversion_ReleaseNum() {
		return (EAttribute)messageversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageversion_AssociationCode() {
		return (EAttribute)messageversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipient() {
		return recipientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipient_Id() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipient_CodeQualifier() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipient_InternalId() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipient_InternalSubId() {
		return (EAttribute)recipientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipientapp() {
		return recipientappEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipientapp_Id() {
		return (EAttribute)recipientappEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipientapp_CodeQualifier() {
		return (EAttribute)recipientappEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipientref() {
		return recipientrefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipientref_Ref() {
		return (EAttribute)recipientrefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecipientref_RefQualifier() {
		return (EAttribute)recipientrefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Id() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_VersionNum() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ReleaseNum() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ControllingAgencyCode() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSender() {
		return senderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSender_Id() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSender_CodeQualifier() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSender_InternalId() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSender_InternalSubId() {
		return (EAttribute)senderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderapp() {
		return senderappEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderapp_Id() {
		return (EAttribute)senderappEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderapp_CodeQualifier() {
		return (EAttribute)senderappEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubset() {
		return subsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubset_Id() {
		return (EAttribute)subsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubset_VersionNum() {
		return (EAttribute)subsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubset_ReleaseNum() {
		return (EAttribute)subsetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubset_ControllingAgencyCode() {
		return (EAttribute)subsetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxidentifier() {
		return syntaxidentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxidentifier_Id() {
		return (EAttribute)syntaxidentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxidentifier_VersionNum() {
		return (EAttribute)syntaxidentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxidentifier_ServiceCodeListDirVersion() {
		return (EAttribute)syntaxidentifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxidentifier_CodedCharacterEncoding() {
		return (EAttribute)syntaxidentifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxidentifier_ReleaseNum() {
		return (EAttribute)syntaxidentifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferstatus() {
		return transferstatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferstatus_Sequence() {
		return (EAttribute)transferstatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferstatus_FirstAndLast() {
		return (EAttribute)transferstatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnb() {
		return unbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnb_SyntaxIdentifier() {
		return (EReference)unbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnb_Sender() {
		return (EReference)unbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnb_Recipient() {
		return (EReference)unbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnb_DateTime() {
		return (EReference)unbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnb_ControlRef() {
		return (EAttribute)unbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnb_RecipientRef() {
		return (EReference)unbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnb_ApplicationRef() {
		return (EAttribute)unbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnb_ProcessingPriorityCode() {
		return (EAttribute)unbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnb_AckRequest() {
		return (EAttribute)unbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnb_AgreementId() {
		return (EAttribute)unbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnb_TestIndicator() {
		return (EAttribute)unbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUne() {
		return uneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUne_ControlCount() {
		return (EAttribute)uneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUne_GroupRef() {
		return (EAttribute)uneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnEdifact() {
		return unEdifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnEdifact_UNB() {
		return (EReference)unEdifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnEdifact_InterchangeMessage() {
		return (EReference)unEdifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnEdifact_UNZ() {
		return (EReference)unEdifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUng() {
		return ungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUng_GroupId() {
		return (EAttribute)ungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUng_SenderApp() {
		return (EReference)ungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUng_RecipientApp() {
		return (EReference)ungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUng_DateTime() {
		return (EReference)ungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUng_GroupRef() {
		return (EAttribute)ungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUng_ControllingAgencyCode() {
		return (EAttribute)ungEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUng_MessageVersion() {
		return (EReference)ungEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUng_ApplicationPassword() {
		return (EAttribute)ungEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnh() {
		return unhEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnh_MessageRefNum() {
		return (EAttribute)unhEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnh_MessageIdentifier() {
		return (EReference)unhEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnh_CommonAccessRef() {
		return (EAttribute)unhEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnh_TransferStatus() {
		return (EReference)unhEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnh_Subset() {
		return (EReference)unhEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnh_ImplementationGuideline() {
		return (EReference)unhEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnh_Scenario() {
		return (EReference)unhEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnt() {
		return untEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnt_SegmentCount() {
		return (EAttribute)untEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnt_MessageRefNum() {
		return (EAttribute)untEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnz() {
		return unzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnz_ControlCount() {
		return (EAttribute)unzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnz_ControlRef() {
		return (EAttribute)unzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V41Factory getV41Factory() {
		return (V41Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		datetimeEClass = createEClass(DATETIME);
		createEAttribute(datetimeEClass, DATETIME__DATE);
		createEAttribute(datetimeEClass, DATETIME__TIME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UN_EDIFACT);

		implementationguidelineEClass = createEClass(IMPLEMENTATIONGUIDELINE);
		createEAttribute(implementationguidelineEClass, IMPLEMENTATIONGUIDELINE__ID);
		createEAttribute(implementationguidelineEClass, IMPLEMENTATIONGUIDELINE__VERSION_NUM);
		createEAttribute(implementationguidelineEClass, IMPLEMENTATIONGUIDELINE__RELEASE_NUM);
		createEAttribute(implementationguidelineEClass, IMPLEMENTATIONGUIDELINE__CONTROLLING_AGENCY_CODE);

		interchangeMessageTypeEClass = createEClass(INTERCHANGE_MESSAGE_TYPE);
		createEReference(interchangeMessageTypeEClass, INTERCHANGE_MESSAGE_TYPE__UNH);
		createEAttribute(interchangeMessageTypeEClass, INTERCHANGE_MESSAGE_TYPE__ANY);
		createEReference(interchangeMessageTypeEClass, INTERCHANGE_MESSAGE_TYPE__UNT);

		messageidentifierEClass = createEClass(MESSAGEIDENTIFIER);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__ID);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__VERSION_NUM);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__RELEASE_NUM);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__CONTROLLING_AGENCY_CODE);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__ASSOCIATION_ASSIGNED_CODE);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__CODE_LIST_DIR_VERSION_NUM);
		createEAttribute(messageidentifierEClass, MESSAGEIDENTIFIER__TYPE_SUB_FUNCTION_ID);

		messageversionEClass = createEClass(MESSAGEVERSION);
		createEAttribute(messageversionEClass, MESSAGEVERSION__VERSION_NUM);
		createEAttribute(messageversionEClass, MESSAGEVERSION__RELEASE_NUM);
		createEAttribute(messageversionEClass, MESSAGEVERSION__ASSOCIATION_CODE);

		recipientEClass = createEClass(RECIPIENT);
		createEAttribute(recipientEClass, RECIPIENT__ID);
		createEAttribute(recipientEClass, RECIPIENT__CODE_QUALIFIER);
		createEAttribute(recipientEClass, RECIPIENT__INTERNAL_ID);
		createEAttribute(recipientEClass, RECIPIENT__INTERNAL_SUB_ID);

		recipientappEClass = createEClass(RECIPIENTAPP);
		createEAttribute(recipientappEClass, RECIPIENTAPP__ID);
		createEAttribute(recipientappEClass, RECIPIENTAPP__CODE_QUALIFIER);

		recipientrefEClass = createEClass(RECIPIENTREF);
		createEAttribute(recipientrefEClass, RECIPIENTREF__REF);
		createEAttribute(recipientrefEClass, RECIPIENTREF__REF_QUALIFIER);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__ID);
		createEAttribute(scenarioEClass, SCENARIO__VERSION_NUM);
		createEAttribute(scenarioEClass, SCENARIO__RELEASE_NUM);
		createEAttribute(scenarioEClass, SCENARIO__CONTROLLING_AGENCY_CODE);

		senderEClass = createEClass(SENDER);
		createEAttribute(senderEClass, SENDER__ID);
		createEAttribute(senderEClass, SENDER__CODE_QUALIFIER);
		createEAttribute(senderEClass, SENDER__INTERNAL_ID);
		createEAttribute(senderEClass, SENDER__INTERNAL_SUB_ID);

		senderappEClass = createEClass(SENDERAPP);
		createEAttribute(senderappEClass, SENDERAPP__ID);
		createEAttribute(senderappEClass, SENDERAPP__CODE_QUALIFIER);

		subsetEClass = createEClass(SUBSET);
		createEAttribute(subsetEClass, SUBSET__ID);
		createEAttribute(subsetEClass, SUBSET__VERSION_NUM);
		createEAttribute(subsetEClass, SUBSET__RELEASE_NUM);
		createEAttribute(subsetEClass, SUBSET__CONTROLLING_AGENCY_CODE);

		syntaxidentifierEClass = createEClass(SYNTAXIDENTIFIER);
		createEAttribute(syntaxidentifierEClass, SYNTAXIDENTIFIER__ID);
		createEAttribute(syntaxidentifierEClass, SYNTAXIDENTIFIER__VERSION_NUM);
		createEAttribute(syntaxidentifierEClass, SYNTAXIDENTIFIER__SERVICE_CODE_LIST_DIR_VERSION);
		createEAttribute(syntaxidentifierEClass, SYNTAXIDENTIFIER__CODED_CHARACTER_ENCODING);
		createEAttribute(syntaxidentifierEClass, SYNTAXIDENTIFIER__RELEASE_NUM);

		transferstatusEClass = createEClass(TRANSFERSTATUS);
		createEAttribute(transferstatusEClass, TRANSFERSTATUS__SEQUENCE);
		createEAttribute(transferstatusEClass, TRANSFERSTATUS__FIRST_AND_LAST);

		unbEClass = createEClass(UNB);
		createEReference(unbEClass, UNB__SYNTAX_IDENTIFIER);
		createEReference(unbEClass, UNB__SENDER);
		createEReference(unbEClass, UNB__RECIPIENT);
		createEReference(unbEClass, UNB__DATE_TIME);
		createEAttribute(unbEClass, UNB__CONTROL_REF);
		createEReference(unbEClass, UNB__RECIPIENT_REF);
		createEAttribute(unbEClass, UNB__APPLICATION_REF);
		createEAttribute(unbEClass, UNB__PROCESSING_PRIORITY_CODE);
		createEAttribute(unbEClass, UNB__ACK_REQUEST);
		createEAttribute(unbEClass, UNB__AGREEMENT_ID);
		createEAttribute(unbEClass, UNB__TEST_INDICATOR);

		uneEClass = createEClass(UNE);
		createEAttribute(uneEClass, UNE__CONTROL_COUNT);
		createEAttribute(uneEClass, UNE__GROUP_REF);

		unEdifactEClass = createEClass(UN_EDIFACT);
		createEReference(unEdifactEClass, UN_EDIFACT__UNB);
		createEReference(unEdifactEClass, UN_EDIFACT__INTERCHANGE_MESSAGE);
		createEReference(unEdifactEClass, UN_EDIFACT__UNZ);

		ungEClass = createEClass(UNG);
		createEAttribute(ungEClass, UNG__GROUP_ID);
		createEReference(ungEClass, UNG__SENDER_APP);
		createEReference(ungEClass, UNG__RECIPIENT_APP);
		createEReference(ungEClass, UNG__DATE_TIME);
		createEAttribute(ungEClass, UNG__GROUP_REF);
		createEAttribute(ungEClass, UNG__CONTROLLING_AGENCY_CODE);
		createEReference(ungEClass, UNG__MESSAGE_VERSION);
		createEAttribute(ungEClass, UNG__APPLICATION_PASSWORD);

		unhEClass = createEClass(UNH);
		createEAttribute(unhEClass, UNH__MESSAGE_REF_NUM);
		createEReference(unhEClass, UNH__MESSAGE_IDENTIFIER);
		createEAttribute(unhEClass, UNH__COMMON_ACCESS_REF);
		createEReference(unhEClass, UNH__TRANSFER_STATUS);
		createEReference(unhEClass, UNH__SUBSET);
		createEReference(unhEClass, UNH__IMPLEMENTATION_GUIDELINE);
		createEReference(unhEClass, UNH__SCENARIO);

		untEClass = createEClass(UNT);
		createEAttribute(untEClass, UNT__SEGMENT_COUNT);
		createEAttribute(untEClass, UNT__MESSAGE_REF_NUM);

		unzEClass = createEClass(UNZ);
		createEAttribute(unzEClass, UNZ__CONTROL_COUNT);
		createEAttribute(unzEClass, UNZ__CONTROL_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(datetimeEClass, Datetime.class, "Datetime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetime_Date(), theXMLTypePackage.getString(), "date", null, 1, 1, Datetime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetime_Time(), theXMLTypePackage.getString(), "time", null, 1, 1, Datetime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnEdifact(), this.getUnEdifact(), null, "unEdifact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(implementationguidelineEClass, Implementationguideline.class, "Implementationguideline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationguideline_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Implementationguideline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationguideline_VersionNum(), theXMLTypePackage.getString(), "versionNum", null, 0, 1, Implementationguideline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationguideline_ReleaseNum(), theXMLTypePackage.getString(), "releaseNum", null, 0, 1, Implementationguideline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationguideline_ControllingAgencyCode(), theXMLTypePackage.getString(), "controllingAgencyCode", null, 0, 1, Implementationguideline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interchangeMessageTypeEClass, InterchangeMessageType.class, "InterchangeMessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterchangeMessageType_UNH(), this.getUnh(), null, "uNH", null, 1, 1, InterchangeMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterchangeMessageType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, InterchangeMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterchangeMessageType_UNT(), this.getUnt(), null, "uNT", null, 1, 1, InterchangeMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageidentifierEClass, Messageidentifier.class, "Messageidentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageidentifier_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageidentifier_VersionNum(), theXMLTypePackage.getString(), "versionNum", null, 1, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageidentifier_ReleaseNum(), theXMLTypePackage.getString(), "releaseNum", null, 1, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageidentifier_ControllingAgencyCode(), theXMLTypePackage.getString(), "controllingAgencyCode", null, 1, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageidentifier_AssociationAssignedCode(), theXMLTypePackage.getString(), "associationAssignedCode", null, 0, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageidentifier_CodeListDirVersionNum(), theXMLTypePackage.getString(), "codeListDirVersionNum", null, 0, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageidentifier_TypeSubFunctionId(), theXMLTypePackage.getString(), "typeSubFunctionId", null, 0, 1, Messageidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageversionEClass, Messageversion.class, "Messageversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageversion_VersionNum(), theXMLTypePackage.getString(), "versionNum", null, 1, 1, Messageversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageversion_ReleaseNum(), theXMLTypePackage.getString(), "releaseNum", null, 1, 1, Messageversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageversion_AssociationCode(), theXMLTypePackage.getString(), "associationCode", null, 0, 1, Messageversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipientEClass, Recipient.class, "Recipient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipient_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_CodeQualifier(), theXMLTypePackage.getString(), "codeQualifier", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_InternalId(), theXMLTypePackage.getString(), "internalId", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipient_InternalSubId(), theXMLTypePackage.getString(), "internalSubId", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipientappEClass, Recipientapp.class, "Recipientapp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipientapp_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Recipientapp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipientapp_CodeQualifier(), theXMLTypePackage.getString(), "codeQualifier", null, 0, 1, Recipientapp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipientrefEClass, Recipientref.class, "Recipientref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecipientref_Ref(), theXMLTypePackage.getString(), "ref", null, 1, 1, Recipientref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipientref_RefQualifier(), theXMLTypePackage.getString(), "refQualifier", null, 0, 1, Recipientref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_VersionNum(), theXMLTypePackage.getString(), "versionNum", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_ReleaseNum(), theXMLTypePackage.getString(), "releaseNum", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_ControllingAgencyCode(), theXMLTypePackage.getString(), "controllingAgencyCode", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderEClass, Sender.class, "Sender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSender_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSender_CodeQualifier(), theXMLTypePackage.getString(), "codeQualifier", null, 0, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSender_InternalId(), theXMLTypePackage.getString(), "internalId", null, 0, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSender_InternalSubId(), theXMLTypePackage.getString(), "internalSubId", null, 0, 1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderappEClass, Senderapp.class, "Senderapp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenderapp_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Senderapp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSenderapp_CodeQualifier(), theXMLTypePackage.getString(), "codeQualifier", null, 0, 1, Senderapp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subsetEClass, Subset.class, "Subset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubset_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Subset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubset_VersionNum(), theXMLTypePackage.getString(), "versionNum", null, 0, 1, Subset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubset_ReleaseNum(), theXMLTypePackage.getString(), "releaseNum", null, 0, 1, Subset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubset_ControllingAgencyCode(), theXMLTypePackage.getString(), "controllingAgencyCode", null, 0, 1, Subset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(syntaxidentifierEClass, Syntaxidentifier.class, "Syntaxidentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSyntaxidentifier_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Syntaxidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxidentifier_VersionNum(), theXMLTypePackage.getString(), "versionNum", null, 1, 1, Syntaxidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxidentifier_ServiceCodeListDirVersion(), theXMLTypePackage.getString(), "serviceCodeListDirVersion", null, 0, 1, Syntaxidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxidentifier_CodedCharacterEncoding(), theXMLTypePackage.getString(), "codedCharacterEncoding", null, 0, 1, Syntaxidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxidentifier_ReleaseNum(), theXMLTypePackage.getString(), "releaseNum", null, 0, 1, Syntaxidentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferstatusEClass, Transferstatus.class, "Transferstatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransferstatus_Sequence(), theXMLTypePackage.getString(), "sequence", null, 1, 1, Transferstatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferstatus_FirstAndLast(), theXMLTypePackage.getString(), "firstAndLast", null, 0, 1, Transferstatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unbEClass, Unb.class, "Unb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnb_SyntaxIdentifier(), this.getSyntaxidentifier(), null, "syntaxIdentifier", null, 1, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnb_Sender(), this.getSender(), null, "sender", null, 1, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnb_Recipient(), this.getRecipient(), null, "recipient", null, 1, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnb_DateTime(), this.getDatetime(), null, "dateTime", null, 1, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnb_ControlRef(), theXMLTypePackage.getString(), "controlRef", null, 1, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnb_RecipientRef(), this.getRecipientref(), null, "recipientRef", null, 0, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnb_ApplicationRef(), theXMLTypePackage.getString(), "applicationRef", null, 0, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnb_ProcessingPriorityCode(), theXMLTypePackage.getString(), "processingPriorityCode", null, 0, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnb_AckRequest(), theXMLTypePackage.getString(), "ackRequest", null, 0, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnb_AgreementId(), theXMLTypePackage.getString(), "agreementId", null, 0, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnb_TestIndicator(), theXMLTypePackage.getString(), "testIndicator", null, 0, 1, Unb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uneEClass, Une.class, "Une", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUne_ControlCount(), theXMLTypePackage.getString(), "controlCount", null, 1, 1, Une.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUne_GroupRef(), theXMLTypePackage.getString(), "groupRef", null, 1, 1, Une.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unEdifactEClass, UnEdifact.class, "UnEdifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnEdifact_UNB(), this.getUnb(), null, "uNB", null, 1, 1, UnEdifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnEdifact_InterchangeMessage(), this.getInterchangeMessageType(), null, "interchangeMessage", null, 1, -1, UnEdifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnEdifact_UNZ(), this.getUnz(), null, "uNZ", null, 1, 1, UnEdifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ungEClass, Ung.class, "Ung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUng_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUng_SenderApp(), this.getSenderapp(), null, "senderApp", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUng_RecipientApp(), this.getRecipientapp(), null, "recipientApp", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUng_DateTime(), this.getDatetime(), null, "dateTime", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUng_GroupRef(), theXMLTypePackage.getString(), "groupRef", null, 1, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUng_ControllingAgencyCode(), theXMLTypePackage.getString(), "controllingAgencyCode", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUng_MessageVersion(), this.getMessageversion(), null, "messageVersion", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUng_ApplicationPassword(), theXMLTypePackage.getString(), "applicationPassword", null, 0, 1, Ung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unhEClass, Unh.class, "Unh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnh_MessageRefNum(), theXMLTypePackage.getString(), "messageRefNum", null, 1, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnh_MessageIdentifier(), this.getMessageidentifier(), null, "messageIdentifier", null, 1, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnh_CommonAccessRef(), theXMLTypePackage.getString(), "commonAccessRef", null, 0, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnh_TransferStatus(), this.getTransferstatus(), null, "transferStatus", null, 0, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnh_Subset(), this.getSubset(), null, "subset", null, 0, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnh_ImplementationGuideline(), this.getImplementationguideline(), null, "implementationGuideline", null, 0, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnh_Scenario(), this.getScenario(), null, "scenario", null, 0, 1, Unh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(untEClass, Unt.class, "Unt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnt_SegmentCount(), theXMLTypePackage.getString(), "segmentCount", null, 1, 1, Unt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnt_MessageRefNum(), theXMLTypePackage.getString(), "messageRefNum", null, 1, 1, Unt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unzEClass, Unz.class, "Unz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnz_ControlCount(), theXMLTypePackage.getString(), "controlCount", null, 1, 1, Unz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnz_ControlRef(), theXMLTypePackage.getString(), "controlRef", null, 1, 1, Unz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (datetimeEClass, 
		   source, 
		   new String[] {
			 "name", "Datetime",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDatetime_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDatetime_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_UnEdifact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unEdifact",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (implementationguidelineEClass, 
		   source, 
		   new String[] {
			 "name", "Implementationguideline",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImplementationguideline_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplementationguideline_VersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplementationguideline_ReleaseNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplementationguideline_ControllingAgencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controllingAgencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (interchangeMessageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "interchangeMessageType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInterchangeMessageType_UNH(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UNH",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInterchangeMessageType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getInterchangeMessageType_UNT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UNT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (messageidentifierEClass, 
		   source, 
		   new String[] {
			 "name", "Messageidentifier",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMessageidentifier_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageidentifier_VersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageidentifier_ReleaseNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageidentifier_ControllingAgencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controllingAgencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageidentifier_AssociationAssignedCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "associationAssignedCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageidentifier_CodeListDirVersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codeListDirVersionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageidentifier_TypeSubFunctionId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "typeSubFunctionId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (messageversionEClass, 
		   source, 
		   new String[] {
			 "name", "Messageversion",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMessageversion_VersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageversion_ReleaseNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMessageversion_AssociationCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "associationCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (recipientEClass, 
		   source, 
		   new String[] {
			 "name", "Recipient",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRecipient_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRecipient_CodeQualifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codeQualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRecipient_InternalId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "internalId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRecipient_InternalSubId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "internalSubId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (recipientappEClass, 
		   source, 
		   new String[] {
			 "name", "Recipientapp",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRecipientapp_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRecipientapp_CodeQualifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codeQualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (recipientrefEClass, 
		   source, 
		   new String[] {
			 "name", "Recipientref",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRecipientref_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRecipientref_RefQualifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refQualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (scenarioEClass, 
		   source, 
		   new String[] {
			 "name", "Scenario",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScenario_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScenario_VersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScenario_ReleaseNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScenario_ControllingAgencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controllingAgencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (senderEClass, 
		   source, 
		   new String[] {
			 "name", "Sender",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSender_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSender_CodeQualifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codeQualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSender_InternalId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "internalId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSender_InternalSubId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "internalSubId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (senderappEClass, 
		   source, 
		   new String[] {
			 "name", "Senderapp",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSenderapp_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSenderapp_CodeQualifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codeQualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (subsetEClass, 
		   source, 
		   new String[] {
			 "name", "Subset",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubset_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubset_VersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubset_ReleaseNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubset_ControllingAgencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controllingAgencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (syntaxidentifierEClass, 
		   source, 
		   new String[] {
			 "name", "Syntaxidentifier",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSyntaxidentifier_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSyntaxidentifier_VersionNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSyntaxidentifier_ServiceCodeListDirVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "serviceCodeListDirVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSyntaxidentifier_CodedCharacterEncoding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "codedCharacterEncoding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSyntaxidentifier_ReleaseNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transferstatusEClass, 
		   source, 
		   new String[] {
			 "name", "Transferstatus",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransferstatus_Sequence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransferstatus_FirstAndLast(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstAndLast",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (unbEClass, 
		   source, 
		   new String[] {
			 "name", "Unb",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnb_SyntaxIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "syntaxIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_Sender(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sender",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_Recipient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "recipient",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_DateTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dateTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_ControlRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_RecipientRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "recipientRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_ApplicationRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "applicationRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_ProcessingPriorityCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processingPriorityCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_AckRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ackRequest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_AgreementId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "agreementId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnb_TestIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "testIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (uneEClass, 
		   source, 
		   new String[] {
			 "name", "Une",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUne_ControlCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlCount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUne_GroupRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "groupRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (unEdifactEClass, 
		   source, 
		   new String[] {
			 "name", "unEdifact",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnEdifact_UNB(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UNB",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnEdifact_InterchangeMessage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interchangeMessage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnEdifact_UNZ(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UNZ",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (ungEClass, 
		   source, 
		   new String[] {
			 "name", "Ung",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUng_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "groupId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_SenderApp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "senderApp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_RecipientApp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "recipientApp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_DateTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dateTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_GroupRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "groupRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_ControllingAgencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controllingAgencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_MessageVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "messageVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUng_ApplicationPassword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "applicationPassword",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (unhEClass, 
		   source, 
		   new String[] {
			 "name", "Unh",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnh_MessageRefNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "messageRefNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnh_MessageIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "messageIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnh_CommonAccessRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "commonAccessRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnh_TransferStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transferStatus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnh_Subset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnh_ImplementationGuideline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "implementationGuideline",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnh_Scenario(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scenario",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (untEClass, 
		   source, 
		   new String[] {
			 "name", "Unt",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnt_SegmentCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "segmentCount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnt_MessageRefNum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "messageRefNum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (unzEClass, 
		   source, 
		   new String[] {
			 "name", "Unz",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnz_ControlCount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlCount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnz_ControlRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlRef",
			 "namespace", "##targetNamespace"
		   });
	}

} //V41PackageImpl
