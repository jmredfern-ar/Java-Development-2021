package com.redfern.java_course_spring_2021.Week_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SumNumbersTest {
	
	// STATIC VARS
	static SumNumbers sN = null;
	static int[] nums = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
	static long sum = 0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		sN = new SumNumbers();
		for(int i=0; i< nums.length; i++) {
			sum += nums[i];
		}
		
	}

	@Test
	void sumNumbers_ShouldReturnLong_GivenIntArray() {
		assertEquals(sum, sN.sumNumbers(nums));
	}

}
