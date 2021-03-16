//README: REPLACE THIS PACKAGE WITH YOURS!!!!
package com.redfern.java_course_spring_2021.Week_03;

// ANIMAL SUPERCLASS
public class Animal2 {
	
	// MEM VARS
	private double weight;
	private boolean hasLegs;
	private String food;
	private boolean isAquatic;
	
	// CONSTRUCTORS
	public Animal2() {
		System.out.println("Created an ANIMAL!");
		
	}
	
	public Animal2(double weight, boolean hasLegs, String food, boolean isAquatic) {
		super();
		this.weight = weight;
		this.hasLegs = hasLegs;
		this.food = food;
		this.isAquatic = isAquatic;
	}

	// TOSTRING() METHOD
	@Override
	public String toString() {
		return "Animal: " + "Food: " + food + " isAquatic: " + isAquatic;
		
	}

	// GETTERS AND SETTERS

	public boolean isAquatic() {
		return isAquatic;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setAquatic(boolean isAquatic) {
		this.isAquatic = isAquatic;
	}

	// MAIN METHOD
	public static void main(String[] args) {
		
		Animal2 fred = new Animal2();
		//System.out.println(fred);
		
		// SPIDER SUBCLASS
		Spider2 peter = new Spider2();
		peter.setFood("jar of flies");
		System.out.println(peter.getFood());
		peter.setAquatic(true);
		
		System.out.println(peter);
		
		peter.setIsRadioactive(true);
		System.out.println("Is this spider radioactive !?! >> " + peter.getIsRadioactive());
		
		// SLUG SUBCLASS
		Slug dimebagDarrell  = new Slug();
		dimebagDarrell.setFood("algea");
		System.out.println(dimebagDarrell.getFood());
		dimebagDarrell.setAquatic(false);
		
		TuskenRaider gary = new TuskenRaider();
		
	}
}

class Spider2 extends Animal2 {
	
	public Spider2() {
		super();
	}
	
	// MEM VARS
	private boolean isRadioactive;
	
	// GETTERS & SETTERS
	public boolean getIsRadioactive() {
		return this.isRadioactive;
	}
	
	public void setIsRadioactive(boolean isRadioactive) {
		this.isRadioactive = isRadioactive;
	}
	
}

class Slug extends Animal2 {
	
}
