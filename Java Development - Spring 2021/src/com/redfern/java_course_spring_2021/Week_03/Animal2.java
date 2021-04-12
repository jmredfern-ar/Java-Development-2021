//REPLACE THIS PACKAGE WITH YOURS
package com.redfern.java_course_spring_2021.Week_03;

// ANIMAL SUPERCLASS
public class Animal2 extends Object{
	
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
		System.out.println("Executed this constructor will all params.");
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}

	// MAIN METHOD
	public static void main(String[] args) {
		
		//Spider2 itsyBitsy = new Spider2();
		
		Slug gary = new Slug(0.3, false, "algea", true );
		Slug dimebagDarrell = new Slug(0.7, false, "awesomeness", false);
		Animal2 peter = new Spider2();
				
	}
}

class Spider2 extends Animal2 {
	
	public Spider2() {
		super();
		System.out.println("Created a Spider object...");
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

	// NO MEM VARS OF ITS OWN...
	
	public Slug() {
		super();
		System.out.println("Created a slug...");
	}
	
	public Slug(double weight, boolean hasLegs, String food, boolean isAquatic) {
		super(weight, hasLegs, food, isAquatic);
	}	
}










