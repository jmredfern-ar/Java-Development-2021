package com.redfern.java_course_spring_2021.Week_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ScoreTallyClassTest {
	
	// STATIC VARS
	static ScoreTallyClass sT = null;
	static int[] studentA = {8, 2, 3, 1};
    static int[] studentB = {3, 4, 5, 6};
    static int[] tally = new int[2];
    static final int A = 0, B = 1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sT = new ScoreTallyClass();
		for(int i = 0 ; i < studentA.length; i++) {
		    if(studentA[i] > studentB[i]) {
		      tally[A] += 1;
		     } else {
		       tally[B] += 1;
		     }
		}
	}

	// Lambda Expressions were added in Java 8.
	// A lambda expression is a short block of code which takes in parameters 
	// and returns a value. Lambda expressions are similar to methods, 
	// but they do not need a name and they can be implemented right in the body of a method.
	@Test
	void scoreTally_ShouldThrowException_GivenDiffArrayLengths() {
		assertThrows(IllegalArgumentException.class, ()-> {sT.scoreTally(new int[] {9,  8, 7},
				                                                         new int[] {3, 4});
		                                                  });
	}
	
	@Test
	void scoreTally_ShouldReturnIntArray_GivenTwoIntArrays() {
		
		int[] ret = sT.scoreTally(studentA, studentB);
		for(int i=0; i<2; i++) {
			assertEquals(tally[i], ret[i]);
		}
	}

}
