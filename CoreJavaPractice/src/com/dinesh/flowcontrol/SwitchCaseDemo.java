package com.dinesh.flowcontrol;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int x = 3;

		char y = 'D';

		String name = "DinesH";

		switch (x) {
		case 1:
			System.out.println("x is 1");
			break;
		case 2:
			System.out.println("x is 2");
			break;
		case 3:
			System.out.println("x is 3");
			break;
		case 4:
			System.out.println("x is 4");
			break;
		default:
			System.out.println("x is otherthan 1,2,3,4");
			break;

		}
		switch (y) {
		case 'a':
		case 'A':
			System.out.println("y is a");
			break;
		case 'b':
		case 'B':
			System.out.println("y is b");
			break;
		case 'c':
		case 'C':
			System.out.println("y is c");
			break;
		case 'd':
		case 'D':
			System.out.println("y is d");
			break;
		default:
			System.out.println("y is other than a,b,c,d");
			break;
		}

		switch (name.toLowerCase()) {
		case "dinesh":
			System.out.println("Author is Dinesh");
			break;
		case "divya":
			System.out.println("Co-Author is Divya");
			break;
		case "banty":
			System.out.println("editor is Banty");
			break;
		default:
			System.out.println("invalid entry");
			break;
		}

	}

}
