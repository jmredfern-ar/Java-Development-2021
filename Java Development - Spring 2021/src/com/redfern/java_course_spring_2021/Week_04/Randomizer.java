package com.redfern.java_course_spring_2021.Week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Randomizer {

	public static void main(String[] args) {
		
		// LOCAL VARS
		List<Integer> numbers = new Vector<Integer>();
		Random rn = new Random();
		
		for(int i =0; i<10; i++) {
			
			try {
				
				numbers.add(rn.nextInt());
				
			} catch(UnsupportedOperationException e) {
				System.out.println("Exception encountered: " + e);
			} catch(ClassCastException e) {
				System.out.println("Exception encountered: " + e);
			} catch(NullPointerException e) {
				System.out.println("Exception encountered: " + e);
			} catch(IllegalArgumentException e) {
				System.out.println("Exception encountered: " + e);
			}
		}
		
		try {
			
			Collections.sort(numbers);
		
		} catch(ClassCastException e) {
			System.out.println("Exception encountered: " + e);
		} catch(UnsupportedOperationException e) {
			System.out.println("Exception encountered: " + e);
		} catch(IllegalArgumentException e) {
			System.out.println("Exception encountered: " + e);
		}
				
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
		// SEARCH FOR RANDOM NUMBER N IN NUMBERS
		
//		Integer n = rn.nextInt();
//		System.out.println(n);
//		if(Arrays.asList(numbers).contains(n)) {
//			System.out.println("Number found!");
//		} else {
//			System.out.println("Number not found.");
//		}
		

	}

}


