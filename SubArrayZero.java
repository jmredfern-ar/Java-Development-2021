//package com.redfern.java_course_spring_2021.Week_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubArrayZero {

	public static void main(String[] args) {
		
		// DECLARE STATIC VARS
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		List<Integer> valueList;
		Map<Integer, List<Integer>> hM = new HashMap<Integer, List<Integer>>();
		int marker, sum;
		final int KEY = 0;
		
		// LOAD NUMS ARRAYLIST FROM CONSOLE
		System.out.print("Input a series of positive and negative numbers separated by a space >> ");
		String[] s = sc.nextLine().split(" ");
		
		for(int i = 0; i<s.length; i++) {
			nums.add(Integer.parseInt(s[i]));
		}
				
		// DO A BUNCH OF STUFF
		for(int i=0; i < nums.size(); i++) { 
			
			marker = i+1;
			
			while(marker <= nums.size()) { 
				
				sum = 0;
				valueList = new ArrayList<>();
				
				for(int j = i; j<marker; j++) {
					valueList.add(nums.get(j));
					sum += nums.get(j);
				}
				
				if(valueList.size() > 1 && sum == KEY) {

					if(hM.containsKey(sum)) {
						int size = hM.get(KEY).size();
						if(valueList.size() > size) {
							hM.replace(KEY, valueList);
						}
					} else {
						hM.put(KEY, valueList);
					}
				}	
				marker++;
			}
		}
		
		System.out.println("LARGEST Sub-Array whose elements sum up to 0: " + hM.get(KEY));
		sc.close();
	}
}
