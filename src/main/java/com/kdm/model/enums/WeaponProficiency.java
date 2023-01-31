package com.kdm.model.enums;

public enum WeaponProficiency {
	NONE("None");

	private String value;

	private WeaponProficiency(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
