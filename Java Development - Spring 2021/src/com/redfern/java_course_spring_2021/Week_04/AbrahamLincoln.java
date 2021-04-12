package com.redfern.java_course_spring_2021.Week_04;

import java.util.TreeMap;
import java.util.Map;
import java.util.Random;

public class AbrahamLincoln implements Hero {
	
	Map<Integer, String> attacks = new TreeMap<Integer, String>();
	int health = 0;
	Random rn = new Random();

	@Override
	public String tragicBackstory() {
		String backstory = "HERO: ABRAHAM LINCOLN\n" + 
	                       "TRAGIC BACKSTORY:\n" + 
				           "His untimely assassination merely a cover,\n" +
	                       "'Honest Abe' transforms into 'Hornery Abe',\n" +
				           "shrinking to a mere 6 inches tall and fighting\n" +
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
	public int dealDamage(int die) {
		
		int damage = 0;
		
		try {
			
			damage = rn.nextInt(6) + 1;
		
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException encountered " + e);
		} catch(Exception e) {
			System.out.println("Exception encounterd: " + e);
		}
		
		return damage;
	}

	@Override
	public void addAttack(String attack) {
		
		int lastKey;
		
		try {
			
			if(attacks.isEmpty()) {
				lastKey = 0;
			} 
			else {
				lastKey = ((TreeMap<Integer, String>) attacks).lastEntry().getKey() + 1;
				
			}
			
			attacks.put(lastKey, attack);
			
		} catch(ClassCastException e) {
			System.out.println("ClassCastException encountered: " + e);
		} catch(NullPointerException e) {
			System.out.println("NullPointerException encountered: " + e);
		} catch(Exception e) {
			System.out.println("Exception encounterd: " + e);
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
