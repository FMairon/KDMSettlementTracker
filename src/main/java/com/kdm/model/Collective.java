package com.kdm.model;

public class Collective {

	private int amount;

	private Survivor survivor;

	private String descriptor;

	public Collective() {
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Survivor getSurvivor() {
		return survivor;
	}

	public void setSurvivor(Survivor survivor) {
		this.survivor = survivor;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

}
