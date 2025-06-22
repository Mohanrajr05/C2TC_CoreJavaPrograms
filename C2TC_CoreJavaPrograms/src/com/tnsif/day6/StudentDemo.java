package com.tnsif.day6;

public class StudentDemo {
	
	static {
		System.out.println("before main");
	}
 
	public static void main(String[] args) {
		Student s = new Student();
		// s.setId(100); will show warning
		//Student.setId(100);
		System.out.println(s);
		
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println(s2);

	}

	/*static {
	*	System.out.println("hello static");
	* }
	*/
	
	
	// we can overload a main method  but JVM executes only the main method with crt method signatures
	
	public static void main(char c) {
		System.out.println("helo from main method..");
	}
	
	public static void main() {
		System.out.println("helo from no args main method..");
	}
}
