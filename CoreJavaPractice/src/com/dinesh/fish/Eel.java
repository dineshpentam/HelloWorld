package com.dinesh.fish;

public class Eel extends Fish{
private String special;

public Eel() {
	super();
	this.special = "Releases Electric Shock";
}


public String showInfo() {
	return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet="
			+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
			+ bloodType + "]";
}


}
