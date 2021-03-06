/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.mmaemilia.DataType.provider;

import java.util.ArrayList;
import java.util.Collection;

import metamodel.mmaemilia.DataType.util.DataTypeAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeItemProviderAdapterFactory extends DataTypeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Normal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalItemProvider normalItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Normal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalAdapter() {
		if (normalItemProvider == null) {
			normalItemProvider = new NormalItemProvider(this);
		}

		return normalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Special} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialItemProvider specialItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Special}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecialAdapter() {
		if (specialItemProvider == null) {
			specialItemProvider = new SpecialItemProvider(this);
		}

		return specialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Integer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerItemProvider integerItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerAdapter() {
		if (integerItemProvider == null) {
			integerItemProvider = new IntegerItemProvider(this);
		}

		return integerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Record} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordItemProvider recordItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Record}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecordAdapter() {
		if (recordItemProvider == null) {
			recordItemProvider = new RecordItemProvider(this);
		}

		return recordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Array} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayItemProvider arrayItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Array}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayAdapter() {
		if (arrayItemProvider == null) {
			arrayItemProvider = new ArrayItemProvider(this);
		}

		return arrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.List} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemProvider listItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListAdapter() {
		if (listItemProvider == null) {
			listItemProvider = new ListItemProvider(this);
		}

		return listItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAdapter() {
		if (booleanItemProvider == null) {
			booleanItemProvider = new BooleanItemProvider(this);
		}

		return booleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.Real} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealItemProvider realItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.Real}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealAdapter() {
		if (realItemProvider == null) {
			realItemProvider = new RealItemProvider(this);
		}

		return realItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link metamodel.mmaemilia.DataType.RangeInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeIntItemProvider rangeIntItemProvider;

	/**
	 * This creates an adapter for a {@link metamodel.mmaemilia.DataType.RangeInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRangeIntAdapter() {
		if (rangeIntItemProvider == null) {
			rangeIntItemProvider = new RangeIntItemProvider(this);
		}

		return rangeIntItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dataTypeItemProvider != null) dataTypeItemProvider.dispose();
		if (normalItemProvider != null) normalItemProvider.dispose();
		if (specialItemProvider != null) specialItemProvider.dispose();
		if (integerItemProvider != null) integerItemProvider.dispose();
		if (recordItemProvider != null) recordItemProvider.dispose();
		if (arrayItemProvider != null) arrayItemProvider.dispose();
		if (listItemProvider != null) listItemProvider.dispose();
		if (booleanItemProvider != null) booleanItemProvider.dispose();
		if (realItemProvider != null) realItemProvider.dispose();
		if (rangeIntItemProvider != null) rangeIntItemProvider.dispose();
	}

}
