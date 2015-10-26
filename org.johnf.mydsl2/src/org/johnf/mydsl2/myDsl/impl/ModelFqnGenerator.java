package org.johnf.mydsl2.myDsl.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.johnf.mydsl2.myDsl.CrossReferenceTarget;
import org.johnf.mydsl2.services.MyDslQualifiedNameConverter;

import com.google.inject.Inject;

public class ModelFqnGenerator {
	private final MyDslQualifiedNameConverter converter;
	private final IQualifiedNameProvider provider;
	
	@Inject
	public ModelFqnGenerator(MyDslQualifiedNameConverter converter, IQualifiedNameProvider provider) {
		this.converter = converter;
		this.provider = provider;
	}
	
	public QualifiedName getQualifiedName(EObject def) {
		if (def == null) {
			return null;
		}
		
		if (def instanceof CrossReferenceTarget) {
			return provider.apply(def);
		} 
		
		return null;
	}
	
	public QualifiedName getQualifiedName(EObject def, String name) {
		QualifiedName qualifiedName = getQualifiedName(def);
		if (qualifiedName != null) {
			String fixedname = converter.getEscapedName(name);
			return qualifiedName.append(fixedname);
		} else {
			return null;
		}
	}
	
	public QualifiedName getQualifiedName(String ... names) {
		String[] fixedNames = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			fixedNames[i] = converter.getEscapedName(names[i]);
		}
		return QualifiedName.create(fixedNames);
	}
}