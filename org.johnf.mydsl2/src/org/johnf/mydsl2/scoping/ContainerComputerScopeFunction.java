package org.johnf.mydsl2.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.johnf.mydsl2.myDsl.BuiltInType;
import org.johnf.mydsl2.myDsl.DataType;
import org.johnf.mydsl2.myDsl.impl.ModelFqnGenerator;

import com.google.common.base.Function;

public class ContainerComputerScopeFunction implements Function<DataType, QualifiedName> {
	private final EObject container;
	private final ModelFqnGenerator fqnGenerator;
	
	public ContainerComputerScopeFunction(final ModelFqnGenerator fqnGenerator, EObject parent) {
		this.fqnGenerator = fqnGenerator;
		this.container = ScopeCalculator.getOwningContainer(parent);
	}

	@Override
	public QualifiedName apply(DataType p) {
		if (p == null) {
			return null;
		}
		
		if (p instanceof BuiltInType) {
			return QualifiedName.create(p.getName());
		} else if (p.eContainer() != null && !p.eContainer().equals(container)) {
			return fqnGenerator.getQualifiedName(p);
		} else {
			return fqnGenerator.getQualifiedName(p.getName());
		}
	}
}