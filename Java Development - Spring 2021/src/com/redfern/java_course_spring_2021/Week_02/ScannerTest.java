package com.redfern.java_course_spring_2021.Week_02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ScannerTest {

	public static void main(String[] args) {
		
		// LOCAL VARS
		String firstName = "", lastName = "";
		int grade = -1;
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		
		for(int i=0; i<2; i++) {
		
			// STUDENT ENROLLMENT TOOL - BRANDON U - HOME OF THE FIGHTING ENGLISH BULLDOGS
			System.out.println("WELCOME TO BRANDON U - ENTER STUDENT #" + (i + 1) + " FIRST NAME");
			firstName = sc.nextLine();
			
			System.out.println("ENTER STUDENT LAST NAME");
			lastName = sc.nextLine();
			
			System.out.println("ENTER STUDENT GRADE");
			grade = Integer.valueOf(sc.nextLine());
			
			Student student = new Student(firstName, lastName, grade);
			students.add(student);
			
			//System.out.println(student);
		}
		System.out.println("Enrollment completed.");
		
		for(int i=0; i<students.size(); i++) {
			
			System.out.println(students.get(i).toString());
			
		}
	}

}
