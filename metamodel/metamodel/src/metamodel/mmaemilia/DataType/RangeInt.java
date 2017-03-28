/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.DataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.DataType.RangeInt#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link metamodel.mmaemilia.DataType.RangeInt#getMaxVal <em>Max Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.mmaemilia.DataType.DataTypePackage#getRangeInt()
 * @model
 * @generated
 */
public interface RangeInt extends metamodel.mmaemilia.DataType.Integer {
	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' attribute.
	 * @see #setMinVal(int)
	 * @see metamodel.mmaemilia.DataType.DataTypePackage#getRangeInt_MinVal()
	 * @model required="true"
	 * @generated
	 */
	int getMinVal();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.DataType.RangeInt#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(int value);

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' attribute.
	 * @see #setMaxVal(int)
	 * @see metamodel.mmaemilia.DataType.DataTypePackage#getRangeInt_MaxVal()
	 * @model required="true"
	 * @generated
	 */
	int getMaxVal();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.DataType.RangeInt#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' attribute.
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(int value);

} // RangeInt
