//package com.redfern.java_course_spring_2021.Week_05;

import java.util.*;

public class Solution {

 public static void main(String[] args) {
	 
	 	// MEM VARS
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
     
        // ARRAY OF STRINGS FOR LEFT AND RIGHT STRINGS
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        // LOOP 
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        Set<String> hs = new HashSet<String>();
        StringBuffer sb = new StringBuffer();
        
        // ADD EACH PAIR TO THE SET, ONE BY ONE, AND APPEND SET SIZE TO STRINGBUFFER WITH \N
        for(int i=0; i<t; i++) {
            hs.add(pair_left[i] + " " + pair_right[i]);
            sb.append(hs.size() + "\n");
        }
        
        // PRINT STRINGBUFFER
        System.out.println(sb);
        s.close();

   }
}
