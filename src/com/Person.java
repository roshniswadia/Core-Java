package com;

public class Person {

	private String name;
	private String nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Person() {
		System.out.println("Person Constructor Called");
	}
	
	public Person(String name, String nationality) {
		super();
		this.name = name;
		this.nationality = nationality;
	}
	
	
}
