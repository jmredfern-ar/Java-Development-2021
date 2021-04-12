package com.redfern.java_course_spring_2021.Week_02;

// POJO
public class Car {
	
	// JAVA PROVIDES A "DEFAULT" CONSTRUCTOR IF YOU DON'T SPECIFIC ONE
	
	// MEM VARS
	private String engine;
	private String[] seats;
	private String color;
	private String make;
	private String model;
	private int year;
	boolean is4WheelDrive;
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String[] getSeats() {
		return seats;
	}
	public void setSeats(String[] seats) {
		this.seats = seats;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isIs4WheelDrive() {
		return is4WheelDrive;
	}
	public void setIs4WheelDrive(boolean is4WheelDrive) {
		this.is4WheelDrive = is4WheelDrive;
	}
	
	

}
