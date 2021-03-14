package com.redfern.java_course_spring_2021.Week_04;

import java.util.Objects;

public interface Hero {
	
	// ABSTRACT METHODS
	String tragicBackstory();
	void addAttack(String attack);
	String getAttack();
	void setHealth(Integer health);
	Integer getHealth();
	int damage(int die);
	String toString();
	
	// STATIC METHODS
	public static void print(Object object) {

    	try {

    		String str = Objects.toString(object);
    		for(int i=0; i<str.length(); i++) {
    			System.out.print(str.charAt(i));
    			Thread.sleep(30);
    		}
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
	}
}
