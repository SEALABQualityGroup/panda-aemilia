/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.DataType.List#getListElemType <em>List Elem Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.mmaemilia.DataType.DataTypePackage#getList()
 * @model
 * @generated
 */
public interface List extends Normal {
	/**
	 * Returns the value of the '<em><b>List Elem Type</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.mmaemilia.DataType.Normal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elem Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elem Type</em>' containment reference list.
	 * @see metamodel.mmaemilia.DataType.DataTypePackage#getList_ListElemType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Normal> getListElemType();

} // List
