package com.kdm.model;

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
