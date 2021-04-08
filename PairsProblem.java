//package com.redfern.java_course_spring_2021.Week_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairsProblem {

	public static void main(String[] args) {

		// MEM VARS
		Set<Pair> pairs = new HashSet<Pair>();
		Scanner sc = new Scanner(System.in);
		int times =0, count = 0;
		
		// GET NUMBER OF ENTRIES
		times = Integer.parseInt(sc.nextLine());
		
		// ITERATE NUM TIMES
		for(int i=0; i<times; i++) {
			
			// GET STRINGS
			String[] strs = sc.nextLine().split(" ");
			Pair p = new Pair(strs[0], strs[1]);
			
			// IF PAIR IS NOT IN SET, INCREMENT COUNT
			if(!pairs.contains(p)) {	
				count++;
			}
			
			// ADD PAIR TO SET
			pairs.add(p);
			
			// PRINT COUNT
			System.out.println(count);
		}
		
		// CLOSE THE SCANNER
		sc.close();
	}

}
