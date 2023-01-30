package com.kdm.model.enums;

public enum WeaponProficiency {
	SWORD("Sword");

	private String value;

	private WeaponProficiency(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
