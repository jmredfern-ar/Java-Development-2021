package com.redfern.carsoncode;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
/**
 *
 * @author Carson Crouther
 */
public class Phone {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        // length of phone book
        int length;
    
        Map<Person,Integer> Credentials = new HashMap<>();
    
    System.out.println("How long is this list?");
    length= input.nextInt();
    
    for(int i=0; i <length; i++){Setter(Credentials); 
    }
    
    Printmap(Credentials);
    Query(Credentials);
    }
    // prints phone book
    public static void Printmap(Map<Person,Integer> map){
        System.out.println("Name: "+"       Phone#: ");
        for(Map.Entry<Person, Integer> p : map.entrySet()){
           System.out.println(p.getKey().getLastName()+","+p.getKey().getFirstName()+" | "+p.getValue());
        }}
    
    // input method
    public static void Setter(Map<Person,Integer> map){
            Person guy = new Person();
            int number;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your First name.");
    guy.setFirstName(input.nextLine());
    System.out.println("Enter your Last name.");
    guy.setLastName(input.nextLine());
    System.out.println("Enter your phone number.");
    number = input.nextInt();
        
        map.put(guy, number);
        
        
    }
    public static void Query(Map<Person,Integer> map){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Who are you looking for (Last Name)? ");
        name=input.nextLine();
        
        for(Map.Entry<Person, Integer> p : map.entrySet()){
        	if(p.getKey().getLastName().equals(name)) {
        		System.out.println(p.getKey().toString());
        		return;
        	}
        }
        System.out.println("<Not Found>");
    }
    
}
