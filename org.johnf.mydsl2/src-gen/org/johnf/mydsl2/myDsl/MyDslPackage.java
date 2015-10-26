/**
 */
package org.johnf.mydsl2.myDsl;

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
 * @see org.johnf.mydsl2.myDsl.MyDslFactory
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
  MyDslPackage eINSTANCE = org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.PartitionImpl <em>Partition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.PartitionImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getPartition()
   * @generated
   */
  int PARTITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTITION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTITION__DATA_TYPES = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTITION__IMPORTS = 3;

  /**
   * The number of structural features of the '<em>Partition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.ModelImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getModel()
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
  int MODEL__NAME = PARTITION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DESCRIPTION = PARTITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DATA_TYPES = PARTITION__DATA_TYPES;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = PARTITION__IMPORTS;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEMS = PARTITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Built In Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BUILT_IN_TYPES = PARTITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hidden Built In Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HIDDEN_BUILT_IN_TYPES = PARTITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = PARTITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.SystemImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = PARTITION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DESCRIPTION = PARTITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DATA_TYPES = PARTITION__DATA_TYPES;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__IMPORTS = PARTITION__IMPORTS;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = PARTITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.DefinitionImportImpl <em>Definition Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.DefinitionImportImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getDefinitionImport()
   * @generated
   */
  int DEFINITION_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_IMPORT__DEFINITION = 0;

  /**
   * The number of structural features of the '<em>Definition Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetImpl <em>Cross Reference Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getCrossReferenceTarget()
   * @generated
   */
  int CROSS_REFERENCE_TARGET = 5;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_REFERENCE_TARGET__INACTIVE = 0;

  /**
   * The number of structural features of the '<em>Cross Reference Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_REFERENCE_TARGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.DefinitionImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__INACTIVE = CROSS_REFERENCE_TARGET__INACTIVE;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.DataTypeImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 6;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__INACTIVE = DEFINITION__INACTIVE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__DESCRIPTION = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.EntityImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 7;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__INACTIVE = DATA_TYPE__INACTIVE;

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
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.BuiltInTypeImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 8;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__INACTIVE = DATA_TYPE__INACTIVE;

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
   * The meta object id for the '{@link org.johnf.mydsl2.myDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.johnf.mydsl2.myDsl.impl.FieldImpl
   * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 9;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__INACTIVE = CROSS_REFERENCE_TARGET__INACTIVE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DESCRIPTION = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LOWER = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Upper Unlimited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UPPER_UNLIMITED = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UPPER = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = CROSS_REFERENCE_TARGET_FEATURE_COUNT + 6;


  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.johnf.mydsl2.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.mydsl2.myDsl.Model#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see org.johnf.mydsl2.myDsl.Model#getSystems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Systems();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.mydsl2.myDsl.Model#getBuiltInTypes <em>Built In Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Built In Types</em>'.
   * @see org.johnf.mydsl2.myDsl.Model#getBuiltInTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_BuiltInTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.mydsl2.myDsl.Model#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hidden Built In Types</em>'.
   * @see org.johnf.mydsl2.myDsl.Model#getHiddenBuiltInTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_HiddenBuiltInTypes();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.johnf.mydsl2.myDsl.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.DefinitionImport <em>Definition Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Import</em>'.
   * @see org.johnf.mydsl2.myDsl.DefinitionImport
   * @generated
   */
  EClass getDefinitionImport();

  /**
   * Returns the meta object for the reference '{@link org.johnf.mydsl2.myDsl.DefinitionImport#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see org.johnf.mydsl2.myDsl.DefinitionImport#getDefinition()
   * @see #getDefinitionImport()
   * @generated
   */
  EReference getDefinitionImport_Definition();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.johnf.mydsl2.myDsl.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.Partition <em>Partition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partition</em>'.
   * @see org.johnf.mydsl2.myDsl.Partition
   * @generated
   */
  EClass getPartition();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Partition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.johnf.mydsl2.myDsl.Partition#getName()
   * @see #getPartition()
   * @generated
   */
  EAttribute getPartition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Partition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.johnf.mydsl2.myDsl.Partition#getDescription()
   * @see #getPartition()
   * @generated
   */
  EAttribute getPartition_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.mydsl2.myDsl.Partition#getDataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Types</em>'.
   * @see org.johnf.mydsl2.myDsl.Partition#getDataTypes()
   * @see #getPartition()
   * @generated
   */
  EReference getPartition_DataTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.mydsl2.myDsl.Partition#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.johnf.mydsl2.myDsl.Partition#getImports()
   * @see #getPartition()
   * @generated
   */
  EReference getPartition_Imports();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.CrossReferenceTarget <em>Cross Reference Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cross Reference Target</em>'.
   * @see org.johnf.mydsl2.myDsl.CrossReferenceTarget
   * @generated
   */
  EClass getCrossReferenceTarget();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.CrossReferenceTarget#isInactive <em>Inactive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inactive</em>'.
   * @see org.johnf.mydsl2.myDsl.CrossReferenceTarget#isInactive()
   * @see #getCrossReferenceTarget()
   * @generated
   */
  EAttribute getCrossReferenceTarget_Inactive();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.johnf.mydsl2.myDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.johnf.mydsl2.myDsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.DataType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.johnf.mydsl2.myDsl.DataType#getDescription()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Description();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.johnf.mydsl2.myDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.johnf.mydsl2.myDsl.Entity#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.johnf.mydsl2.myDsl.Entity#getFields()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Fields();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see org.johnf.mydsl2.myDsl.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for class '{@link org.johnf.mydsl2.myDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.johnf.mydsl2.myDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.johnf.mydsl2.myDsl.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the reference '{@link org.johnf.mydsl2.myDsl.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.johnf.mydsl2.myDsl.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Field#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.johnf.mydsl2.myDsl.Field#getDescription()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Description();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Field#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see org.johnf.mydsl2.myDsl.Field#getLower()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Lower();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Field#isUpperUnlimited <em>Upper Unlimited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Unlimited</em>'.
   * @see org.johnf.mydsl2.myDsl.Field#isUpperUnlimited()
   * @see #getField()
   * @generated
   */
  EAttribute getField_UpperUnlimited();

  /**
   * Returns the meta object for the attribute '{@link org.johnf.mydsl2.myDsl.Field#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see org.johnf.mydsl2.myDsl.Field#getUpper()
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
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.ModelImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEMS = eINSTANCE.getModel_Systems();

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
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.SystemImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.DefinitionImportImpl <em>Definition Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.DefinitionImportImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getDefinitionImport()
     * @generated
     */
    EClass DEFINITION_IMPORT = eINSTANCE.getDefinitionImport();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_IMPORT__DEFINITION = eINSTANCE.getDefinitionImport_Definition();

    /**
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.DefinitionImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.PartitionImpl <em>Partition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.PartitionImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getPartition()
     * @generated
     */
    EClass PARTITION = eINSTANCE.getPartition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTITION__NAME = eINSTANCE.getPartition_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTITION__DESCRIPTION = eINSTANCE.getPartition_Description();

    /**
     * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTITION__DATA_TYPES = eINSTANCE.getPartition_DataTypes();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTITION__IMPORTS = eINSTANCE.getPartition_Imports();

    /**
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetImpl <em>Cross Reference Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.CrossReferenceTargetImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getCrossReferenceTarget()
     * @generated
     */
    EClass CROSS_REFERENCE_TARGET = eINSTANCE.getCrossReferenceTarget();

    /**
     * The meta object literal for the '<em><b>Inactive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CROSS_REFERENCE_TARGET__INACTIVE = eINSTANCE.getCrossReferenceTarget_Inactive();

    /**
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.DataTypeImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getDataType()
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
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.EntityImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getEntity()
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
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.BuiltInTypeImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getBuiltInType()
     * @generated
     */
    EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

    /**
     * The meta object literal for the '{@link org.johnf.mydsl2.myDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.johnf.mydsl2.myDsl.impl.FieldImpl
     * @see org.johnf.mydsl2.myDsl.impl.MyDslPackageImpl#getField()
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
