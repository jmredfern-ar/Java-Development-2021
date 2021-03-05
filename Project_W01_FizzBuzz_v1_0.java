package com.redfern.java_course_spring_2021;

/*
 * Write a program that will loop through the numbers 1 and 10 
 * and will print a new line (use System.out.println() to print) 
 * to the console based on the following rules:
 * 		a) if the number is divisible by 3, print the word fizz
 * 		b) if the number is divisible by 5, print the word buzz
 * 		c) if the number is divisible by 3 and 5, print the word fizzbuzz
 * 		d) if the number is not divisible by 3 or 5, print the word buzzfizz
 */

public class Project_W01_FizzBuzz_v1_0 {

	public static void main(String[] args) {

		// FOR LOOP
		for(int i=1; i<=10; i++) {
			
			if(i %  3 == 0 && i % 5 == 0) { // DIVISBLE BY 3 *AND* 5 
				System.out.println(i + " fizzbuzz");
			} 
			else if(i % 3 == 0) { // DIVISIBLE BY 3
				System.out.println(i + " fizz");
				
			}
			else if(i % 5 == 0) { //DIVISIBLE BY 5
				System.out.println(i + " buzz");
			}
			else { // NOT DIVISIBLE BY 3 OR 5
				System.out.println(i + " buzzfizz");
			}
		}

	}

}
