package com.kdm.model.enums;

public enum CourageAbility {
	STALWART("Stalwart"), PREPARED("Prepared"), MATCHMAKER("Matchmaker"), NONE("None");

	private String value;

	private CourageAbility(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
