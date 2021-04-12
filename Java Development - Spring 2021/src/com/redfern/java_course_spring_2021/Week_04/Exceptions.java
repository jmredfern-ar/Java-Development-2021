package com.redfern.java_course_spring_2021.Week_04;

import java.util.Random;
/**
 *
 * @author Carson Crouther
 */
public class Exceptions {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random rn = new Random();
    
    int[] arr= new int[100];
    
    
    
   try{for(int i =0; i<100;i++){
    int num =rn.nextInt();    
    arr[i]=num;
    }
   
   		try {
   			sort(arr);
   		} catch(ArithmeticException e) {
   			// HANDLE THE EXCEPTION
   		}

      
   }catch(Exception e){
       System.out.println("Exception encountered: "+ e.getMessage()   );
   } 
}
    //prints array
  static void sort(int array[]){
    
    for(int i =0; i < array.length; i++){
        int temp;
        for(int j = i+1; j < array.length; j++){
            if(array[j]> array[i]){
                temp =array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        if(array[i] < 0){
           throw new ArithmeticException("Hey! There are negative numbers!! " );
          
        }else
        
       System.out.println(array[i]);
    }
    
   }
}

