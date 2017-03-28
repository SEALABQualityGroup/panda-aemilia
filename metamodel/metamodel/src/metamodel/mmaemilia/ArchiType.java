/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia;

import metamodel.mmaemilia.Headers.AT_Header;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archi Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.ArchiType#getAetDeclaration <em>Aet Declaration</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiType#getAtDeclaration <em>At Declaration</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiType#getAtName <em>At Name</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiType#getHeader <em>Header</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiType()
 * @model
 * @generated
 */
public interface ArchiType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aet Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aet Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aet Declaration</em>' containment reference.
	 * @see #setAetDeclaration(ArchiElemTypes)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiType_AetDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArchiElemTypes getAetDeclaration();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiType#getAetDeclaration <em>Aet Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aet Declaration</em>' containment reference.
	 * @see #getAetDeclaration()
	 * @generated
	 */
	void setAetDeclaration(ArchiElemTypes value);

	/**
	 * Returns the value of the '<em><b>At Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Declaration</em>' containment reference.
	 * @see #setAtDeclaration(ArchiTopology)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiType_AtDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArchiTopology getAtDeclaration();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiType#getAtDeclaration <em>At Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Declaration</em>' containment reference.
	 * @see #getAtDeclaration()
	 * @generated
	 */
	void setAtDeclaration(ArchiTopology value);

	/**
	 * Returns the value of the '<em><b>At Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Name</em>' attribute.
	 * @see #setAtName(String)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiType_AtName()
	 * @model required="true"
	 * @generated
	 */
	String getAtName();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiType#getAtName <em>At Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Name</em>' attribute.
	 * @see #getAtName()
	 * @generated
	 */
	void setAtName(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(AT_Header)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiType_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AT_Header getHeader();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(AT_Header value);

} // ArchiType
