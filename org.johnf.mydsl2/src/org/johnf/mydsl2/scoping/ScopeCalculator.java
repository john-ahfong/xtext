package org.johnf.mydsl2.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.johnf.mydsl2.myDsl.DataType;
import org.johnf.mydsl2.myDsl.Definition;
import org.johnf.mydsl2.myDsl.DefinitionImport;
import org.johnf.mydsl2.myDsl.Field;
import org.johnf.mydsl2.myDsl.Model;
import org.johnf.mydsl2.myDsl.Partition;

public class ScopeCalculator {

	public static EObject getOwningContainer(EObject obj) {
		EObject container = obj;

		do {
			container = container.eContainer();
		} while (container != null && !(container instanceof Partition));
		return container;
	}

	public static List<DataType> scope_Field_type(Field field) {
		/* Ideally we should use getVisibleDataTypes(Entity) here. The problem is in the way XText works - after we hit
		 * first entity any call to getField() triggers the scope resolution for the accessed field. A recursion. Thus
		 * we use unfiltered list here and enforce validation. */
		return getVisibleDataTypes((Definition) field.getParent());
	}

	public static List<DataType> getVisibleDataTypes(Definition visibleTo) {
		return calculateVisibleDataTypes(visibleTo);
	}

	public static void addVisibleDataTypes(final EObject parent, final List<DataType> dataTypes) {
		EObject container = parent;
		while (!(container instanceof Partition)) {
			container = container.eContainer();
		}

		// Partition's owned DataTypes:
		Partition partition = (Partition) container;
		dataTypes.addAll(partition.getDataTypes());

		dataTypes.remove(parent); // remove Entity subject -- no recursion

		// Partition's imported DataTypes:
		ScopeCalculator.addImportedDefinitions(partition.getImports(), dataTypes, DataType.class);

		// walk back up to Model
		while (!(partition instanceof Model)) {
			partition = (Partition) partition.eContainer();
		}

		// Built-in types from Model:
		dataTypes.addAll(((Model) partition).getBuiltInTypes());
	}

	public static <T extends Definition> void addImportedDefinitions(List<DefinitionImport> imports, List<T> result,
			Class<T> type) {
		for (DefinitionImport defImport : imports) {
			Definition d = defImport.getDefinition();
			// if we have imported a decision tree, we make the types within it visible as well
			addImportedType(result, type, d);
		}
	}

	@SuppressWarnings("unchecked")
	private static <T extends Definition> void addImportedType(List<T> result, Class<T> type, Definition... defs) {
		for (Definition d : defs) {
			if (type.isAssignableFrom(d.getClass())) {
				result.add((T) d);
			}
		}
	}

	private static List<DataType> calculateVisibleDataTypes(EObject visibleTo) {
		List<DataType> dataTypes = new ArrayList<DataType>();
		addVisibleDataTypes(visibleTo, dataTypes);
		return dataTypes;
	}
}
