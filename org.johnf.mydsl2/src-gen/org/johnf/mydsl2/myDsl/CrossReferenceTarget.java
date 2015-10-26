/**
 */
package org.johnf.mydsl2.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Reference Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.mydsl2.myDsl.CrossReferenceTarget#isInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @see org.johnf.mydsl2.myDsl.MyDslPackage#getCrossReferenceTarget()
 * @model
 * @generated
 */
public interface CrossReferenceTarget extends EObject
{
  /**
   * Returns the value of the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inactive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inactive</em>' attribute.
   * @see #setInactive(boolean)
   * @see org.johnf.mydsl2.myDsl.MyDslPackage#getCrossReferenceTarget_Inactive()
   * @model transient="true"
   * @generated
   */
  boolean isInactive();

  /**
   * Sets the value of the '{@link org.johnf.mydsl2.myDsl.CrossReferenceTarget#isInactive <em>Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inactive</em>' attribute.
   * @see #isInactive()
   * @generated
   */
  void setInactive(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetHelper.getFQN(this);'"
   * @generated
   */
  String getFQN();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetHelper.getContainerFQN(this);'"
   * @generated
   */
  String getContainerFQN();

} // CrossReferenceTarget
