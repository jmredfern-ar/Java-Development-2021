package com.redfern.java_course_spring_2021.Week_04;

import java.util.Random;
import java.util.Objects;


public class Barney {

    private int health;
    private Random rand;

    public Barney() {

    	rand = new Random();
    	health = rollForHealth(20);
    	print("Barney enters the battle!");
    	print("Health is: " + health);
    }

    public void setHealth(int h) {
    	this.health = h;
    }

    public int getHealth() {
    	return this.health;
    }

    public void printTragicBackstory() {
    	print("");
    	print("       Exhausted by the grind of local access childrens' programming");
    	print("		The famous purple dinosaur reaches back into his evolutionary past");
    	print("                     and transforms into... BEYOND BARNEY!");
    	print("Powers: Armed with Sadness Ray, Has Majestic Flaming Antlers Growing Out Of Head.");
    	print("");
    }

    public int sadnessRay() { //Attack

    	print("Deals area of effect damage as opponents sob uncontrollably.");
    	return rollForDamageDealt(6);
    }

    public int flamingAntlers() { //Attack

    	print("Gores opponents and deals additional burn damage while singing 'I love you, you love me!'");
    	return rollForDamageDealt(6);
    }

    public int rollForHealth(int die) {
    	return rand.nextInt(die) + 1;
    }

    public int rollForDamageDealt(int die) {
    	return rand.nextInt(die) + 1;
    }

    public int rollSavingThrow(int  die) {
    	return rand.nextInt(die) + 1;
    }

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