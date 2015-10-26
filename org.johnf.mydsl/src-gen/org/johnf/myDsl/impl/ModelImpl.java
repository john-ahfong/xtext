/**
 */
package org.johnf.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.johnf.myDsl.BuiltInType;
import org.johnf.myDsl.Entity;
import org.johnf.myDsl.Model;
import org.johnf.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.myDsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.johnf.myDsl.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.johnf.myDsl.impl.ModelImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.johnf.myDsl.impl.ModelImpl#getBuiltInTypes <em>Built In Types</em>}</li>
 *   <li>{@link org.johnf.myDsl.impl.ModelImpl#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataTypes()
   * @generated
   * @ordered
   */
  protected EList<Entity> dataTypes;

  /**
   * The cached value of the '{@link #getBuiltInTypes() <em>Built In Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltInTypes()
   * @generated
   * @ordered
   */
  protected EList<BuiltInType> builtInTypes;

  /**
   * The cached value of the '{@link #getHiddenBuiltInTypes() <em>Hidden Built In Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHiddenBuiltInTypes()
   * @generated
   * @ordered
   */
  protected EList<BuiltInType> hiddenBuiltInTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MODEL__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getDataTypes()
  {
    if (dataTypes == null)
    {
      dataTypes = new EObjectContainmentEList<Entity>(Entity.class, this, MyDslPackage.MODEL__DATA_TYPES);
    }
    return dataTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuiltInType> getBuiltInTypes()
  {
    if (builtInTypes == null)
    {
      builtInTypes = new EObjectContainmentEList<BuiltInType>(BuiltInType.class, this, MyDslPackage.MODEL__BUILT_IN_TYPES);
    }
    return builtInTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuiltInType> getHiddenBuiltInTypes()
  {
    if (hiddenBuiltInTypes == null)
    {
      hiddenBuiltInTypes = new EObjectContainmentEList<BuiltInType>(BuiltInType.class, this, MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES);
    }
    return hiddenBuiltInTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__DATA_TYPES:
        return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__BUILT_IN_TYPES:
        return ((InternalEList<?>)getBuiltInTypes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES:
        return ((InternalEList<?>)getHiddenBuiltInTypes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__NAME:
        return getName();
      case MyDslPackage.MODEL__DESCRIPTION:
        return getDescription();
      case MyDslPackage.MODEL__DATA_TYPES:
        return getDataTypes();
      case MyDslPackage.MODEL__BUILT_IN_TYPES:
        return getBuiltInTypes();
      case MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES:
        return getHiddenBuiltInTypes();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.MODEL__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyDslPackage.MODEL__DATA_TYPES:
        getDataTypes().clear();
        getDataTypes().addAll((Collection<? extends Entity>)newValue);
        return;
      case MyDslPackage.MODEL__BUILT_IN_TYPES:
        getBuiltInTypes().clear();
        getBuiltInTypes().addAll((Collection<? extends BuiltInType>)newValue);
        return;
      case MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES:
        getHiddenBuiltInTypes().clear();
        getHiddenBuiltInTypes().addAll((Collection<? extends BuiltInType>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.MODEL__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyDslPackage.MODEL__DATA_TYPES:
        getDataTypes().clear();
        return;
      case MyDslPackage.MODEL__BUILT_IN_TYPES:
        getBuiltInTypes().clear();
        return;
      case MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES:
        getHiddenBuiltInTypes().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.MODEL__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyDslPackage.MODEL__DATA_TYPES:
        return dataTypes != null && !dataTypes.isEmpty();
      case MyDslPackage.MODEL__BUILT_IN_TYPES:
        return builtInTypes != null && !builtInTypes.isEmpty();
      case MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES:
        return hiddenBuiltInTypes != null && !hiddenBuiltInTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
