//package com.redfern.java_course_spring_2021.Week_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubArrayZeroPractice {

	public static void main(String[] args) {
		
		// STATIC VARIABLES
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();
		List<Integer> subArray;
		Map<Integer, List<Integer>> hM = new HashMap<Integer, List<Integer>>();
		int marker, sum;
		
		// GET AN ARRAY OF NUMBERS
		System.out.print("Gimme some numbers >> ");
		String[] s = sc.nextLine().split(" ");
		
//		System.out.println(Arrays.toString(s));
		
		// CONVERT TO NUMBERS FROM STRING
		for(int i=0; i<s.length; i++) {
			nums.add(Integer.valueOf(s[i]));
		}
		
//		System.out.println(nums.toString());
		
		// 1ST LOOP: ITERATE OVER THE NUMS
		for(int i=0; i<nums.size(); i++) {
			
			marker = i +1;
			
			//2nd LOOP: MOVE MARKER TO THE RIGHT
			while(marker <= nums.size()) {
				
				sum = 0;
				subArray = new ArrayList<>();
				
				// 3rd LOOP: FOR EACH STARTING ELEMENT, LOOP TIL END OF MARKER
				for(int j=i; j<marker; j++) {
					subArray.add(nums.get(j));
					sum += nums.get(j);
				}
				System.out.println(subArray.toString());
				
				// TO DO: IF SUM == 0, CHECK IF <0, SUBARRAY> ARE IN hM,
				// IF NOT, ADD
				// IF SO, CHECK IF SUBARRAY IS LONGER THAN THE VALUE IN THE MAP
				
				marker++;
			}	
		}
	}
}
