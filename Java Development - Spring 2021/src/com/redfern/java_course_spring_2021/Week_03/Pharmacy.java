package com.redfern.java_course_spring_2021.Week_03;

public class Pharmacy extends Item implements SevenPercentTaxBracket {

	public Pharmacy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pharmacy(int id, String name, double price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}
