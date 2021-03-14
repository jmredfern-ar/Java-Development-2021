package com.redfern.java_course_spring_2021.Week_04;

import java.util.TreeMap;
import java.util.Random;

public class AbrahamLincoln implements Hero {
	
	TreeMap<Integer, String> attacks = new TreeMap<Integer, String>();
	int health = 0;
	Random rn = new Random();

	@Override
	public String tragicBackstory() {
		String backstory = "ABRAHAM LINCOLN:\n" + 
	                       "His untimely assassination merely a cover,\n" +
	                       "'Honest Abe' transforms into 'Hornery Abe',\n" +
				           "shrinking to a mere 6 inches tall and fighting\n " +
				           "crime with his obediant, stinging army of Apis mellifera!\n";
		return backstory;
	}

	@Override
	public void setHealth(Integer health) {
		this.health = health;

	}

	@Override
	public Integer getHealth() {
		return this.health;
	}

	@Override
	public int damage(int die) {
		//Used to get a random number between 0(inclusive) and the number 
		// passed in this argument(n), exclusive.
		return rn.nextInt(6) + 1;
	}

	@Override
	public void addAttack(String attack) {
		
		int lastKey;
		
		try {
			
			if(attacks.isEmpty()) {
				lastKey = 0;
			} 
			else {
				lastKey = attacks.lastEntry().getKey() + 1;
				
			}
			
			attacks.put(lastKey, attack);
			
		} catch(Exception e) {
			System.out.println("Exception encountered: " + e);
		}
		
	}

	@Override
	public String getAttack() {
		int key = rn.nextInt(2);
		String attack = null;
		
		try {
			
			attack = attacks.get(key);
			
		} catch(Exception e) {
			System.out.println("Exception encounterd: " + e);
		}
		
		return attack;
		
	}
	
	public String toString() {
		return "Health: " + health + "\n" +
	           "Attacks: " + attacks;
	}

}
