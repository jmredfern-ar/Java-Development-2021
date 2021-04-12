package com.redfern.java_course_spring_2021.Week_03;

public class Grocery extends Item implements FivePercentTaxBracket{

	public Grocery() {
		super();
	}

	public Grocery(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public double getTax() {
		return TAX;
	}
}
