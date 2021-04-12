package com.redfern.java_course_spring_2021.Week_06;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Arrays;

public class SubArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
       
        String[] load;
        
        
        System.out.println("Please insert an array. ");
        
        load = input.nextLine().split(" ");
        int list[]= new int[load.length];
       System.out.println(Arrays.toString(load));
        
        for(int i =0; i< load.length; i++){
          list[i]= Integer.valueOf(load[i]);
        }
        
        
        
      ArraySum(list);
        
    
    }
    
    public static void ArraySum(int[] array) {
​
        int start = 0, end = 0, sum = 0, Left = 1, Right = -1;
​
        
        for (int i = 0; i < array.length; i++) {
​
            end = i;
            sum += array[i];
​
            if (sum == 0) { // checks if current sum is zero
                if ((Right - Left) < (end - start)) {
                    Left = start;
                    Right = end;
                }
            } 
            else {
                int othersum = sum;
​
   
                for (int j = start; j < end; j++) {
                    othersum -= array[j];
                    if (othersum == 0) {
                        if ((Right - Left) < (end - (j + 1))) {
                            Left = j + 1;
                            Right = end;
                        }
                        break;
                    } 
                    else if ((Right - Left) > (end - (j + 1))) {
                        break;
                    }
                }
            }
        }
        if (Right != -1) {
            System.out.print("The longest zeroed subarray is: ");
            for(int i=Left; i<Right+1; i++){
                System.out.print(array[i]+", ");
            }
        } else {
            System.out.println("No subarray with sum 0");
        }
    } 
}
