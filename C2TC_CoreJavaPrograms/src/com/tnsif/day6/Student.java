//example program for static

package com.tnsif.day6;

public class Student {
	private String sname;
	private static int id; // have a single memory
	private int reg; 
	private final static  int x; //= 100; // final need a declaration at a initalization itself
	
	
	static {   // will executed first
		x = 100; 
		System.out.println("static block executed");
	}
	
	public Student(int x) { // constructors called while crearting objs . In main , obj created 3 times 
		//this.x = x;
		id++; 	//static stroes in one memnry (same memory)
		reg++; 	// every obj have individual memory
		System.out.println("constructor called..");
	} 
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	
	public int getReg() {
		return reg;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}

	@Override
	public String toString() {
		return "Student [id :"+ id + " reg :" + reg + " sname=" + sname + "]";
	}
	 
}
