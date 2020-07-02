package com.dinesh.methods;

public class Methods1 
{
public static void main(String[] args) {
	
	loop(1,20);
	loop(2,30);
	
	
}

public static void loop(int step,int finalValue) {
	while(step<=finalValue)
	{
		System.out.println(step);
		step++;
	}
}

}
