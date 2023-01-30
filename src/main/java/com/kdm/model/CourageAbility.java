package com.kdm.model;

public enum CourageAbility {
	STALWART("Stalwart"), PREPARED("Prepared"), MATCHMAKER("Matchmaker");

	private String value;

	private CourageAbility(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
