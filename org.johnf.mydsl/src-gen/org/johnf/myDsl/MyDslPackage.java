/**
 */
package org.johnf.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.johnf.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.johnf.org/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.johnf.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.johnf.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.myDsl.impl.ModelImpl
   * @see org.johnf.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DATA_TYPES = 2;

  /**
   * The feature id for the '<em><b>Built In Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BUILT_IN_TYPES = 3;

  /**
   * The feature id for the '<em><b>Hidden Built In Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HIDDEN_BUILT_IN_TYPES = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.johnf.myDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.myDsl.impl.DataTypeImpl
   * @see org.johnf.myDsl.impl.MyDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.johnf.myDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.myDsl.impl.EntityImpl
   * @see org.johnf.myDsl.impl.MyDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = DATA_TYPE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FIELDS = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.johnf.myDsl.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.myDsl.impl.BuiltInTypeImpl
   * @see org.johnf.myDsl.impl.MyDslPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Built In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.johnf.myDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.myDsl.impl.FieldImpl
   * @see org.johnf.myDsl.impl.MyDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LOWER = 3;

  /**
   * The feature id for the '<em><b>Upper Unlimited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UPPER_UNLIMITED = 4;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UPPER = 5;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link org.johnf.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.johnf.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.johnf.myDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Model#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.johnf.myDsl.Model#getDescription()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.myDsl.Model#getDataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Types</em>'.
   * @see org.johnf.myDsl.Model#getDataTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DataTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.myDsl.Model#getBuiltInTypes <em>Built In Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Built In Types</em>'.
   * @see org.johnf.myDsl.Model#getBuiltInTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_BuiltInTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.myDsl.Model#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hidden Built In Types</em>'.
   * @see org.johnf.myDsl.Model#getHiddenBuiltInTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_HiddenBuiltInTypes();

  /**
   * Returns the meta object for class '{@link org.johnf.myDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.johnf.myDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.johnf.myDsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.DataType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.johnf.myDsl.DataType#getDescription()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Description();

  /**
   * Returns the meta object for class '{@link org.johnf.myDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.johnf.myDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.myDsl.Entity#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.johnf.myDsl.Entity#getFields()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Fields();

  /**
   * Returns the meta object for class '{@link org.johnf.myDsl.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see org.johnf.myDsl.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for class '{@link org.johnf.myDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.johnf.myDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.johnf.myDsl.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the reference '{@link org.johnf.myDsl.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.johnf.myDsl.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Field#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.johnf.myDsl.Field#getDescription()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Description();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Field#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see org.johnf.myDsl.Field#getLower()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Lower();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Field#isUpperUnlimited <em>Upper Unlimited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Unlimited</em>'.
   * @see org.johnf.myDsl.Field#isUpperUnlimited()
   * @see #getField()
   * @generated
   */
  EAttribute getField_UpperUnlimited();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.myDsl.Field#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see org.johnf.myDsl.Field#getUpper()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Upper();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.johnf.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.myDsl.impl.ModelImpl
     * @see org.johnf.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

    /**
     * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DATA_TYPES = eINSTANCE.getModel_DataTypes();

    /**
     * The meta object literal for the '<em><b>Built In Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BUILT_IN_TYPES = eINSTANCE.getModel_BuiltInTypes();

    /**
     * The meta object literal for the '<em><b>Hidden Built In Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HIDDEN_BUILT_IN_TYPES = eINSTANCE.getModel_HiddenBuiltInTypes();

    /**
     * The meta object literal for the '{@link org.johnf.myDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.myDsl.impl.DataTypeImpl
     * @see org.johnf.myDsl.impl.MyDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__DESCRIPTION = eINSTANCE.getDataType_Description();

    /**
     * The meta object literal for the '{@link org.johnf.myDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.myDsl.impl.EntityImpl
     * @see org.johnf.myDsl.impl.MyDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

    /**
     * The meta object literal for the '{@link org.johnf.myDsl.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.myDsl.impl.BuiltInTypeImpl
     * @see org.johnf.myDsl.impl.MyDslPackageImpl#getBuiltInType()
     * @generated
     */
    EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

    /**
     * The meta object literal for the '{@link org.johnf.myDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.myDsl.impl.FieldImpl
     * @see org.johnf.myDsl.impl.MyDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__DESCRIPTION = eINSTANCE.getField_Description();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__LOWER = eINSTANCE.getField_Lower();

    /**
     * The meta object literal for the '<em><b>Upper Unlimited</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__UPPER_UNLIMITED = eINSTANCE.getField_UpperUnlimited();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__UPPER = eINSTANCE.getField_Upper();

  }

} //MyDslPackage
