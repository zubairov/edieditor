/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.milyn.edi.unedifact.v41.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.milyn.edi.unedifact.v41.V41Package
 * @generated
 */
public class V41AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static V41Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V41AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = V41Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected V41Switch<Adapter> modelSwitch =
		new V41Switch<Adapter>() {
			@Override
			public Adapter caseDatetime(Datetime object) {
				return createDatetimeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseImplementationguideline(Implementationguideline object) {
				return createImplementationguidelineAdapter();
			}
			@Override
			public Adapter caseInterchangeMessageType(InterchangeMessageType object) {
				return createInterchangeMessageTypeAdapter();
			}
			@Override
			public Adapter caseMessageidentifier(Messageidentifier object) {
				return createMessageidentifierAdapter();
			}
			@Override
			public Adapter caseMessageversion(Messageversion object) {
				return createMessageversionAdapter();
			}
			@Override
			public Adapter caseRecipient(Recipient object) {
				return createRecipientAdapter();
			}
			@Override
			public Adapter caseRecipientapp(Recipientapp object) {
				return createRecipientappAdapter();
			}
			@Override
			public Adapter caseRecipientref(Recipientref object) {
				return createRecipientrefAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseSender(Sender object) {
				return createSenderAdapter();
			}
			@Override
			public Adapter caseSenderapp(Senderapp object) {
				return createSenderappAdapter();
			}
			@Override
			public Adapter caseSubset(Subset object) {
				return createSubsetAdapter();
			}
			@Override
			public Adapter caseSyntaxidentifier(Syntaxidentifier object) {
				return createSyntaxidentifierAdapter();
			}
			@Override
			public Adapter caseTransferstatus(Transferstatus object) {
				return createTransferstatusAdapter();
			}
			@Override
			public Adapter caseUnb(Unb object) {
				return createUnbAdapter();
			}
			@Override
			public Adapter caseUne(Une object) {
				return createUneAdapter();
			}
			@Override
			public Adapter caseUnEdifact(UnEdifact object) {
				return createUnEdifactAdapter();
			}
			@Override
			public Adapter caseUng(Ung object) {
				return createUngAdapter();
			}
			@Override
			public Adapter caseUnh(Unh object) {
				return createUnhAdapter();
			}
			@Override
			public Adapter caseUnt(Unt object) {
				return createUntAdapter();
			}
			@Override
			public Adapter caseUnz(Unz object) {
				return createUnzAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Datetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Datetime
	 * @generated
	 */
	public Adapter createDatetimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Implementationguideline <em>Implementationguideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Implementationguideline
	 * @generated
	 */
	public Adapter createImplementationguidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.InterchangeMessageType <em>Interchange Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.InterchangeMessageType
	 * @generated
	 */
	public Adapter createInterchangeMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Messageidentifier <em>Messageidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Messageidentifier
	 * @generated
	 */
	public Adapter createMessageidentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Messageversion <em>Messageversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Messageversion
	 * @generated
	 */
	public Adapter createMessageversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Recipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Recipient
	 * @generated
	 */
	public Adapter createRecipientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Recipientapp <em>Recipientapp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Recipientapp
	 * @generated
	 */
	public Adapter createRecipientappAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Recipientref <em>Recipientref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Recipientref
	 * @generated
	 */
	public Adapter createRecipientrefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Sender
	 * @generated
	 */
	public Adapter createSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Senderapp <em>Senderapp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Senderapp
	 * @generated
	 */
	public Adapter createSenderappAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Subset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Subset
	 * @generated
	 */
	public Adapter createSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier <em>Syntaxidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Syntaxidentifier
	 * @generated
	 */
	public Adapter createSyntaxidentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Transferstatus <em>Transferstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Transferstatus
	 * @generated
	 */
	public Adapter createTransferstatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Unb <em>Unb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Unb
	 * @generated
	 */
	public Adapter createUnbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Une <em>Une</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Une
	 * @generated
	 */
	public Adapter createUneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.UnEdifact <em>Un Edifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.UnEdifact
	 * @generated
	 */
	public Adapter createUnEdifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Ung <em>Ung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Ung
	 * @generated
	 */
	public Adapter createUngAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Unh <em>Unh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Unh
	 * @generated
	 */
	public Adapter createUnhAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Unt <em>Unt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Unt
	 * @generated
	 */
	public Adapter createUntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.milyn.edi.unedifact.v41.Unz <em>Unz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.milyn.edi.unedifact.v41.Unz
	 * @generated
	 */
	public Adapter createUnzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //V41AdapterFactory
