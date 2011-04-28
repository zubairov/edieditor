/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.milyn.edi.unedifact.v41.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.milyn.edi.unedifact.v41.V41Package
 * @generated
 */
public class V41Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static V41Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V41Switch() {
		if (modelPackage == null) {
			modelPackage = V41Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case V41Package.DATETIME: {
				Datetime datetime = (Datetime)theEObject;
				T result = caseDatetime(datetime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.IMPLEMENTATIONGUIDELINE: {
				Implementationguideline implementationguideline = (Implementationguideline)theEObject;
				T result = caseImplementationguideline(implementationguideline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.INTERCHANGE_MESSAGE_TYPE: {
				InterchangeMessageType interchangeMessageType = (InterchangeMessageType)theEObject;
				T result = caseInterchangeMessageType(interchangeMessageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.MESSAGEIDENTIFIER: {
				Messageidentifier messageidentifier = (Messageidentifier)theEObject;
				T result = caseMessageidentifier(messageidentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.MESSAGEVERSION: {
				Messageversion messageversion = (Messageversion)theEObject;
				T result = caseMessageversion(messageversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.RECIPIENT: {
				Recipient recipient = (Recipient)theEObject;
				T result = caseRecipient(recipient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.RECIPIENTAPP: {
				Recipientapp recipientapp = (Recipientapp)theEObject;
				T result = caseRecipientapp(recipientapp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.RECIPIENTREF: {
				Recipientref recipientref = (Recipientref)theEObject;
				T result = caseRecipientref(recipientref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.SENDER: {
				Sender sender = (Sender)theEObject;
				T result = caseSender(sender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.SENDERAPP: {
				Senderapp senderapp = (Senderapp)theEObject;
				T result = caseSenderapp(senderapp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.SUBSET: {
				Subset subset = (Subset)theEObject;
				T result = caseSubset(subset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.SYNTAXIDENTIFIER: {
				Syntaxidentifier syntaxidentifier = (Syntaxidentifier)theEObject;
				T result = caseSyntaxidentifier(syntaxidentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.TRANSFERSTATUS: {
				Transferstatus transferstatus = (Transferstatus)theEObject;
				T result = caseTransferstatus(transferstatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UNB: {
				Unb unb = (Unb)theEObject;
				T result = caseUnb(unb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UNE: {
				Une une = (Une)theEObject;
				T result = caseUne(une);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UN_EDIFACT: {
				UnEdifact unEdifact = (UnEdifact)theEObject;
				T result = caseUnEdifact(unEdifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UNG: {
				Ung ung = (Ung)theEObject;
				T result = caseUng(ung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UNH: {
				Unh unh = (Unh)theEObject;
				T result = caseUnh(unh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UNT: {
				Unt unt = (Unt)theEObject;
				T result = caseUnt(unt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case V41Package.UNZ: {
				Unz unz = (Unz)theEObject;
				T result = caseUnz(unz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datetime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datetime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatetime(Datetime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementationguideline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementationguideline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationguideline(Implementationguideline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interchange Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interchange Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterchangeMessageType(InterchangeMessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Messageidentifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Messageidentifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageidentifier(Messageidentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Messageversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Messageversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageversion(Messageversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecipient(Recipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recipientapp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recipientapp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecipientapp(Recipientapp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recipientref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recipientref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecipientref(Recipientref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSender(Sender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Senderapp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Senderapp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderapp(Senderapp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubset(Subset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntaxidentifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntaxidentifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntaxidentifier(Syntaxidentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transferstatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transferstatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferstatus(Transferstatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnb(Unb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Une</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Une</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUne(Une object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Edifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Edifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnEdifact(UnEdifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUng(Ung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnh(Unh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnt(Unt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnz(Unz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //V41Switch
