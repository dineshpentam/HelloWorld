package com.dinesh.sumofdigits;

public class Hello {
	public static void main(String[] args) {
		int x = 1234;
		int SumOfDigits = 0;
		while(true) {
			SumOfDigits = SumOfDigits + x%10;
			x= x/10;
			if(x<10) {
				break;
			}
			
		}
		SumOfDigits = SumOfDigits + x;
		System.out.println("sum of digits:"+SumOfDigits);
	}

}
