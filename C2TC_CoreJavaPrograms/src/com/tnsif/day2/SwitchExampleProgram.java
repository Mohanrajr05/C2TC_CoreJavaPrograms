package com.tnsif.day2;
import java.util.Scanner;

public class SwitchExampleProgram {
	public static void main(String[] args) {
		char x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("options  : l, d,w,s");
		System.out.println("Enter x :");
		x = sc.next().charAt(0);
		switch (x) 
		{
		case 'l' : 
		case 'L' : 
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D' :
			System.out.println(x+" is a Digit");
			break;
		case 'w':
		case 'W' :	
			System.out.println(x+" is White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is Special Symbol");
		default:
			System.out.println(x+" is other than letter, digit, space or special symbol ");
			break;
		}
		
		sc.close();
	
	}
}
