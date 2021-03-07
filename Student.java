package com.redfern.java_course_spring_2021;

public class Student {
	
	String firstName;
	String lastName;
	int grade;

	public Student() {
	}
	
	public Student(String firstName, String lastName, int grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public String toString() {
		return "Student: " + firstName + " " + lastName + ", " + grade + "%";
	}
	

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
	
}
