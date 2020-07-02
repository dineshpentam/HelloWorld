package com.dinesh.helloworld;

import java.math.BigDecimal;

public class HelloWorld 
{
	public static void main(String[] args) {
		char var1 = '\u2606';
		System.out.println(var1);
		BigDecimal d1 = new BigDecimal("1.09");
		BigDecimal d2 = new BigDecimal("2.09");
		System.out.println(d1.add(d2));

	}
}
