package com.redfern.java_course_spring_2021.Week_05;

import java.util.Scanner;

public class CompareToDriver2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int result;
		
		boolean running = true;
		while(running) {
			
			System.out.println("Enter 1st String: ");
			str1 = sc.nextLine();
			
			System.out.println("Enter 2nd String: ");
			str2 = sc.nextLine();
			
			// if either or both is "quit"
			if(str1.equals("quit") || str2.equals("quit")) {
				running = false;
			} else {
				result = str1.compareToIgnoreCase(str2);
				System.out.println("\"" + str1 + "\".compareTo(\"" + str2 + "\") = " + result + "\n");
			}
		}
		System.out.println("Goodbye...");
	}
}
