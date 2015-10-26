/**
 */
package org.johnf.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.johnf.mydsl1.myDsl.DefinitionImport#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.johnf.mydsl1.myDsl.MyDslPackage#getDefinitionImport()
 * @model
 * @generated
 */
public interface DefinitionImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(Definition)
   * @see org.johnf.mydsl1.myDsl.MyDslPackage#getDefinitionImport_Definition()
   * @model
   * @generated
   */
  Definition getDefinition();

  /**
   * Sets the value of the '{@link org.johnf.mydsl1.myDsl.DefinitionImport#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(Definition value);

} // DefinitionImport
