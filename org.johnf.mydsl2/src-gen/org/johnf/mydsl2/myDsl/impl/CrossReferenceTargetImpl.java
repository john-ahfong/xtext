/**
 */
package org.johnf.mydsl2.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.johnf.mydsl2.myDsl.CrossReferenceTarget;
import org.johnf.mydsl2.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Reference Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetImpl#isInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossReferenceTargetImpl extends MinimalEObjectImpl.Container implements CrossReferenceTarget
{
  /**
   * The default value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInactive()
   * @generated
   * @ordered
   */
  protected static final boolean INACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInactive()
   * @generated
   * @ordered
   */
  protected boolean inactive = INACTIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CrossReferenceTargetImpl()
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
    return MyDslPackage.Literals.CROSS_REFERENCE_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInactive()
  {
    return inactive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInactive(boolean newInactive)
  {
    boolean oldInactive = inactive;
    inactive = newInactive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CROSS_REFERENCE_TARGET__INACTIVE, oldInactive, inactive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFQN()
  {
    return org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetHelper.getFQN(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContainerFQN()
  {
    return org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetHelper.getContainerFQN(this);
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
      case MyDslPackage.CROSS_REFERENCE_TARGET__INACTIVE:
        return isInactive();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CROSS_REFERENCE_TARGET__INACTIVE:
        setInactive((Boolean)newValue);
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
      case MyDslPackage.CROSS_REFERENCE_TARGET__INACTIVE:
        setInactive(INACTIVE_EDEFAULT);
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
      case MyDslPackage.CROSS_REFERENCE_TARGET__INACTIVE:
        return inactive != INACTIVE_EDEFAULT;
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
    result.append(" (inactive: ");
    result.append(inactive);
    result.append(')');
    return result.toString();
  }

} //CrossReferenceTargetImpl
