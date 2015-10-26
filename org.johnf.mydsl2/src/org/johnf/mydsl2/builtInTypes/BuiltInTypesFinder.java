package org.johnf.mydsl2.builtInTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.johnf.mydsl2.myDsl.BuiltInType;
import org.johnf.mydsl2.myDsl.Field;
import org.johnf.mydsl2.myDsl.Model;

public class BuiltInTypesFinder {
	private Map<String, BuiltInType> builtInTypeMap = new HashMap<String, BuiltInType>();
	private Model model;

	public BuiltInTypesFinder(Model model) {
		this.model = model;

		addBuiltInType(BuiltInTypes.INTEGER_NAME);
		addBuiltInType(BuiltInTypes.DECIMAL_NAME);
		addBuiltInType(BuiltInTypes.STRING_NAME);
		addBuiltInType(BuiltInTypes.BOOLEAN_NAME);
		addBuiltInType(BuiltInTypes.DATE_NAME);
		addBuiltInType(BuiltInTypes.DATE_TIME_NAME);
		addBuiltInType(BuiltInTypes.ANY_NAME);
	}

	public BuiltInType valueOf(String typeName) {
		// short circuit for normal case
		BuiltInType builtInType = builtInTypeMap.get(typeName);
		if (builtInType != null) {
			return builtInType;
		}

		for (BuiltInType type : builtInTypeMap.values()) {
			if (type.getName().equalsIgnoreCase(typeName)) {
				return type;
			}
		}

		return null;
	}

	public BuiltInType getDecimal() {
		return valueOf(BuiltInTypes.DECIMAL_NAME);
	}

	public BuiltInType getInteger() {
		return valueOf(BuiltInTypes.INTEGER_NAME);
	}

	public BuiltInType getString() {
		return valueOf(BuiltInTypes.STRING_NAME);
	}

	public BuiltInType getBool() {
		return valueOf(BuiltInTypes.BOOLEAN_NAME);
	}

	public BuiltInType getDate() {
		return valueOf(BuiltInTypes.DATE_NAME);
	}

	public BuiltInType getDateTime() {
		return valueOf(BuiltInTypes.DATE_TIME_NAME);
	}

	public BuiltInType getAny() {
		return valueOf(BuiltInTypes.ANY_NAME);
	}

	private void addBuiltInType(String typeName) {
		List<BuiltInType> builtInTypes = new ArrayList<BuiltInType>();
		builtInTypes.addAll(model.getBuiltInTypes());
		builtInTypes.addAll(model.getHiddenBuiltInTypes());

		for (BuiltInType bit : builtInTypes) {
			if (bit.getName().equals(typeName)) {
				builtInTypeMap.put(typeName, bit);
			}
		}
	}

	public void fixFieldBuiltInTypeReferences(EObject object) {
		for (TreeIterator<EObject> it = object.eAllContents(); it.hasNext();) {
			EObject child = it.next();
			if (child instanceof Field) {
				Field field = (Field) child;
				if (field.getType() instanceof BuiltInType) {
					BuiltInType attachedType = valueOf(field.getType().getName());
					field.setType(attachedType);
				}
				it.prune();
			}
		}
	}
}
