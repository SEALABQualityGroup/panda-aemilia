/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.impl;

import java.util.Collection;

import metamodel.mmaemilia.ArchiElemInstance;
import metamodel.mmaemilia.ElemType;
import metamodel.mmaemilia.mmaemiliaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archi Elem Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getActualParam <em>Actual Param</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getInstanceUtilDistr <em>Instance Util Distr</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getInstanceThDistr <em>Instance Th Distr</em>}</li>
 *   <li>{@link metamodel.mmaemilia.impl.ArchiElemInstanceImpl#getInstanceResTimeDistr <em>Instance Res Time Distr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchiElemInstanceImpl extends EObjectImpl implements ArchiElemInstance {
	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActualParam() <em>Actual Param</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParam()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actualParam;

	/**
	 * The cached value of the '{@link #getTypeOf() <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOf()
	 * @generated
	 * @ordered
	 */
	protected ElemType typeOf;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final float THROUGHPUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected float throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final float UTILIZATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected float utilization = UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final float RESPONSE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected float responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstanceUtilDistr() <em>Instance Util Distr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceUtilDistr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instanceUtilDistr;

	/**
	 * The cached value of the '{@link #getInstanceThDistr() <em>Instance Th Distr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceThDistr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instanceThDistr;

	/**
	 * The cached value of the '{@link #getInstanceResTimeDistr() <em>Instance Res Time Distr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceResTimeDistr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instanceResTimeDistr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiElemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActualParam() {
		if (actualParam == null) {
			actualParam = new EDataTypeUniqueEList<String>(String.class, this, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM);
		}
		return actualParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemType getTypeOf() {
		if (typeOf != null && typeOf.eIsProxy()) {
			InternalEObject oldTypeOf = (InternalEObject)typeOf;
			typeOf = (ElemType)eResolveProxy(oldTypeOf);
			if (typeOf != oldTypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__TYPE_OF, oldTypeOf, typeOf));
			}
		}
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemType basicGetTypeOf() {
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOf(ElemType newTypeOf) {
		ElemType oldTypeOf = typeOf;
		typeOf = newTypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__TYPE_OF, oldTypeOf, typeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(float newThroughput) {
		float oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(float newUtilization) {
		float oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__UTILIZATION, oldUtilization, utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(float newResponseTime) {
		float oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInstanceUtilDistr() {
		if (instanceUtilDistr == null) {
			instanceUtilDistr = new EDataTypeUniqueEList<String>(String.class, this, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR);
		}
		return instanceUtilDistr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInstanceThDistr() {
		if (instanceThDistr == null) {
			instanceThDistr = new EDataTypeUniqueEList<String>(String.class, this, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR);
		}
		return instanceThDistr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInstanceResTimeDistr() {
		if (instanceResTimeDistr == null) {
			instanceResTimeDistr = new EDataTypeUniqueEList<String>(String.class, this, mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR);
		}
		return instanceResTimeDistr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_NAME:
				return getInstanceName();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM:
				return getActualParam();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__TYPE_OF:
				if (resolve) return getTypeOf();
				return basicGetTypeOf();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__THROUGHPUT:
				return getThroughput();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__UTILIZATION:
				return getUtilization();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__RESPONSE_TIME:
				return getResponseTime();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR:
				return getInstanceUtilDistr();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR:
				return getInstanceThDistr();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR:
				return getInstanceResTimeDistr();
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
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_NAME:
				setInstanceName((String)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM:
				getActualParam().clear();
				getActualParam().addAll((Collection<? extends String>)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__TYPE_OF:
				setTypeOf((ElemType)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__THROUGHPUT:
				setThroughput((Float)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__UTILIZATION:
				setUtilization((Float)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__RESPONSE_TIME:
				setResponseTime((Float)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR:
				getInstanceUtilDistr().clear();
				getInstanceUtilDistr().addAll((Collection<? extends String>)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR:
				getInstanceThDistr().clear();
				getInstanceThDistr().addAll((Collection<? extends String>)newValue);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR:
				getInstanceResTimeDistr().clear();
				getInstanceResTimeDistr().addAll((Collection<? extends String>)newValue);
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
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM:
				getActualParam().clear();
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__TYPE_OF:
				setTypeOf((ElemType)null);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR:
				getInstanceUtilDistr().clear();
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR:
				getInstanceThDistr().clear();
				return;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR:
				getInstanceResTimeDistr().clear();
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
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM:
				return actualParam != null && !actualParam.isEmpty();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__TYPE_OF:
				return typeOf != null;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__THROUGHPUT:
				return throughput != THROUGHPUT_EDEFAULT;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__UTILIZATION:
				return utilization != UTILIZATION_EDEFAULT;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__RESPONSE_TIME:
				return responseTime != RESPONSE_TIME_EDEFAULT;
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR:
				return instanceUtilDistr != null && !instanceUtilDistr.isEmpty();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR:
				return instanceThDistr != null && !instanceThDistr.isEmpty();
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR:
				return instanceResTimeDistr != null && !instanceResTimeDistr.isEmpty();
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
		result.append(" (instanceName: ");
		result.append(instanceName);
		result.append(", actualParam: ");
		result.append(actualParam);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", utilization: ");
		result.append(utilization);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", instanceUtilDistr: ");
		result.append(instanceUtilDistr);
		result.append(", instanceThDistr: ");
		result.append(instanceThDistr);
		result.append(", InstanceResTimeDistr: ");
		result.append(instanceResTimeDistr);
		result.append(')');
		return result.toString();
	}

} //ArchiElemInstanceImpl
