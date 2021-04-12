package com.redfern.java_course_spring_2021.Week_06;

public class PalindromeCharAt implements PalindromeInterface {

	private char character = 'C';
	
	@Override
	public boolean isPalindrome(String orig) {
		String rsvd = "";
		for(int i=orig.length()-1; i>=0; i--) {
			rsvd += orig.charAt(i);
		}
		
		if(orig.equals(rsvd))
			return true;		
		return false;
	}

}
