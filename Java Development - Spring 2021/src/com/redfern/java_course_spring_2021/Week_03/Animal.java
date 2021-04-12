package com.redfern.java_course_spring_2021.Week_03;

public class Animal {
	
	// MEM VARS
	private double weight;
	private boolean isCarnivore;
	private int numOfLegs;
	
	public Animal () {
		//this.numOfLegs = 9;
		System.out.println("Constructed an animal...");
	}

	// GETTERS & SETTINGS
	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}


	// MAIN METHOD
	public static void main(String[] args) {
		Spider itsyBitsy = new Spider();
		//System.out.println(itsyBitsy.getNumOfLegs());
	}
	
}

interface Arachnid {
	
	// ALL INTERFACE METHODS ARE *ABSTRACT*
	void spinWeb();
	void catchFlies();
	
}

class Spider extends Animal implements Arachnid{

	@Override
	public void spinWeb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void catchFlies() {
		// TODO Auto-generated method stub
		
	}
		
}

class Dog extends Animal {
	
}
