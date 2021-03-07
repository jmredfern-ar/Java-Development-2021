package com.redfern.java_course_spring_2021;

/*
 * 1. Write a program that consumes data from the user for 10 students. 
 * You will need a student class to hold the data:
 *
 * First Name – String
 * Last Name – String
 * Grade – integer
 *
 * You can store the students in an array by using:
 *
 * Student[] students = new Student[10];
 *
 * You will need to use the Scanner class with System.in to retrieve input 
 * from the user. The scanner class has .nextLine() method to get the next 
 * String input from the keyboard. For the grade, you can use 
 * Integer.valueOf(grade) to convert the String to an int. 
 * This is not required if you want to use the .nextInt() method but 
 * know that there is a limitation to doing it that way. You will need to 
 * validate that a non-negative integer has been entered; use 0 if a 
 * negative integer is used. After the user has entered the data for a 
 * student, use the Student class’ toString() method to print out their 
 * full name and grade. 
 *
 * After the 10 students have been entered into the program, it should 
 * calculate and return the average of the grades as a decimal number.
 *
 */
import java.util.Scanner;

public class StudentData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		String fName;
		String lName;
		int grade;
		Scanner sc = new Scanner(System.in);
		final int NUM_STUDENTS = 3;
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<NUM_STUDENTS; i++) {
			
			System.out.print("Enter Student First Name >> ");
			fName = sc.nextLine();
			
			System.out.print("Enter Student Last Name  >> ");
			lName = sc.nextLine();
			
			System.out.print("Enter Student Grade      >> ");
			grade = Integer.valueOf(sc.nextLine());
			if(grade < 0) {
				grade = 0;
			}
			
			students[i] = new Student(fName, lName, grade);
			System.out.println(students[i]);

		}
		
		for(int i=0; i<NUM_STUDENTS; i++) {
			sum += students[i].getGrade();
		}
		
		average = sum / NUM_STUDENTS;
		System.out.println("Average Grade: " + average + "%");
		
		sc.close();

	}
}
