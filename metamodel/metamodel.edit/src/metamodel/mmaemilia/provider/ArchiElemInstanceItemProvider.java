/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.provider;


import java.util.Collection;
import java.util.List;

import metamodel.mmaemilia.ArchiElemInstance;
import metamodel.mmaemilia.mmaemiliaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metamodel.mmaemilia.ArchiElemInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchiElemInstanceItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInstanceNamePropertyDescriptor(object);
			addActualParamPropertyDescriptor(object);
			addTypeOfPropertyDescriptor(object);
			addThroughputPropertyDescriptor(object);
			addUtilizationPropertyDescriptor(object);
			addResponseTimePropertyDescriptor(object);
			addInstanceUtilDistrPropertyDescriptor(object);
			addInstanceThDistrPropertyDescriptor(object);
			addInstanceResTimeDistrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_instanceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_instanceName_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__INSTANCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_actualParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_actualParam_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_TypeOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_TypeOf_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__TYPE_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throughput feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_throughput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_throughput_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__THROUGHPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_utilization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_utilization_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__UTILIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_responseTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_responseTime_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__RESPONSE_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Util Distr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceUtilDistrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_instanceUtilDistr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_instanceUtilDistr_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Th Distr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceThDistrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_instanceThDistr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_instanceThDistr_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Res Time Distr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceResTimeDistrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchiElemInstance_InstanceResTimeDistr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchiElemInstance_InstanceResTimeDistr_feature", "_UI_ArchiElemInstance_type"),
				 mmaemiliaPackage.Literals.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ArchiElemInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArchiElemInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArchiElemInstance)object).getInstanceName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArchiElemInstance_type") :
			getString("_UI_ArchiElemInstance_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArchiElemInstance.class)) {
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_NAME:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__ACTUAL_PARAM:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__THROUGHPUT:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__UTILIZATION:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__RESPONSE_TIME:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR:
			case mmaemiliaPackage.ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MmAEmiliaEditPlugin.INSTANCE;
	}

}