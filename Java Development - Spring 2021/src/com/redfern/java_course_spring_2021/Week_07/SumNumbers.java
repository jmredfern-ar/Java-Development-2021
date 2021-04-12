package com.redfern.java_course_spring_2021.Week_07;

public class SumNumbers {
	
	public long sumNumbers(int[] nums) {
		
		long sum = 0;
		for(int i=0; i< nums.length; i++) {
			sum += nums[i];
		}
		
		return sum;
	}

}
