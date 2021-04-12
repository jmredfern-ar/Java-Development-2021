package com.redfern.java_course_spring_2021.Week_05;

/*
* string.compareTo(str)
* returns 0 if the strings are equal
* returns a negative integer if the string comes before the str argument in the dictionary order
* returns a positive integer if the string comes after the str argument in the dictionary order
*/
import java.util.Scanner;


public class CompareToDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int result;
		
		while(true) {
			
		System.out.println("Enter 1st String: ");
		str1 = sc.nextLine();
		
		System.out.println("Enter 2nd String: ");
		str2 = sc.nextLine();
		
		result = str1.compareTo(str2);
		//result = "a".compareTo("b");
		System.out.println("\"" + str1 + "\".compareTo(\"" + str2 + "\") = " + result + "\n");
		
		}
	}
}
