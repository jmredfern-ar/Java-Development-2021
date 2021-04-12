package com.redfern.java_course_spring_2021.Week_07;

public class Calculator2 {
	
	// MEM VARS
	
	// METHODS
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	// OVERLOADED ADD METHODS ACCEPTS 2 STRINGS
	public int add(String strNum1, String strNum2) {
		
		int num1, num2;
		
		try {
			num1 = Integer.parseInt(strNum1);
			num2 = Integer.parseInt(strNum2);
			
		} catch(NumberFormatException e) {
			return Integer.MIN_VALUE;
			
		}
			return num1 + num2;
//			return add(num1, num2); // CALL METHOD
	}
	
	public int addNoNulls(String strNum1, String strNum2) throws IllegalArgumentException {
		
		if(strNum1 == null || strNum2 == null) {
			throw new IllegalArgumentException();
		} else {
			return add(strNum1, strNum2);
		}
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	


}
