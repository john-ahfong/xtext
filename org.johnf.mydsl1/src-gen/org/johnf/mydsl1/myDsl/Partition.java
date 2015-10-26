/**
 */
package org.johnf.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.mydsl1.myDsl.Partition#getName <em>Name</em>}</li>
 *   <li>{@link org.johnf.mydsl1.myDsl.Partition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.johnf.mydsl1.myDsl.Partition#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.johnf.mydsl1.myDsl.Partition#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.johnf.mydsl1.myDsl.MyDslPackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends EObject
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
   * @see org.johnf.mydsl1.myDsl.MyDslPackage#getPartition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.johnf.mydsl1.myDsl.Partition#getName <em>Name</em>}' attribute.
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
   * @see org.johnf.mydsl1.myDsl.MyDslPackage#getPartition_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.johnf.mydsl1.myDsl.Partition#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.mydsl1.myDsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference list.
   * @see org.johnf.mydsl1.myDsl.MyDslPackage#getPartition_DataTypes()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getDataTypes();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.mydsl1.myDsl.DefinitionImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.johnf.mydsl1.myDsl.MyDslPackage#getPartition_Imports()
   * @model containment="true"
   * @generated
   */
  EList<DefinitionImport> getImports();

} // Partition
