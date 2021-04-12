package com.redfern.java_course_spring_2021.Week_03;

public class StarWarsPeople {
	
	// MEM VARS
	private String planet;
	private boolean hasForce;
	private boolean canDestroyPlanet;

	// CONSTRUCTORS
	public StarWarsPeople(String planet, boolean hasForce, boolean canDestroyPlanet) {
		super();
		this.planet = planet;
		this.hasForce = hasForce;
		this.canDestroyPlanet = canDestroyPlanet;
		System.out.println("Created a StarWars Person...");
	}

	// GETTERS & SETTERS
	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	public boolean isHasForce() {
		return hasForce;
	}

	public void setHasForce(boolean hasForce) {
		this.hasForce = hasForce;
	}

	public boolean isCanDestroyPlanet() {
		return canDestroyPlanet;
	}

	public void setCanDestroyPlanet(boolean canDestroyPlanet) {
		this.canDestroyPlanet = canDestroyPlanet;
	}
	
	@Override
	public String toString() {
		return "StarWarsPeople [planet=" + planet + ", hasForce=" + hasForce + ", canDestroyPlanet=" + canDestroyPlanet
				+ "]";
	}

	public static void main(String[] args) {
		
		/*
		StarWarsPeople jabba = new StarWarsPeople("Tattoine", false, false);
		System.out.println(jabba);
		
		SandPerson jeff = new SandPerson("Tattoine", false, false);
		System.out.println(jeff);
		jeff.setBantha("Plushy The Ferocious");
		System.out.println(jeff.getBantha());
		*/
		
		BabySandPerson gritty = new BabySandPerson("Tattoine", true, true);
		System.out.println(gritty);
	}
}

// SUBCLASS
class SandPerson extends StarWarsPeople {
	
	// MEM VARS
	private String bantha;
	
	// CONSTRUCTORS
	public SandPerson(String planet, boolean hasForce, boolean canDestroyPlanet) {
		super(planet, hasForce, canDestroyPlanet);
		System.out.println("Created an adult sandperson...");
	}
	
	// GETTERS AND SETTERS
	public String getBantha() {
		return this.bantha;
	}
	
	public void setBantha(String bantha) {
		this.bantha = bantha;
	}
}

// SUBCLASS
class BabySandPerson extends SandPerson {
	
	// CONSTRUCTORS
	public BabySandPerson(String planet, boolean hasForce, boolean canDestroyPlanet) {
		super(planet, hasForce, canDestroyPlanet);
		System.out.println("Created a baby sandperson...");
	}
}
