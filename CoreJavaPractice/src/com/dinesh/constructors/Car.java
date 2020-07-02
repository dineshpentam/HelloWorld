package com.dinesh.constructors;

public class Car 
{
  private String doors;
  private String engine;
  private String windows;
  private int speed;
  
  /*public Car()
  {
	  doors = "closed";
	  engine = "on";
	  windows = "closed";
	  speed = 0;
	  
  }*/
  public Car(String doors, String engine, String windows, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.windows = windows;
		this.speed = speed;
  }  
  
  
public String getDoors() {
	return doors;


}
public void setDoors(String doors) {
	this.doors = doors;
}
public String getEngine() {
	return engine;
}
public void setEngine(String engine) {
	this.engine = engine;
}
public String getWindows() {
	return windows;
}
public void setWindows(String windows) {
	this.windows = windows;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
  public String run() {
	  
	  if(doors.equals("closed") && engine.equals("on") && windows.equals("closed") && speed > 0) {
		  return "car is running";
	  }else
		  return "car is not running";
  }
  
}
