package com.redfern.java_course_spring_2021.Week_03;

public abstract class Item {
	
	// MEM VARS
	int id;
	String name;
	double price;
	
	//CONSTRUCTORS
	public Item() {
		super();
	
	}

	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	abstract public double getTax();
	
	//toString()
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Price: " + "$" + price;
	}
}
