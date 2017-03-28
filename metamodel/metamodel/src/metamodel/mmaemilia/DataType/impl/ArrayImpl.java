/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.DataType.impl;

import java.lang.Integer;

import java.util.Collection;

import metamodel.mmaemilia.DataType.Array;
import metamodel.mmaemilia.DataType.DataTypePackage;
import metamodel.mmaemilia.DataType.Normal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.DataType.impl.ArrayImpl#getLenght <em>Lenght</em>}</li>
 *   <li>{@link metamodel.mmaemilia.DataType.impl.ArrayImpl#getArrayElemType <em>Array Elem Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayImpl extends NormalImpl implements Array {
	/**
	 * The default value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected int lenght = LENGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrayElemType() <em>Array Elem Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayElemType()
	 * @generated
	 * @ordered
	 */
	protected EList<Normal> arrayElemType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypePackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLenght() {
		return lenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLenght(int newLenght) {
		int oldLenght = lenght;
		lenght = newLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypePackage.ARRAY__LENGHT, oldLenght, lenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Normal> getArrayElemType() {
		if (arrayElemType == null) {
			arrayElemType = new EObjectContainmentEList<Normal>(Normal.class, this, DataTypePackage.ARRAY__ARRAY_ELEM_TYPE);
		}
		return arrayElemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypePackage.ARRAY__ARRAY_ELEM_TYPE:
				return ((InternalEList<?>)getArrayElemType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypePackage.ARRAY__LENGHT:
				return getLenght();
			case DataTypePackage.ARRAY__ARRAY_ELEM_TYPE:
				return getArrayElemType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTypePackage.ARRAY__LENGHT:
				setLenght((Integer)newValue);
				return;
			case DataTypePackage.ARRAY__ARRAY_ELEM_TYPE:
				getArrayElemType().clear();
				getArrayElemType().addAll((Collection<? extends Normal>)newValue);
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
			case DataTypePackage.ARRAY__LENGHT:
				setLenght(LENGHT_EDEFAULT);
				return;
			case DataTypePackage.ARRAY__ARRAY_ELEM_TYPE:
				getArrayElemType().clear();
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
			case DataTypePackage.ARRAY__LENGHT:
				return lenght != LENGHT_EDEFAULT;
			case DataTypePackage.ARRAY__ARRAY_ELEM_TYPE:
				return arrayElemType != null && !arrayElemType.isEmpty();
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
		result.append(" (lenght: ");
		result.append(lenght);
		result.append(')');
		return result.toString();
	}

} //ArrayImpl
