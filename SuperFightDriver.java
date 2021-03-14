package com.redfern.java_course_spring_2021.Week_04;

import java.util.Random;

public class SuperFightDriver {

	public static void main(String[] args) {

		// LOCAL VARS
		Random rn = new Random();
		int health = 0;
		
		// INSTANTIATE HERO
		Hero abe = new AbrahamLincoln();
		
		// PRINT TRAGIC BACKSTORY
		System.out.println(abe.tragicBackstory());
		
		// ROLL FOR HEALTH btw 1 AND 20
		health = rn.nextInt(20) + 1;
		
		// SET HEALTH
		abe.setHealth(health);
		
		// LOAD ATTACKS into TREEMAP
		abe.addAttack("Has a beard made of bees");
		abe.addAttack("6 inches tall");
		
		// PRINT VITALS
		System.out.println(abe);
		
		// LAUNCH RANDOM ATTACKS UNTIL THE TOTAL DAMAGE EQUALS 50
		boolean running = true;
		while(running) {
			
		}
		

	}

}
