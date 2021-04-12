package com.redfern.java_course_spring_2021.Week_06;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PalindromeInterfaceRoyale {

	public static void main(String[] args) {

		PalindromeInterface pD = new PalindromeStringBuilder();
		Scanner sc = new Scanner(System.in);
		String orig = null;
		
		System.out.print("Enter a string >> "); // qwerty 2))))123 421242  345@#%%#@%%#
		try {
			
			orig = sc.nextLine().toLowerCase();
		
		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
			
		} catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(pD.isPalindrome(orig));

	}

}
