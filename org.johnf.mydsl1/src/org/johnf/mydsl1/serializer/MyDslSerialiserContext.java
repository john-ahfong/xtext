package org.johnf.mydsl1.serializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.johnf.mydsl1.MyDslStandaloneSetup;
import org.johnf.mydsl1.myDsl.Model;

import com.google.inject.Injector;

public class MyDslSerialiserContext {
	public enum ValidationType {
		SYNTAX, ALL, NONE
	}
	
	private final Injector injector;
	
	/**
	 * This constructor is for standalone mode.
	 */
	public MyDslSerialiserContext() {
		this.injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public <T> T getInstance(Class<T> type) {
		return injector.getInstance(type);
	}
	
	public Model loadModel(byte[] contents, ValidationType validateType) throws IOException {
		return loadModel(new ByteArrayInputStream(contents), validateType);
	}
	
	public Model loadModel(InputStream dpmStream, ValidationType validateType) throws IOException {
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		XtextResource resource = (XtextResource) rs.createResource(URI.createURI("dummy:/model.mydsl"));
		resource.load(dpmStream, rs.getLoadOptions());
		
		Model model = (Model) resource.getContents().get(0);
		validateResource(resource, validateType);
		return model;
	}
	
	public void toOutputStream(Model model, OutputStream outputStream) throws IOException {
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		
		Resource resource = rs.createResource(URI.createURI("dummy:/model.mydsl"));
		resource.getContents().clear();
		resource.getContents().add(model);
		SaveOptions options = SaveOptions.newBuilder().noValidation().format().getOptions();
		resource.save(outputStream, options.toOptionsMap());
	}
	

	public String toString(Model model) throws IOException {
		return new String(toByteArray(model), "UTF-8");
	}

	public byte[] toByteArray(Model model) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		toOutputStream(model, outputStream);
		byte[] byteArray = outputStream.toByteArray();
		return byteArray;
	}
	
	public Model emptyModel(String enterpriseName) throws IOException {
		// we want to get the linkage stuff happening so open 'existing' model
		String workspace = "workspace " + enterpriseName + ";\n";
		return loadModel(workspace.getBytes("UTF-8"), ValidationType.ALL);
	}
	
	private void validateResource(XtextResource resource, ValidationType validateType) {
		if ((validateType.equals(ValidationType.SYNTAX) || validateType.equals(ValidationType.ALL)) 
				&& resource.getParseResult().hasSyntaxErrors()) {
			throw new IllegalStateException("Model instance has syntax errors");
		}
		
//		if (validateType.equals(ValidationType.ALL)) {
//			Model model = (Model) resource.getContents().get(0);
//			validateModel(model);
//		}
	}
}
