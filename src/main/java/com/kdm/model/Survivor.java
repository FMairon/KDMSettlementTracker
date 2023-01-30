package com.kdm.model;

import java.util.List;

import com.kdm.model.enums.CourageAbility;
import com.kdm.model.enums.Gender;
import com.kdm.model.enums.UnderstandingAbility;
import com.kdm.model.enums.WeaponProficiency;

public class Survivor {

	private String name;
	private String familyName;
	private String title;
	private Gender gender;
	private int huntXp;
	private int survival;
	private int movement;
	private int accuracy;
	private int strength;
	private int evasion;
	private int luck;
	private int speed;
	private int insanity;
	private int courage;
	private CourageAbility courageAbility;
	private int understanding;
	private UnderstandingAbility understandingAbility;
	private int proficiency;
	private WeaponProficiency weaponType;
	private List<String> fightingArts;
	private List<String> disorders;
	private List<String> abilitiesAndImparements;

	public Survivor() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getHuntXp() {
		return huntXp;
	}

	public void setHuntXp(int huntXp) {
		this.huntXp = huntXp;
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

	public int getInsanity() {
		return insanity;
	}

	public void setInsanity(int insanity) {
		this.insanity = insanity;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public CourageAbility getCourageAbility() {
		return courageAbility;
	}

	public void setCourageAbility(CourageAbility courageAbility) {
		this.courageAbility = courageAbility;
	}

	public int getUnderstanding() {
		return understanding;
	}

	public void setUnderstanding(int understanding) {
		this.understanding = understanding;
	}

	public UnderstandingAbility getUnderstandingAbility() {
		return understandingAbility;
	}

	public void setUnderstandingAbility(UnderstandingAbility understandingAbility) {
		this.understandingAbility = understandingAbility;
	}

	public int getProficiency() {
		return proficiency;
	}

	public void setProficiency(int proficiency) {
		this.proficiency = proficiency;
	}

	public WeaponProficiency getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponProficiency weaponType) {
		this.weaponType = weaponType;
	}

	public List<String> getFightingArts() {
		return fightingArts;
	}

	public void setFightingArts(List<String> fightingArts) {
		this.fightingArts = fightingArts;
	}

	public List<String> getDisorders() {
		return disorders;
	}

	public void setDisorders(List<String> disorders) {
		this.disorders = disorders;
	}

	public List<String> getAbilitiesAndImparements() {
		return abilitiesAndImparements;
	}

	public void setAbilitiesAndImparements(List<String> abilitiesAndImparements) {
		this.abilitiesAndImparements = abilitiesAndImparements;
	}

}
