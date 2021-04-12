package com.redfern.java_course_spring_2021.Week_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	// STATIC VARS
	static FizzBuzz fb;
	final static String FIZZ = "fizz";
	final static String BUZZ = "buzz";
	final static String FIZZBUZZ = "fizzbuzz";
	final static String BUZZFIZZ = "buzzfizz";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void fizzbuzz_ShouldReturnFizz_GivenIntDivibleByThree() {
		assertEquals(FIZZ, fb.fizzBuzz(3));
	}
	
	// OTHER TESTS...
	
	@Test
	void fizzbuzz_ShouldReturnCorrectString_GivenInt() {
		
		for(int i=1; i<10; i++) {
			String ret = fb.fizzBuzz(i);
			switch(ret) {
				case FIZZBUZZ:
					assertTrue(i %  3 == 0 && i % 5 == 0);
					break;
				case FIZZ:
					assertTrue(i % 3 == 0);
					break;
				case BUZZ:
					assertTrue(i % 5 == 0);
					break;
				case BUZZFIZZ:
					assertEquals(BUZZFIZZ, ret);
					break;
			}
		}
	}
}
