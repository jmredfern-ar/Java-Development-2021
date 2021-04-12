package com.redfern.java_course_spring_2021.Week_05;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployerDriver2 {

	public static void main(String[] args) {
		Map<Integer, Employee2> empDB = new TreeMap<Integer, Employee2>();
		Set<Integer> jobTitles = new TreeSet<Integer>();
		
		// PUT EMPLOYEE ENTRIES INTO MAP 
		empDB.put(1001, new Employee2("Williams", "William", 54, false));
		
		Employee2 smithJoe = new Employee2("Smith", "Joseph", 30, true);
		smithJoe.setEmployer("ACME, Inc.");
		smithJoe.setJobTitle("Project Manager I");
		smithJoe.setSalary(56000);
		
		empDB.put(9898, smithJoe);
		
		// PRINT MAP
		printMap(empDB);
		
		// UPDATE MAP ENTRY
		Employee2 temp = empDB.get(9898);
		temp.setEmployer("Electric City Cars");
		temp.setJobTitle("Engineer III");
		temp.setSalary(77000);
		empDB.put(9898, temp);
		
		// PRINT MAP
		printMap(empDB);
		
		// LOAD JOB TITLES INTO SET
		for(Map.Entry<Integer, Employee2> entry : empDB.entrySet()) {
			jobTitles.add(entry.getValue().getSalary());
		}
		
		System.out.println(jobTitles);
	}
	
	// STATIC METHOD TO PRINT Map<Integer, Employee2>
	public static void printMap(Map<Integer, Employee2> map) {
		for(Map.Entry<Integer, Employee2> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
