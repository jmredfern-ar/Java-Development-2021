package com.redfern.java_course_spring_2021.Week_05;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html

public class Person2 implements Comparable<Person2>{
	
	// MEM VARS
	private String lastName;
	private String firstName;
	private int age;
	private boolean hasAllergies;
	
	// CONSTRUCTORS
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person2(String lastName, String firstName, int age, boolean hasAllergies) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.hasAllergies = hasAllergies;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHasAllergies() {
		return hasAllergies;
	}
	public void setHasAllergies(boolean hasAllergies) {
		this.hasAllergies = hasAllergies;
	}
	
	public String toString() {
		return this.lastName + ", " + this.firstName;
	}
	
	@Override
	public int compareTo(Person2 p) {
		int comp = this.lastName.compareTo(p.lastName);
		if(comp == 0)
			comp = this.firstName.compareTo(p.firstName);
		return comp;
	}


}
