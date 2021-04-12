package com.redfern.java_course_spring_2021.Week_01;

public class ScoreTally{

	  public static void main(String[] args){

	    // Variables

	    int[] studentA = {8, 2, 3, 1};

	    int[] studentB = {3, 4, 5, 6};

	    int studentATally = 0;

	    int studentBTally = 0;

	    // Compare element at each index, find largest

	    for(int i = 0 ; i < 4; i++)

	    if(studentA[i] > studentB[i]) {

	      studentATally += 1;

	     } else {

	       studentBTally += 1;

	     }

	     System.out.println("{" + studentATally + ", " + studentBTally + "}");

	  }

	}