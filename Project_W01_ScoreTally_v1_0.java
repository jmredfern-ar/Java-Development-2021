package com.redfern.java_course_spring_2021;

/*
 * Score Tally Write a program to compare the elements of two arrays. 
 * The first array will represent judging scores for Student A. 
 * The second array will represent judging scores for Student B. 
 * The answer should represent the number of judges that voted for each student. 
 * So, if Student A has scores [8, 2, 3, 1] and Student B has scores [3, 4, 5, 6], 
 * then the result will be [1,3] since Student A won 1 judge and Student B 
 * won 3 judges. Ties will not award a point to either Student.
 *
 * int[] studentA = {8, 2, 3, 1};
 * int[] studentB = {3, 4, 5, 6};
 *
 * // your calculation goes here
 *
 * int[] results = {studentATally, studentBTally};
 * // print result
 */

public class Project_W01_ScoreTally_v1_0 {

	public static void main(String[] args) {

		// INIT VARS
		int[] studentA = {8, 2, 3, 1};
		int[] studentB = {3, 4, 5, 6};
		
		int studentATally = 0;
		int studentBTally = 0;

		// COMPUTE SCORES
		for(int i=0; i<studentA.length; i++) {
			
			if(studentA[i] > studentB[i]) {
				studentATally++;
			} else
				studentBTally++;
		}
		
		// PRINT RESULTS
		System.out.println("{" + studentATally + ", " + studentBTally + "}");

	}

}
