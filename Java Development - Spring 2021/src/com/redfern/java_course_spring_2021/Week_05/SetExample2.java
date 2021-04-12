package com.redfern.java_course_spring_2021.Week_05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample2 {

	// INITIALIZE STATIC TWO SETS	
	public static Set<Integer> setA = new HashSet<Integer>();
	public static Set<Integer> setB = new HashSet<Integer>();
	
	public static void main(String[] args) {
		
		// ADD INTEGERS TO EACH SET	- TWO STRATEGIES
		setA.add(-1);
		setA.add(2);
		setA.add(8);
		setA.add(11);
		setA.add(22);
		
		setB.addAll(Arrays.asList( new Integer[] {1, 3, 2, 4, 8, 9, -1} ));
		
		// PRINT EACH SET
		System.out.println("Sets A & B:");
		System.out.println("setA: " + setA);
		System.out.println("setB: " + setB);
		System.out.println("\n");
		
		// ACCESSING VALUES
		System.out.println("Accessing a value: ");
		System.out.println("setA contains 9: " + setA.contains(9) + "\n");
		
		// INTERSECTION - RETURNS ALL COMMON ELEMENTS OF TWO SETS
		Set<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println("Intersection of setA and setB:");
		System.out.println(intersection + "\n");
		
		//UNION - ADDS ELEMENTS OF ONE SET TO ANOTHER
		Set<Integer> union = new HashSet<Integer>(setA);
		union.addAll(setB);
		System.out.println("Union of setA and setB:");
		System.out.println(union);

		// SORTING THE VALUES OF THE union SET
		System.out.println("\nSorted Set of union of setA and setB");
		SortedSet<Integer> sortedSet = new TreeSet<Integer>(union);
		System.out.println(sortedSet + "\n");
		
		//DIFFERENCE
		Set<Integer> difference = new HashSet<Integer>(setA);
		difference.removeAll(setB);
		System.out.println("Difference - Remove all elements from setB not in setA");
		System.out.println(difference);
		
		
	}

}
