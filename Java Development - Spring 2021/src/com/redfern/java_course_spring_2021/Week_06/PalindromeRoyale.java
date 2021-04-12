package com.redfern.java_course_spring_2021.Week_06;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PalindromeRoyale {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String orig = null;
		
		System.out.print("Enter a string >> ");
		try {
			
			orig = sc.nextLine().toLowerCase();
		
		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
			
		} catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(stringBuilderMethod(orig));
	}
	
	public static boolean stringBuilderMethod(String orig) {
		StringBuilder rsvd = new StringBuilder(orig).reverse();
		if(orig.equals(rsvd.toString()))
			return true;
		else
			return false;
	}
	
	public static boolean charAtMethod(String orig) {
		
		String rsvd = "";
		for(int i=orig.length()-1; i>=0; i--) {
			rsvd += orig.charAt(i);
		}
		
		if(orig.equals(rsvd))
			return true;		
		return false;
	}

}
