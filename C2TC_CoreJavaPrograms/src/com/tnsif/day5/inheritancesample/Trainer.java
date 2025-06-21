package com.tnsif.day5.inheritancesample;

public class Trainer extends Person {
	private String designation;
	private String location;
	
	public Trainer() { //default constructor
		super(); //calling base class
		this.designation = "program trainer";
		this.location = "Chennai";
	}
	
	public Trainer(int id,String name,String city,String designation,String location) {
		
		super(id,name,city); //calling base class parameteroized
		this.designation = designation;
		this.location = location;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Trainer [id= " +getId()  + " Name= " +getName()+" city= "+ getCity()+ " designation=" + designation + ", location=" + location + "]";
	}
	

}

