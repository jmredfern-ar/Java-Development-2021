package com.redfern.java_course_spring_2021.Week_04;

import java.util.Scanner;
import java.util.Objects;
import java.util.Random;

public class SuperFightDriver {
	
	// STATIC METHODS
	public static void print(Object object) {

    	try {

    		String str = Objects.toString(object);
    		for(int i=0; i<str.length(); i++) {
    			System.out.print(str.charAt(i));
    			Thread.sleep(40);
    		}
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
	}
	
	public static void main(String[] args) {

		// LOCAL VARS
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int health = 0;
		int enemyHealth = 20;
		String attack;
		int damage;
		final int DIE = 6;
		
		// INSTANTIATE HERO
		Hero abe = new AbrahamLincoln();
		
		// PRINT TRAGIC BACKSTORY
		print(abe.tragicBackstory());
		
		// ROLL FOR HEALTH btw 1 AND 20
		health = rn.nextInt(20) + 1;
		
		// SET HERO HEALTH
		abe.setHealth(health);
		
		// LOAD ATTACKS into TREEMAP
		abe.addAttack("Has a beard made of bees");
		abe.addAttack("6 inches tall");
		
		// PRINT HERO'S TOSTRING()
		print(abe);
		
		//INITIATE THE BATTLE BY PRESSING ENTER
		print("\nPress enter to initiate the battle...");
		sc.nextLine();
		
		// LAUNCH RANDOM ATTACKS AGAINST ENEMYHEALTH
		boolean running = true;
		while(running) {
			
			attack = abe.getAttack();
			damage = abe.dealDamage(DIE);
			
			print("\nAbe attacks with '" + attack + "' dealing " + damage + " damage.\n");
			enemyHealth -= damage;
			print("Enemy health is now: " + enemyHealth + "\n");
			
			if(enemyHealth <= 0) {
				running = false;
			}
		}
		print("\n***THE BATTLE IS DONE***");
		

	}

}
