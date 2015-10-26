package org.johnf.mydsl2.myDsl.impl;

import org.johnf.mydsl2.myDsl.Entity;
import org.johnf.mydsl2.myDsl.Field;

public final class FieldHelper {
	private FieldHelper() {
	}

	public static Entity getParent(Field field) {
		return (Entity) field.eContainer();
	}
}
