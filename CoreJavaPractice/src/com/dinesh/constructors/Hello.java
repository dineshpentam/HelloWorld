package com.dinesh.constructors;

public class Hello {
public static void main(String[] args) {
	Car car = new Car("closed","on","closed",22);
	
	/*car.setDoors("closed");
	car.setEngine("on");
	car.setWindows("closed");
	car.setSpeed(10);*/
	
	
	System.out.println(car.run());
	
}
}
