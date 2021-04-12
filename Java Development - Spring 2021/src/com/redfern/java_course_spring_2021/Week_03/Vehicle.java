package com.redfern.java_course_spring_2021.Week_03;

// CONTRACT: ENSURES THAT THE CLASS IMPLEMENTS ITS METHODS
public interface Vehicle {

	// ABSTRACT METHODS = JUST METHOD SIGNATURE
	void accelerate(int mph);
	void stop();
	boolean carryPassengers();
	
	public static void main(String[] args) {
		Dingy d = new Dingy();
		d.accelerate(5);
		System.out.println(d);
	}
}

class Boat implements Vehicle {

	public void accelerate(int mph) {		
	}

	public void stop() {	
	}

	public boolean carryPassengers() {
		return false;
	}	
}

class Dingy extends Boat {
	
}

class Plane implements Vehicle{
	
	// CONCRETE METHODS
	public void accelerate(int mph) {
		System.out.println("whoosh");
	}
	
	public void stop() {
		System.out.println("Please stop!");
	}
	
	public boolean carryPassengers() {
		return true;
	}
}

class Car implements Vehicle {
	
	// MEM VARS	
	private int mph;
	
	// CONCRETE
	public void accelerate(int mph) {
		this.mph = mph;
		System.out.println("Traveling at " + mph);
	}
	
	public void stop() {
		System.out.println("Stopping...");
	}
	
	public boolean carryPassengers() {
		return true;
	}
}