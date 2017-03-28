/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archi Elem Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getActualParam <em>Actual Param</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getInstanceUtilDistr <em>Instance Util Distr</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getInstanceThDistr <em>Instance Th Distr</em>}</li>
 *   <li>{@link metamodel.mmaemilia.ArchiElemInstance#getInstanceResTimeDistr <em>Instance Res Time Distr</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance()
 * @model
 * @generated
 */
public interface ArchiElemInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_InstanceName()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiElemInstance#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Actual Param</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Param</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Param</em>' attribute list.
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_ActualParam()
	 * @model
	 * @generated
	 */
	EList<String> getActualParam();

	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' reference.
	 * @see #setTypeOf(ElemType)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_TypeOf()
	 * @model required="true"
	 * @generated
	 */
	ElemType getTypeOf();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiElemInstance#getTypeOf <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of</em>' reference.
	 * @see #getTypeOf()
	 * @generated
	 */
	void setTypeOf(ElemType value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(float)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_Throughput()
	 * @model
	 * @generated
	 */
	float getThroughput();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiElemInstance#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(float value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(float)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_Utilization()
	 * @model
	 * @generated
	 */
	float getUtilization();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiElemInstance#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(float value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(float)
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_ResponseTime()
	 * @model
	 * @generated
	 */
	float getResponseTime();

	/**
	 * Sets the value of the '{@link metamodel.mmaemilia.ArchiElemInstance#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(float value);

	/**
	 * Returns the value of the '<em><b>Instance Util Distr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Util Distr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Util Distr</em>' attribute list.
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_InstanceUtilDistr()
	 * @model
	 * @generated
	 */
	EList<String> getInstanceUtilDistr();

	/**
	 * Returns the value of the '<em><b>Instance Th Distr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Th Distr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Th Distr</em>' attribute list.
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_InstanceThDistr()
	 * @model
	 * @generated
	 */
	EList<String> getInstanceThDistr();

	/**
	 * Returns the value of the '<em><b>Instance Res Time Distr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Res Time Distr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Res Time Distr</em>' attribute list.
	 * @see metamodel.mmaemilia.mmaemiliaPackage#getArchiElemInstance_InstanceResTimeDistr()
	 * @model
	 * @generated
	 */
	EList<String> getInstanceResTimeDistr();

} // ArchiElemInstance
