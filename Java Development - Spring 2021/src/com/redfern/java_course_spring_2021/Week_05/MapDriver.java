package com.redfern.java_course_spring_2021.Week_05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDriver {

	public static void main(String[] args) {
		// CREATE MAP 
		Map<Integer, String> parts = new TreeMap<Integer, String>();
		
		// LOAD MAP
		// Key: Part Number, Value: Part
		parts.put(999, "Motor Oil");
		parts.put(11, "Brake Pads");
		parts.put(818, "Gas Cap");
		parts.put(13, "Tires");
		
		// PERFORM A LOOK UP
		String part = parts.get(818);
		System.out.println("Part found: " + part);
		
		// CHANGE A VALUE
		parts.put(11, "Enhanced Brake Pads");
		System.out.println(parts);
		
		// ITERATE OVER OUR MAP
		//       Datatype            entry     map of entries
		printMap(parts);
	}
	
	public static void printMap(Map<Integer, String> map) {
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key - " + entry.getKey() + " : Value - " + entry.getValue());
		}
	}

}
