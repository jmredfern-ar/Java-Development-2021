package com.redfern.java_course_spring_2021.Week_02;

public class Student {
	
	// MEM VARS
	private String firstName;
	private String lastName;
	private int grade;

	// CONSTRUCTORS
	public Student() {
	}
	
	public Student(String firstName, String lastName, int grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = -1;
	}
	
	// TOSTRING()
	public String toString() {
		return "Student: " + firstName + " " + lastName + ", " + grade + "%";
	}
	
	// GETTERS & SETTERS
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + grade;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (grade != other.grade)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
	
}