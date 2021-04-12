package com.redfern.java_course_spring_2021.Week_04;

import java.util.NoSuchElementException;
import java.util.Random;

public class TryCatchExample {
	
	public static void tryCatchMethodThatThrowsException(String num) throws NumberFormatException, IllegalArgumentException {
		
		System.out.println("Executed example method...");
		
		//IF USER PASSES IN BAD NUMBER, THROW EXCEPTION
		if(num.equals("forty two"))
			throw new NumberFormatException("INVALID NUMBER FORMAT: " + num);
		
	}

	public static void main(String[] args) {
		
		try {
			
			
			tryCatchMethodThatThrowsException("forty two");
		} catch(NumberFormatException e) {
			System.out.println("TryCatchExample.main(): " + e.getMessage());
		} catch(IllegalArgumentException e ) {
			//do something
		}
		
		// TRY / CATCH EXAMPLE NUMBER 1
		String str = "11";
		int num = 0;
		
		try {
			
			num = Integer.valueOf(str);
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("THIS PROGRAM DID NOT IN FACT CRASH. num is: " + num);
		
		// TRY / CATCH EXAMPLE #2
		Random rn = new Random();
		
		int roll = 99;
		
		try {
			
			for(int i=10; i>-2; i--) {
				roll = rn.nextInt(i);
			}
			
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException in TryCatchExample.main(): "  + e.getMessage());
		}
		
		System.out.println(roll);
		
		// TRY / CATCH EXAMPLE #3
		System.out.println("Example #3");
		
		try {
			
			throw new NoSuchElementException("No such element!");
			
		} catch(NoSuchElementException e) {
			System.out.println("Exception encountered in TryCatchExample.main(): " + e.getMessage());
		}
		
		System.out.println("Program ended triumphantly!");
	}

}

