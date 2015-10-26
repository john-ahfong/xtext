package org.johnf.mydsl2.services;

import java.util.List;

import org.apache.commons.lang.Validate;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;
import org.eclipse.xtext.util.Strings;
import org.johnf.mydsl2.utils.GrammarKeywords;

import com.google.inject.Inject;

public class MyDslQualifiedNameConverter extends DefaultImpl {
	private final GrammarKeywords grammarKeywords;
	
	@Inject
	public MyDslQualifiedNameConverter(final GrammarKeywords grammarKeywords) {
		this.grammarKeywords = grammarKeywords;
	}
	
	@Override
	public QualifiedName toQualifiedName(String qualifiedNameAsString) {
		Validate.notNull(qualifiedNameAsString, "Qualified name cannot be null");
		Validate.notEmpty(qualifiedNameAsString, "Qualified name cannot be empty");

		List<String> segs = Strings.split(qualifiedNameAsString, getDelimiter());
		for (int i = 0; i < segs.size(); i++) {
			segs.set(i, getEscapedName(segs.get(i)));
		}
		
		return QualifiedName.create(segs);
	}
	
	public String getEscapedName(String name) {
		if (grammarKeywords.isKeyword(name)) {
			return "^" + name;
		} else {
			return name;
		}
	}
}
