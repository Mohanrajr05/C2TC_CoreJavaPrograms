//this program demostrate the persons base class

package com.tnsif.day5.inheritancesample;

public class Person {
	private int id;
	private String name;
	private String city;
	
	Person(){   //default constructor 
		this.id=101;
		this.name="mohan";
		this.city = "chennai"; 
	}
	
	Person (int id, String name, String city){
		this.id = id;
		this.name=name;
		this.city = city;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
