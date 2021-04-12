package com.redfern.java_course_spring_2021.Week_06;

public class PalindromeStringBuilder implements PalindromeInterface {

	@Override
	public boolean isPalindrome(String orig) {
		StringBuilder rsvd = new StringBuilder(orig).reverse();
		if(orig.equals(rsvd.toString()))
			return true;
		else
			return false;
	}
}
