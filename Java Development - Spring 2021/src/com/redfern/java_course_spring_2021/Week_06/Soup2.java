package com.redfern.java_course_spring_2021.Week_06;

import java.util.HashSet;
import java.util.Set;

public class Soup2 {
	
	// MEM VARS
	private String flavor;
	private int calories;
	
	// CONSTRUCTOR
	public Soup2(String flavor, int calories) {
		super();
		this.flavor = flavor;
		this.calories = calories;
	}
		
	// TO STRING
	@Override
	public String toString() {
		return "Soup2 [flavor=" + flavor + ", calories=" + calories + "]";
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + calories;
//		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
//		//System.out.println("Called hashCode():" +  result);
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Soup2 other = (Soup2) obj;
//		if (calories != other.calories)
//			return false;
//		if (flavor == null) {
//			if (other.flavor != null)
//				return false;
//		} else if (!flavor.equals(other.flavor))
//			return false;
//		return true;
////	}

	public static void main(String[] args) {
		
		Set<Soup2> soups = new HashSet<Soup2>();
		
		soups.add(new Soup2("Cream of Broccoli", 250));
		soups.add(new Soup2("Chicken Noodle", 175));
		soups.add(new Soup2("Mushroom", 225));
		
		System.out.println(soups);
		
		Soup2 newSoup = new Soup2("Cream of Broccoli", 250);
		
		if(soups.contains(newSoup)) {
			System.out.println("Contains: " + newSoup);
		} else {
			System.out.println("Soup Not Found...");
		}
		
		Soup2 newSoup2 = new Soup2("Cream of Broccoli", 250);
		if(newSoup2.equals(newSoup)) {
			System.out.println("Soups are equal.");
		} else {
			System.out.println("Soups are not equal.");
		}
	}
}
