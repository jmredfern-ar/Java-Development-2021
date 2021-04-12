package com.redfern.java_course_spring_2021.Week_02;

public class StudentExample {
	
	// MEM VARS OF OUR CLASS
	private String firstName;
	private String lastName;
	private int grade;
	
	// CONSTRUCTORS - BUILDS OBJECT OF CLASS
	public StudentExample() {
		
	}
	
	public StudentExample(String firstName) {
		this.firstName = firstName;
	}
	
	public StudentExample(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public StudentExample(String firstName, String lastName, int grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}

	// GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// TOSTRING()
	public String toString() {
		return "Name: " + this.lastName + ", " + this.firstName + " / Grade: " + this.grade;
		
	}
	
	public static void main(String[] args) {
		
		// CLASS OBJ REF = new CONSTRUCTOR
		StudentExample sissy = new StudentExample("Sissy", "Roybison", 99);
		StudentExample jeff = new StudentExample("Jeff", "Jefferson", -1);
		
		System.out.println(sissy);
		System.out.println(jeff.toString());

	}
}
