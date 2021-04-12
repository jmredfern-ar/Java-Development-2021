package com.redfern.java_course_spring_2021.Week_06;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String strOrig = null;
		String strRvsrd = ""; 
		
		System.out.print("Enter a string >> ");
		strOrig = sc.nextLine().toLowerCase();

		for(int i=strOrig.length()-1; i>=0; i--) {
			strRvsrd += strOrig.charAt(i);
		}
		
		System.out.println(strRvsrd);
		if(strOrig.equals(strRvsrd)) {
			System.out.println("Palindrome!");
		}
	}

}
