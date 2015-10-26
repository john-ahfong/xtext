/**
 */
package org.johnf.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.johnf.mydsl1.myDsl.BuiltInType;
import org.johnf.mydsl1.myDsl.Model;
import org.johnf.mydsl1.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.mydsl1.myDsl.impl.ModelImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link org.johnf.mydsl1.myDsl.impl.ModelImpl#getBuiltInTypes <em>Built In Types</em>}</li>
 *   <li>{@link org.johnf.mydsl1.myDsl.impl.ModelImpl#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends PartitionImpl implements Model
{
  /**
   * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystems()
   * @generated
   * @ordered
   */
  protected EList<org.johnf.mydsl1.myDsl.System> systems;

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
  public EList<org.johnf.mydsl1.myDsl.System> getSystems()
  {
    if (systems == null)
    {
      systems = new EObjectContainmentEList<org.johnf.mydsl1.myDsl.System>(org.johnf.mydsl1.myDsl.System.class, this, MyDslPackage.MODEL__SYSTEMS);
    }
    return systems;
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
      case MyDslPackage.MODEL__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.MODEL__SYSTEMS:
        return getSystems();
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
      case MyDslPackage.MODEL__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends org.johnf.mydsl1.myDsl.System>)newValue);
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
      case MyDslPackage.MODEL__SYSTEMS:
        getSystems().clear();
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
      case MyDslPackage.MODEL__SYSTEMS:
        return systems != null && !systems.isEmpty();
      case MyDslPackage.MODEL__BUILT_IN_TYPES:
        return builtInTypes != null && !builtInTypes.isEmpty();
      case MyDslPackage.MODEL__HIDDEN_BUILT_IN_TYPES:
        return hiddenBuiltInTypes != null && !hiddenBuiltInTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
