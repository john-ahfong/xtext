/**
 */
package org.johnf.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.myDsl.Entity#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.johnf.myDsl.MyDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DataType
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.johnf.myDsl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.johnf.myDsl.MyDslPackage#getEntity_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Entity
