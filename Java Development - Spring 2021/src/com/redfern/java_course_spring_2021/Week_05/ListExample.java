package com.redfern.java_course_spring_2021.Week_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ListExample { //ListDriver

	public static void main(String[] args) {
		
		// DECLARE LISTS AND ADD SOME DATA
		List<String> groceryList = new ArrayList<String>();
		List<Integer> vector1 = new Vector<Integer>(Arrays.asList(7, 77, 777, 7777));
		
		groceryList.add("butter"); //0
		groceryList.add("milk"); //1
		groceryList.add("bread"); //2
		groceryList.add("avocados"); //3
		
		for(int i=0; i<groceryList.size(); i += 2) {
			try {
				System.out.println(groceryList.get(i));
			} catch(IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
		
		// ENHANCED FOR LOOP
		for(Integer vec : vector1) {
			System.out.println(vec);
		}
		
	}

}
