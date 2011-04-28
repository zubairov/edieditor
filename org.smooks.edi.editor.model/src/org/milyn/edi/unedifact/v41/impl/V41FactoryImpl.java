/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.milyn.edi.unedifact.v41.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class V41FactoryImpl extends EFactoryImpl implements V41Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static V41Factory init() {
		try {
			V41Factory theV41Factory = (V41Factory)EPackage.Registry.INSTANCE.getEFactory("urn:org.milyn.edi.unedifact.v41"); 
			if (theV41Factory != null) {
				return theV41Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new V41FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V41FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case V41Package.DATETIME: return createDatetime();
			case V41Package.DOCUMENT_ROOT: return createDocumentRoot();
			case V41Package.IMPLEMENTATIONGUIDELINE: return createImplementationguideline();
			case V41Package.INTERCHANGE_MESSAGE_TYPE: return createInterchangeMessageType();
			case V41Package.MESSAGEIDENTIFIER: return createMessageidentifier();
			case V41Package.MESSAGEVERSION: return createMessageversion();
			case V41Package.RECIPIENT: return createRecipient();
			case V41Package.RECIPIENTAPP: return createRecipientapp();
			case V41Package.RECIPIENTREF: return createRecipientref();
			case V41Package.SCENARIO: return createScenario();
			case V41Package.SENDER: return createSender();
			case V41Package.SENDERAPP: return createSenderapp();
			case V41Package.SUBSET: return createSubset();
			case V41Package.SYNTAXIDENTIFIER: return createSyntaxidentifier();
			case V41Package.TRANSFERSTATUS: return createTransferstatus();
			case V41Package.UNB: return createUnb();
			case V41Package.UNE: return createUne();
			case V41Package.UN_EDIFACT: return createUnEdifact();
			case V41Package.UNG: return createUng();
			case V41Package.UNH: return createUnh();
			case V41Package.UNT: return createUnt();
			case V41Package.UNZ: return createUnz();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datetime createDatetime() {
		DatetimeImpl datetime = new DatetimeImpl();
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementationguideline createImplementationguideline() {
		ImplementationguidelineImpl implementationguideline = new ImplementationguidelineImpl();
		return implementationguideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterchangeMessageType createInterchangeMessageType() {
		InterchangeMessageTypeImpl interchangeMessageType = new InterchangeMessageTypeImpl();
		return interchangeMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messageidentifier createMessageidentifier() {
		MessageidentifierImpl messageidentifier = new MessageidentifierImpl();
		return messageidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Messageversion createMessageversion() {
		MessageversionImpl messageversion = new MessageversionImpl();
		return messageversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipient createRecipient() {
		RecipientImpl recipient = new RecipientImpl();
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipientapp createRecipientapp() {
		RecipientappImpl recipientapp = new RecipientappImpl();
		return recipientapp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipientref createRecipientref() {
		RecipientrefImpl recipientref = new RecipientrefImpl();
		return recipientref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sender createSender() {
		SenderImpl sender = new SenderImpl();
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Senderapp createSenderapp() {
		SenderappImpl senderapp = new SenderappImpl();
		return senderapp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset createSubset() {
		SubsetImpl subset = new SubsetImpl();
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syntaxidentifier createSyntaxidentifier() {
		SyntaxidentifierImpl syntaxidentifier = new SyntaxidentifierImpl();
		return syntaxidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transferstatus createTransferstatus() {
		TransferstatusImpl transferstatus = new TransferstatusImpl();
		return transferstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unb createUnb() {
		UnbImpl unb = new UnbImpl();
		return unb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Une createUne() {
		UneImpl une = new UneImpl();
		return une;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnEdifact createUnEdifact() {
		UnEdifactImpl unEdifact = new UnEdifactImpl();
		return unEdifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ung createUng() {
		UngImpl ung = new UngImpl();
		return ung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unh createUnh() {
		UnhImpl unh = new UnhImpl();
		return unh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unt createUnt() {
		UntImpl unt = new UntImpl();
		return unt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unz createUnz() {
		UnzImpl unz = new UnzImpl();
		return unz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V41Package getV41Package() {
		return (V41Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static V41Package getPackage() {
		return V41Package.eINSTANCE;
	}

} //V41FactoryImpl
