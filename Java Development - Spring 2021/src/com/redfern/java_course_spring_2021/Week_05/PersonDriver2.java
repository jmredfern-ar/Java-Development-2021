package com.redfern.java_course_spring_2021.Week_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDriver2 {

	public static void main(String[] args) {
		
		List<Person2> people = new ArrayList<Person2>();
		people.add(new Person2("Williams", "William", 54, false));
		people.add(new Person2("Burger", "Betty", 23, true));
		people.add(new Person2("Sassafras", "Sassy", 44, false));
		
		System.out.println(people);
		
		Collections.sort(people);
		
		System.out.println(people);

	}

}
