/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.milyn.edi.unedifact.v41;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntaxidentifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getId <em>Id</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getVersionNum <em>Version Num</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getServiceCodeListDirVersion <em>Service Code List Dir Version</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getCodedCharacterEncoding <em>Coded Character Encoding</em>}</li>
 *   <li>{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getReleaseNum <em>Release Num</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.milyn.edi.unedifact.v41.V41Package#getSyntaxidentifier()
 * @model extendedMetaData="name='Syntaxidentifier' kind='elementOnly'"
 * @generated
 */
public interface Syntaxidentifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSyntaxidentifier_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Num</em>' attribute.
	 * @see #setVersionNum(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSyntaxidentifier_VersionNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getVersionNum <em>Version Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Num</em>' attribute.
	 * @see #getVersionNum()
	 * @generated
	 */
	void setVersionNum(String value);

	/**
	 * Returns the value of the '<em><b>Service Code List Dir Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Code List Dir Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Code List Dir Version</em>' attribute.
	 * @see #setServiceCodeListDirVersion(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSyntaxidentifier_ServiceCodeListDirVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='serviceCodeListDirVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceCodeListDirVersion();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getServiceCodeListDirVersion <em>Service Code List Dir Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Code List Dir Version</em>' attribute.
	 * @see #getServiceCodeListDirVersion()
	 * @generated
	 */
	void setServiceCodeListDirVersion(String value);

	/**
	 * Returns the value of the '<em><b>Coded Character Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coded Character Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coded Character Encoding</em>' attribute.
	 * @see #setCodedCharacterEncoding(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSyntaxidentifier_CodedCharacterEncoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='codedCharacterEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCodedCharacterEncoding();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getCodedCharacterEncoding <em>Coded Character Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coded Character Encoding</em>' attribute.
	 * @see #getCodedCharacterEncoding()
	 * @generated
	 */
	void setCodedCharacterEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Release Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Num</em>' attribute.
	 * @see #setReleaseNum(String)
	 * @see org.milyn.edi.unedifact.v41.V41Package#getSyntaxidentifier_ReleaseNum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='releaseNum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReleaseNum();

	/**
	 * Sets the value of the '{@link org.milyn.edi.unedifact.v41.Syntaxidentifier#getReleaseNum <em>Release Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Num</em>' attribute.
	 * @see #getReleaseNum()
	 * @generated
	 */
	void setReleaseNum(String value);

} // Syntaxidentifier
