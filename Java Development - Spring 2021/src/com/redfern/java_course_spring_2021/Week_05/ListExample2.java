package com.redfern.java_course_spring_2021.Week_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ListExample2 {

	public static void main(String[] args) {

		/* 
		 * The object reference (stored in the variable groceryList) is declared to be the type of an Interface, 
		 * its value (assigned via the new keyword) can reference *any* object of a Class that 
		 * implements that Interface.
		 * 
		 * EACH CLASS HAS ITS OWN IMPLEMENTATION
		 */
		
		// Class is ArrayList
		List<String> groceryList = new ArrayList<String>();
		
		//Class is Vector
		List<Integer> vector1 = new Vector<Integer>(Arrays.asList(7, 77, 777, 7777));
		
		System.out.println(groceryList);
		System.out.println(vector1);
		
		groceryList.add("milk");
		groceryList.add("eggs");
		groceryList.add("butter");
		
		// TWO FOR LOOPS
		for(int i=0; i<groceryList.size(); i++)
			System.out.println(groceryList.get(i));
		
		for(String item : groceryList)
			System.out.println(item);

		// CHECKING FOR ELEMENT USING CONTAINS
		System.out.println("Grocery List contains butter? " + groceryList.contains("butter"));
		System.out.println("Vector1 contains 777? " + vector1.contains(777));
	}

}
