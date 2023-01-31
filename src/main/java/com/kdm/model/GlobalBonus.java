package com.kdm.model;

import com.kdm.model.enums.BonusValidity;

public class GlobalBonus {

	private BonusValidity validity;
	private int survival;
	private int movement;
	private int accuracy;
	private int strength;
	private int evasion;
	private int luck;
	private int speed;
	private int courage;
	private int understanding;

	public GlobalBonus() {
	}

	public BonusValidity getValidity() {
		return validity;
	}

	public void setValidity(BonusValidity validity) {
		this.validity = validity;
	}

	public int getSurvival() {
		return survival;
	}

	public void setSurvival(int survival) {
		this.survival = survival;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getUnderstanding() {
		return understanding;
	}

	public void setUnderstanding(int understanding) {
		this.understanding = understanding;
	}

}
