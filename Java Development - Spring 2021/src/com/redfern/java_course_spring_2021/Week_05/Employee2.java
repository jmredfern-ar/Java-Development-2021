package com.redfern.java_course_spring_2021.Week_05;

public class Employee2 extends Person2 {
	
	// MEM VARS
	private String employer;
	private String jobTitle;
	private int salary;
	
	// CONSTRUCTORS
	public Employee2() {
	}

	
	public Employee2(String lastName, String firstName, int age, boolean hasAllergies) {
		super(lastName, firstName, age, hasAllergies);
	}


	public Employee2(String employer, String jobTitle, int salary) {
		super();
		this.employer = employer;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	

	public Employee2(String lastName, String firstName, int age, boolean hasAllergies, String employer, String jobTitle,
			int salary) {
		super(lastName, firstName, age, hasAllergies);
		this.employer = employer;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}


	// GETTERS & SETTERS
	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return this.getLastName() + ", " + this.getFirstName() + ": " + employer + ", " + jobTitle + ", $" + salary;
	}
	
	
}
