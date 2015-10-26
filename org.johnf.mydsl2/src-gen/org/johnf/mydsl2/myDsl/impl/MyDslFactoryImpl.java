/**
 */
package org.johnf.mydsl2.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.johnf.mydsl2.myDsl.BuiltInType;
import org.johnf.mydsl2.myDsl.CrossReferenceTarget;
import org.johnf.mydsl2.myDsl.DataType;
import org.johnf.mydsl2.myDsl.Definition;
import org.johnf.mydsl2.myDsl.DefinitionImport;
import org.johnf.mydsl2.myDsl.Entity;
import org.johnf.mydsl2.myDsl.Field;
import org.johnf.mydsl2.myDsl.Model;
import org.johnf.mydsl2.myDsl.MyDslFactory;
import org.johnf.mydsl2.myDsl.MyDslPackage;
import org.johnf.mydsl2.myDsl.Partition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.SYSTEM: return createSystem();
      case MyDslPackage.DEFINITION_IMPORT: return createDefinitionImport();
      case MyDslPackage.DEFINITION: return createDefinition();
      case MyDslPackage.PARTITION: return createPartition();
      case MyDslPackage.CROSS_REFERENCE_TARGET: return createCrossReferenceTarget();
      case MyDslPackage.DATA_TYPE: return createDataType();
      case MyDslPackage.ENTITY: return createEntity();
      case MyDslPackage.BUILT_IN_TYPE: return createBuiltInType();
      case MyDslPackage.FIELD: return createField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.johnf.mydsl2.myDsl.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionImport createDefinitionImport()
  {
    DefinitionImportImpl definitionImport = new DefinitionImportImpl();
    return definitionImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Partition createPartition()
  {
    PartitionImpl partition = new PartitionImpl();
    return partition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrossReferenceTarget createCrossReferenceTarget()
  {
    CrossReferenceTargetImpl crossReferenceTarget = new CrossReferenceTargetImpl();
    return crossReferenceTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInType createBuiltInType()
  {
    BuiltInTypeImpl builtInType = new BuiltInTypeImpl();
    return builtInType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
