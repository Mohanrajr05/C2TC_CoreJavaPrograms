package com.tnsif.day1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc; 
		sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		
		a= sc.nextInt();
		System.out.println("Enter b:");
		b= sc.nextInt();
		c=a+b;
		
		System.out.println("Addition of a= "+a+" and b= "+b+" is "+c);
		
		System.out.println("Enter your salary: ");
		
		double salary = sc.nextDouble();
		
		System.out.println("Enter your name : ");
		
		sc.nextLine();
		
		String name = sc.nextLine();
		
		System.out.println("enter your initial :");
		String  initial  = sc.next();
		
		System.out.println("Name : "+name+" "+initial+ " Salary : "+salary);
		
		sc.close();

		
		
	}

}
