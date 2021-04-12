package com.redfern.java_course_spring_2021.Week_07;

public class ScoreTallyClass {
	
	public int[] scoreTally(int[] studentA, int[] studentB) throws IllegalArgumentException {
		
		// IF THE SCORE ARRAYS ARE DIFF SIZES, THROW EXCEPTION
		if(studentA.length != studentB.length)
			throw new IllegalArgumentException();
		
		int[] tally = new int[2];
		final int A = 0, B = 1;
		
		for(int i = 0 ; i < studentA.length; i++)

		    if(studentA[i] > studentB[i]) {

		      tally[A] += 1;

		     } else {

		       tally[B] += 1;

		     }
		
		return tally;
		
	}

}
