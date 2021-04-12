package com.redfern.java_course_spring_2021.Week_06;

// SUPER CLASS
public class Monster {
	
	public String habitat;
	
	public void foo() {
		System.out.println("I come in peace...");
	}
	
	
	// GETTERS & SETTERS
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public static void main(String[] args) {

		Monster monster = new Monster();
		monster.foo();
		
		Monster boringMonster = new BoringMonster();
		boringMonster.foo();
		
//		Monster terminator = new Terminator();
//		terminator.foo();
//		
//		Terminator t1000 = new Terminator();
//		terminator.foo();

	}
}

// SUBCLASS #0
class BoringMonster extends Monster {
	
	//OVERRIDING AND OVERLOADING
	public void foo() {
		System.out.println("I'm Batman...");
	}
	
	public void foo(String catchPhrase) {
		System.out.println(catchPhrase);
	}
}

// SUBCLASS #
class Terminator extends Monster {
	
	// OVERRIDEN METHOD
	public void foo() {
		System.out.println("I'll be back...");
	}
}

// SUBCLASS #2 GOES HERE