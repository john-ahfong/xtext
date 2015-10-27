package org.johnf.mydsl2.serializer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.johnf.mydsl2.builtInTypes.BuiltInTypesFinder;
import org.johnf.mydsl2.myDsl.BuiltInType;
import org.johnf.mydsl2.myDsl.Entity;
import org.johnf.mydsl2.myDsl.Field;
import org.johnf.mydsl2.myDsl.Model;
import org.johnf.mydsl2.myDsl.MyDslFactory;
import org.johnf.mydsl2.serializer.MyDslSerialiserContext.ValidationType;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class SerializerTest {
	private static final MyDslFactory FACTORY = MyDslFactory.eINSTANCE;
	private final MyDslSerialiserContext context = new MyDslSerialiserContext();
	@Rule 
	public TestName testName = new TestName();
	
	@Before
	public void printTestName() throws Exception {
		System.out.println(testName.getMethodName());
	}
	
	@Test
	public void test_add_1000_entities_with_3_fields_each_to_emptyModel() throws Exception {
		int numEntities = 1000;
		int numFieldsPerEntity = 3;
		
		Model emptyModel = loadModel("test_0_entities_with_0_fields_each.dpm");
		addEntities(emptyModel, numEntities, numFieldsPerEntity);
	}
	
	@Test
	public void test_add_1000_entities_with_0_field_each_to_emptyModel() throws Exception {
		int numEntities = 1000;
		int numFieldsPerEntity = 0;
		
		Model emptyModel = loadModel("test_0_entities_with_0_fields_each.dpm");
		addEntities(emptyModel, numEntities, numFieldsPerEntity);
	}
	
	@Test
	public void test_resave_without_modification_of_model_1000_entities_with_3_fields_each() throws Exception {
		Model model = loadModel("test_1000_entities_with_3_fields_each.dpm");
		toByteArray(model, null);
	}


	
	private void addEntities(Model model, int numEntities, int numFields) throws Exception {
		BuiltInTypesFinder builtInTypesFinder = new BuiltInTypesFinder(model);
		BuiltInType string = builtInTypesFinder.getString();

		for (int i = 0; i < numEntities; i++) {
			Entity entity = FACTORY.createEntity();
			model.getDataTypes().add(entity);
			entity.setName("entity" + i);

			for (int j = 0; j < numFields; j++) {
				Field field = FACTORY.createField();
				field.setType(string);
				field.setName("field" + j);

				entity.getFields().add(field);
			}
		}
		
//		toByteArray(model, "/home/developer/Desktop/test_" + numEntities + "_entities_with_"
//				+ numFields + "_fields_each.dpm");
		
		toByteArray(model, null);
	}

	private Model loadModel(String inputFilename) throws Exception {
		InputStream modelStream = SerializerTest.class.getResourceAsStream("/dpms/" + inputFilename);
		
		long start = System.currentTimeMillis();
		Model model = context.loadModel(modelStream, ValidationType.SYNTAX);
		long end = System.currentTimeMillis();
		System.out.println("Load model  took: " + (end - start));
		
		return model;
	}
	
	private void toByteArray(Model model, String outputFilename) throws Exception {
		long start = System.currentTimeMillis();
		byte[] content = context.toByteArray(model);
		long end = System.currentTimeMillis();
		
		System.out.println("Save model took: " + (end - start));
		
		if (outputFilename != null) {
    		try (FileOutputStream fos =
    				new FileOutputStream(new File(outputFilename));) {
    			fos.write(content);
    		}
		}
		
	}
}
