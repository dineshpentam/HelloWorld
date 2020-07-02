package com.dinesh.reptile;

public class Crocodile extends Reptile
{

	public Crocodile() {
		super();
		egg = "HardShelled";
	}

	
	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backBone=" + backBone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	

}
