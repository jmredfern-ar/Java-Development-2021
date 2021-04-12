package com.redfern.java_course_spring_2021.Week_02;

public class StudentDriver {

	public static void main(String[] args) {

		Student s1 = new Student("Williams", "William", 99);
		Student s2 = new Student("Williams", "Will.I.Am", 99);
		Student s3 = new Student("Williams", "William", 99);
		Student s4 = s1;
		
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s2 equals s3: " + s2.equals(s3));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		System.out.println("s1 equals s4: " + s1.equals(s4));
		
		System.out.println("\n s1 hash: " + s1.hashCode());
	}

}
