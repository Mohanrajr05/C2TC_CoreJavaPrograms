package com.tnsif.day2;

public class Studentdemo {

	public static void main(String[] args) {
		Student st = new Student(); //object st created for student class
		st.setId(101);
		st.setName("Mohan");
		st.setAge(20);
		
		System.out.println(st);
		
		Student st1 = new Student(); //object st1 created for student class
		st1.setId(102);
		st1.setName("Sam");
		st1.setAge(20);
		
		System.out.println(st1);
		
	}

}

