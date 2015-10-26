/**
 */
package org.johnf.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.myDsl.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.johnf.myDsl.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.johnf.myDsl.Model#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.johnf.myDsl.Model#getBuiltInTypes <em>Built In Types</em>}</li>
 *   <li>{@link org.johnf.myDsl.Model#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}</li>
 * </ul>
 *
 * @see org.johnf.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.johnf.myDsl.MyDslPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.johnf.myDsl.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.johnf.myDsl.MyDslPackage#getModel_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.johnf.myDsl.Model#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.myDsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference list.
   * @see org.johnf.myDsl.MyDslPackage#getModel_DataTypes()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getDataTypes();

  /**
   * Returns the value of the '<em><b>Built In Types</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.myDsl.BuiltInType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Built In Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Built In Types</em>' containment reference list.
   * @see org.johnf.myDsl.MyDslPackage#getModel_BuiltInTypes()
   * @model containment="true" transient="true"
   * @generated
   */
  EList<BuiltInType> getBuiltInTypes();

  /**
   * Returns the value of the '<em><b>Hidden Built In Types</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.myDsl.BuiltInType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hidden Built In Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hidden Built In Types</em>' containment reference list.
   * @see org.johnf.myDsl.MyDslPackage#getModel_HiddenBuiltInTypes()
   * @model containment="true" transient="true"
   * @generated
   */
  EList<BuiltInType> getHiddenBuiltInTypes();

} // Model
