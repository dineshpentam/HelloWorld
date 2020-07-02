package com.dinesh.bird;

import com.dinesh.Animal.Animal;

public class Bird extends Animal{
protected boolean feather = true;
protected boolean canFly = true;
public Bird() {
	
	this.feather = true;
	this.canFly = true;
}

public String showInfo() {
	return "Bird [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet + ", weightInKilos="
			+ weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
}

}
