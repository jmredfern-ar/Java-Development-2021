package com.redfern.java_course_spring_2021.Week_04;

public class IdenticalTwins implements Hero {

	@Override
	public String tragicBackstory() {
		String backstory = "HERO: IDENTICAL TWINS\n" + 
                		   "TRAGIC BACKSTORY:\n" + 
                		   "Confused about their own identities after years,\n" +
                		   "of being dressed alike, the twins chug 5 energy drinks,\n" +
                		   "in a row - allowing them to summon the disembodied head\n" +
                		   "of the ultimate prehistoric predator: the T-Rex!\n";
return backstory;
	}

	@Override
	public void addAttack(String attack) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAttack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHealth(Integer health) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer getHealth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int dealDamage(int die) {
		// TODO Auto-generated method stub
		return 0;
	}

}
