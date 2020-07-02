package com.dinesh.forloop;

public class IsPrimeOrNot 
{
public static void main(String[] args) 
{
	 int num = 28;
	 Boolean flag = false;
	 for(int i=2;i<=23/2;i++)
	 {
		 if(num%i==0)
		 {
			 flag = true;
			 break;
			 
		 }
}
		 
	 
if(!flag)
{
	 System.out.println("given number is prime number");
	 
}
else
{
	 System.out.println("given number is not a prime number");

		 
		 
} 
}
}

