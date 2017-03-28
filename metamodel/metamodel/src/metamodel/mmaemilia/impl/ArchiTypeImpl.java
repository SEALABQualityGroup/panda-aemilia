/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.impl;

import metamodel.mmaemilia.ArchiElemTypes;
import metamodel.mmaemilia.ArchiTopology;
import metamodel.mmaemilia.ArchiType;

import metamodel.mmaemilia.Headers.AT_Header;

import metamodel.mmaemilia.mmaemiliaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archi Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiTypeImpl#getAetDeclaration <em>Aet Declaration</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiTypeImpl#getAtDeclaration <em>At Declaration</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiTypeImpl#getAtName <em>At Name</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiTypeImpl#getHeader <em>Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchiTypeImpl extends EObjectImpl implements ArchiType {
	/**
	 * The cached value of the '{@link #getAetDeclaration() <em>Aet Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAetDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ArchiElemTypes aetDeclaration;

	/**
	 * The cached value of the '{@link #getAtDeclaration() <em>At Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ArchiTopology atDeclaration;

	/**
	 * The default value of the '{@link #getAtName() <em>At Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtName()
	 * @generated
	 * @ordered
	 */
	protected static final String AT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtName() <em>At Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtName()
	 * @generated
	 * @ordered
	 */
	protected String atName = AT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected AT_Header header;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mmaemiliaPackage.Literals.ARCHI_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemTypes getAetDeclaration() {
		return aetDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAetDeclaration(ArchiElemTypes newAetDeclaration, NotificationChain msgs) {
		ArchiElemTypes oldAetDeclaration = aetDeclaration;
		aetDeclaration = newAetDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION, oldAetDeclaration, newAetDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAetDeclaration(ArchiElemTypes newAetDeclaration) {
		if (newAetDeclaration != aetDeclaration) {
			NotificationChain msgs = null;
			if (aetDeclaration != null)
				msgs = ((InternalEObject)aetDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION, null, msgs);
			if (newAetDeclaration != null)
				msgs = ((InternalEObject)newAetDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION, null, msgs);
			msgs = basicSetAetDeclaration(newAetDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION, newAetDeclaration, newAetDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiTopology getAtDeclaration() {
		return atDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtDeclaration(ArchiTopology newAtDeclaration, NotificationChain msgs) {
		ArchiTopology oldAtDeclaration = atDeclaration;
		atDeclaration = newAtDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION, oldAtDeclaration, newAtDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtDeclaration(ArchiTopology newAtDeclaration) {
		if (newAtDeclaration != atDeclaration) {
			NotificationChain msgs = null;
			if (atDeclaration != null)
				msgs = ((InternalEObject)atDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION, null, msgs);
			if (newAtDeclaration != null)
				msgs = ((InternalEObject)newAtDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION, null, msgs);
			msgs = basicSetAtDeclaration(newAtDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION, newAtDeclaration, newAtDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtName() {
		return atName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtName(String newAtName) {
		String oldAtName = atName;
		atName = newAtName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__AT_NAME, oldAtName, atName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(AT_Header newHeader, NotificationChain msgs) {
		AT_Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(AT_Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mmaemiliaPackage.ARCHI_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mmaemiliaPackage.ARCHI_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION:
				return basicSetAetDeclaration(null, msgs);
			case mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION:
				return basicSetAtDeclaration(null, msgs);
			case mmaemiliaPackage.ARCHI_TYPE__HEADER:
				return basicSetHeader(null, msgs);
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
			case mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION:
				return getAetDeclaration();
			case mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION:
				return getAtDeclaration();
			case mmaemiliaPackage.ARCHI_TYPE__AT_NAME:
				return getAtName();
			case mmaemiliaPackage.ARCHI_TYPE__HEADER:
				return getHeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION:
				setAetDeclaration((ArchiElemTypes)newValue);
				return;
			case mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION:
				setAtDeclaration((ArchiTopology)newValue);
				return;
			case mmaemiliaPackage.ARCHI_TYPE__AT_NAME:
				setAtName((String)newValue);
				return;
			case mmaemiliaPackage.ARCHI_TYPE__HEADER:
				setHeader((AT_Header)newValue);
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
			case mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION:
				setAetDeclaration((ArchiElemTypes)null);
				return;
			case mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION:
				setAtDeclaration((ArchiTopology)null);
				return;
			case mmaemiliaPackage.ARCHI_TYPE__AT_NAME:
				setAtName(AT_NAME_EDEFAULT);
				return;
			case mmaemiliaPackage.ARCHI_TYPE__HEADER:
				setHeader((AT_Header)null);
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
			case mmaemiliaPackage.ARCHI_TYPE__AET_DECLARATION:
				return aetDeclaration != null;
			case mmaemiliaPackage.ARCHI_TYPE__AT_DECLARATION:
				return atDeclaration != null;
			case mmaemiliaPackage.ARCHI_TYPE__AT_NAME:
				return AT_NAME_EDEFAULT == null ? atName != null : !AT_NAME_EDEFAULT.equals(atName);
			case mmaemiliaPackage.ARCHI_TYPE__HEADER:
				return header != null;
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
		result.append(" (atName: ");
		result.append(atName);
		result.append(')');
		return result.toString();
	}

} //ArchiTypeImpl
