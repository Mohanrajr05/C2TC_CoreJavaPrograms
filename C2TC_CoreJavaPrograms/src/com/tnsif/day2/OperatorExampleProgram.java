package com.tnsif.day2;

public class OperatorExampleProgram {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a;// 11
		int c = ++a + b + a--;  //12 + 20 + 12
		//after execution a=>11
		System.out.println("c value after the operations: " + c);
		System.out.println("a value after the operations: " + a);
		
		int d = c++ + a + b--; // 44 +11 +20
		System.out.println("d value after the operations: " + d);//75
		
		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);

		 x = (10 == x) ? 1 : 0;	
		  System.out.println(x);
	}
}