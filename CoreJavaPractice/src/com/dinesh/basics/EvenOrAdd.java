package com.dinesh.basics;

import java.util.Scanner;

public class EvenOrAdd
{
 public static void main(String[] args) 
{
  int num;
  System.out.println("Enter an integer");
  Scanner sc = new Scanner(System.in);
  num = sc.nextInt();
  
  if(num % 2 == 0)
  {
	  System.out.println("given number is even");
	  
  }
  else
  {
	  System.out.println("given number is odd");
  }
  
}
}
