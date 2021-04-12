package com.redfern.java_course_spring_2021.Week_06;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String strOrig = null;
		StringBuilder sbRvsrd = null; 
		
		while(true) {
			System.out.print("Enter a string >> ");
			strOrig = sc.nextLine().toLowerCase();
			
			sbRvsrd = new StringBuilder(strOrig).reverse();
			
			System.out.println(strOrig + ", " + sbRvsrd);
			if(strOrig.equals(sbRvsrd.toString())) {
				System.out.println("Palindrome!");
			} else {
				System.out.println("Not a palindrome...");
			}
		}
	}
}
