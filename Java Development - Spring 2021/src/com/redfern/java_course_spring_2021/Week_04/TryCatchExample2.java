package com.redfern.java_course_spring_2021.Week_04;

import java.util.NoSuchElementException;
import java.util.Random;

public class TryCatchExample2 {

	public static void main(String[] args) {

		// EXAMPLE ONE - CATCHING AN EXCEPTION
		Random rn = new Random();
		int roll = -1; 
		
		try {
			
			//roll = rn.nextInt(6) + 1;
			roll = rn.nextInt(-1);
			
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException encountered: " + e.getMessage());
			
		}
		
		System.out.println(roll);
		
		// EXAMPLE TWO - PRINTING A STACK TRACE
		String str = "forty two";
		
		try {
			
			// JAVA DOESN'T ASSUME THAT THE VALUE OF STR CAN 
			// BE CONVERTED TO AN INT AT COMPILE TIME
			int num = Integer.valueOf(str); 
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resuming program execution...");
		for(int i=0; i<100; i++) {
			System.out.println(i);
		}
		
		// EXAMPLE THREE - THROWING AN EXCEPTION
		try {
			
			throw new NoSuchElementException("test");
			
		} catch(NoSuchElementException e) {
			System.out.println("Exception encountered: " + e.getMessage() );
		}
	}
}
