package com.redfern.java_course_spring_2021.Week_05;

import java.util.Date;

public class Person implements Comparable<Person>{
	
	// MEM VARS
	private String lastName;
	private String firstName;
	private Date DoB;
	private Integer SSN;
		
	// CONSTRUCTORS
	public Person() {
		super();
	}

	public Person(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	// GETTERS & SETTERS
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}
	
	@Override                             //Wonka           Bond
	public int compareTo(Person person) { //this.compareTo(person)
		int comp = this.lastName.compareTo(person.lastName);
		if(comp == 0) 
			comp = this.firstName.compareTo(person.firstName);
		return comp;
	}
}
