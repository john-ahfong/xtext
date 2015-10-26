/**
 */
package org.johnf.mydsl2.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.mydsl2.myDsl.Model#getSystems <em>Systems</em>}</li>
 *   <li>{@link org.johnf.mydsl2.myDsl.Model#getBuiltInTypes <em>Built In Types</em>}</li>
 *   <li>{@link org.johnf.mydsl2.myDsl.Model#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}</li>
 * </ul>
 *
 * @see org.johnf.mydsl2.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Partition
{
  /**
   * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.mydsl2.myDsl.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systems</em>' containment reference list.
   * @see org.johnf.mydsl2.myDsl.MyDslPackage#getModel_Systems()
   * @model containment="true"
   * @generated
   */
  EList<org.johnf.mydsl2.myDsl.System> getSystems();

  /**
   * Returns the value of the '<em><b>Built In Types</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.mydsl2.myDsl.BuiltInType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Built In Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Built In Types</em>' containment reference list.
   * @see org.johnf.mydsl2.myDsl.MyDslPackage#getModel_BuiltInTypes()
   * @model containment="true" transient="true"
   * @generated
   */
  EList<BuiltInType> getBuiltInTypes();

  /**
   * Returns the value of the '<em><b>Hidden Built In Types</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.mydsl2.myDsl.BuiltInType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hidden Built In Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hidden Built In Types</em>' containment reference list.
   * @see org.johnf.mydsl2.myDsl.MyDslPackage#getModel_HiddenBuiltInTypes()
   * @model containment="true" transient="true"
   * @generated
   */
  EList<BuiltInType> getHiddenBuiltInTypes();

} // Model
