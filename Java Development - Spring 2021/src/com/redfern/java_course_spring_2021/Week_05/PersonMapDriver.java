package com.redfern.java_course_spring_2021.Week_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PersonMapDriver {

	public static void main(String[] args) {

		Map<String, String> phoneBook = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		// GET NUMBER OF TIMES TO LOOP
		int times = Integer.parseInt(sc.nextLine());
		
		// LOOP THIS MANY TIMES AND GET NAMES AND NUMBERS
		for(int i=0; i<times; i++) {
			String name = sc.nextLine();
			String number = sc.nextLine();
			
			phoneBook.put(name, number);
			
			System.out.println(phoneBook);
		}
		
		// ASK FOR NAMES TO QUERY / LOOK UP IN YOUR PHONEBOOK
		
	}

}
