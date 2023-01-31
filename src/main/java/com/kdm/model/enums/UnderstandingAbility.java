package com.kdm.model.enums;

public enum UnderstandingAbility {

	ANALYSE("Analyse"), EXPLORER("Explorer"), TINKER("Tinker"), NONE("None");

	private String value;

	private UnderstandingAbility(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
