package com.redfern.java_course_spring_2021.Week_03;

public class Clothing extends Item implements TenPercentTaxBracket {

	public Clothing() {
		super();
	}

	public Clothing(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public double getTax() {
		return TAX;
	}

}
