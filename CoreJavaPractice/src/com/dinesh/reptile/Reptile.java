package com.dinesh.reptile;

import com.dinesh.Animal.Animal;

public class Reptile extends Animal
{
protected String skin,egg;
protected Boolean backBone;
public Reptile() {
	heightInFeet = 5;
	weightInKilos = 40;
	animalType = "Reptile";
	bloodType = "cold";
	this.skin = "DrySkin";
	this.egg = "SoftShelled";
	this.backBone = true;
}

public String showInfo() {
	return "Reptile [skin=" + skin + ", egg=" + egg + ", backBone=" + backBone + ", heightInFeet=" + heightInFeet
			+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
}






}
