package org.johnf.mydsl1.builtInTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.johnf.mydsl1.myDsl.BuiltInType;
import org.johnf.mydsl1.myDsl.Model;
import org.johnf.mydsl1.myDsl.MyDslFactory;

public final class BuiltInTypes {
	public static final String DECIMAL_NAME = "Decimal";
	public static final String STRING_NAME = "String";
	public static final String INTEGER_NAME = "Integer";
	public static final String BOOLEAN_NAME = "Boolean";
	public static final String DATE_NAME = "Date";
	public static final String DATE_TIME_NAME = "Datetime";
	public static final String ANY_NAME = "Any";

	public static final BuiltInType DECIMAL = createDecimal();
	public static final BuiltInType STRING = createString();
	public static final BuiltInType INTEGER = createInteger();
	public static final BuiltInType BOOLEAN = createBoolean();
	public static final BuiltInType UNKNOWN = createUnknown();
	public static final BuiltInType DATE = createDate();
	public static final BuiltInType DATE_TIME = createDateTime();

	public static final BuiltInType[] BUILT_IN_TYPES = { DECIMAL, STRING, INTEGER, BOOLEAN, DATE, DATE_TIME };

	private BuiltInTypes() {
	}

	public static List<String> getBuiltInTypeNames() {
		List<String> names = new ArrayList<String>();
		for (BuiltInType builtInType : BUILT_IN_TYPES) {
			names.add(builtInType.getName());
		}
		return names;
	}

	public static BuiltInType valueOf(String name) {
		for (BuiltInType type : BUILT_IN_TYPES) {
			if (type.getName().equalsIgnoreCase(name)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * Ensure that the {@link Model} has the right built-in types in its <i>buitInTypes</i> list, replacing / removing
	 * outdated types (type matching by name only).
	 * 
	 * @param model
	 *            the model
	 */
	public static void ensureBuiltInTypes(Model model) {
		ensureHiddenBuiltInTypes(model);
		BuiltInType[] actualBuiltIns = BuiltInTypes.createBuiltInTypes();
		if (model.getBuiltInTypes().size() > 0) { // optimisation
			if (actualBuiltIns.length != model.getBuiltInTypes().size()) {
				model.getBuiltInTypes().clear();
			} else {
				// Compare current built-ins with actualBuilt ins.
				// - compare only names
				// - Order matters
				for (int i = 0; i < actualBuiltIns.length; i++) {
					if (!model.getBuiltInTypes().get(i).getName().equals(actualBuiltIns[i].getName())) {
						model.getBuiltInTypes().clear();
						break;
					}
				}
			}
		}
		if (model.getBuiltInTypes().size() == 0) {
			model.getBuiltInTypes().addAll(0, Arrays.asList(actualBuiltIns));
		}
	}

	private static void ensureHiddenBuiltInTypes(Model model) {
		BuiltInType[] hiddenBuiltIns = BuiltInTypes.createHiddenBuiltInTypes();
		if (model.getHiddenBuiltInTypes().size() > 0) { // optimisation
			if (hiddenBuiltIns.length != model.getHiddenBuiltInTypes().size()) {
				model.getHiddenBuiltInTypes().clear();
			} else {
				// Compare current built-ins with actualBuilt ins.
				// - compare only names
				// - Order matters
				for (int i = 0; i < hiddenBuiltIns.length; i++) {
					if (!model.getHiddenBuiltInTypes().get(i).getName().equals(hiddenBuiltIns[i].getName())) {
						model.getHiddenBuiltInTypes().clear();
						break;
					}
				}
			}
		}
		if (model.getHiddenBuiltInTypes().size() == 0) {
			model.getHiddenBuiltInTypes().addAll(0, Arrays.asList(hiddenBuiltIns));
		}
	}

	public static BuiltInType createBoolean() {
		return createBuiltInType(BOOLEAN_NAME);
	}

	public static BuiltInType createInteger() {
		return createBuiltInType(INTEGER_NAME);
	}

	public static BuiltInType createDecimal() {
		return createBuiltInType(DECIMAL_NAME);
	}

	public static BuiltInType createUnknown() {
		return createBuiltInType("UNKNOWN");
	}

	public static BuiltInType createString() {
		return createBuiltInType(STRING_NAME);
	}

	public static BuiltInType createDate() {
		return createBuiltInType(DATE_NAME);
	}

	public static BuiltInType createDateTime() {
		return createBuiltInType(DATE_TIME_NAME);
	}

	public static BuiltInType createAny() {
		return createBuiltInType(ANY_NAME);
	}

	private static BuiltInType[] createBuiltInTypes() {
		BuiltInType[] types =
				new BuiltInType[] { createString(), createInteger(), createDecimal(), createBoolean(), createDate(),
						createDateTime() };
		return types;
	}

	private static BuiltInType[] createHiddenBuiltInTypes() {
		BuiltInType[] hiddenTypes = new BuiltInType[] { createAny() };
		return hiddenTypes;
	}

	private static BuiltInType createBuiltInType(String typeName) {
		BuiltInType retVal = MyDslFactory.eINSTANCE.createBuiltInType();
		retVal.setName(typeName);
		return retVal;
	}
}
