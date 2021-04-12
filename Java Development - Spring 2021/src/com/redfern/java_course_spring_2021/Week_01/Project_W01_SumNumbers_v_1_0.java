package com.redfern.java_course_spring_2021.Week_01;

/*
 * Sum Numbers Write a program to calculate the sum of a set of numbers. 
 * Note that the int data type is allocated 4 bytes of memory which can 
 * represent numbers from -2,147,483,648 to 2,147,483,647 and the sum 
 * could be larger than that. The long data type is allocated 8 bytes 
 * of memory which can represent numbers from -9,223,372,036,854,775,808 
 * to 9,223,372,036,854,775,807.
 * int[] numbers = [1, 2, 3, 4];
 *
 * // your calculation here
 * 
 * System.out.println(sum);
 */

public class Project_W01_SumNumbers_v_1_0 {

	public static void main(String[] args) {
		
		int[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		long sum = 0;
		
		for(int i=0; i< numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println(sum);
		System.out.println();
	}

}