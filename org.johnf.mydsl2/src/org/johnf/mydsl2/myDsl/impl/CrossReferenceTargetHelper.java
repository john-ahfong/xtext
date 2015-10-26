package org.johnf.mydsl2.myDsl.impl;

import org.apache.commons.lang.StringUtils;
import org.eclipse.xtext.naming.QualifiedName;
import org.johnf.mydsl2.myDsl.CrossReferenceTarget;

import com.google.inject.Inject;

public final class CrossReferenceTargetHelper {
	@Inject
    private static ModelFqnGenerator modelFqnGenerator;
	
	private CrossReferenceTargetHelper() {
	}

	public static String getFQN(CrossReferenceTarget def) {
		return replace(modelFqnGenerator.getQualifiedName(def));
	}

	public static String getContainerFQN(CrossReferenceTarget def) {
		return replace(modelFqnGenerator.getQualifiedName(def != null ? def.eContainer() : null));
	}
	
	private static String replace(QualifiedName qname) {
		if (qname != null) {
			String name = qname.toString();
			name = name.replace('.', '/');
			name = StringUtils.remove(name, '^');
			return name;
		} else {
			return null;
		}
	}
}
