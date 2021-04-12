package com.redfern.java_course_spring_2021.Week_04;

import java.util.Objects;

public interface Hero {
	
	// ABSTRACT METHODS
	String tragicBackstory();
	void addAttack(String attack);
	String getAttack();
	void setHealth(Integer health);
	Integer getHealth();
	int dealDamage(int die);
	String toString();
}
