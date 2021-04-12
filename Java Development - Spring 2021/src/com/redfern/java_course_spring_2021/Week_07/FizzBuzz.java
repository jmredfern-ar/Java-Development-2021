package com.redfern.java_course_spring_2021.Week_07;

public class FizzBuzz {
	
	public String fizzBuzz(int n) {
		
		if(n %  3 == 0 && n % 5 == 0) { // DIVISBLE BY 3 *AND* 5 
			return "fizzbuzz";
		} 
		else if(n % 3 == 0) { // DIVISIBLE BY 3
			return "fizz";	
		}
		else if(n % 5 == 0) { //DIVISIBLE BY 5
			return "buzz";
		}
		else { // NOT DIVISIBLE BY 3 OR 5
			return "buzzfizz";
		}		
	}
}
