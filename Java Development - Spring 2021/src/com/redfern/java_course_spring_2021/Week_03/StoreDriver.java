package com.redfern.java_course_spring_2021.Week_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreDriver {
	
	public static void main(String[] args) {
		
		// VARS
		Scanner sc = new Scanner(System.in);
		List<Item> items = new ArrayList<Item>();
		int type = 0, id = 0;
		String name;
		double price, total = 0.0;
		Item item;

		// LOOP
		boolean running = true;
		while(running) {
			
			item = null;
			
			// GET USER INPUT
			System.out.println("Enter type of item: (1) for Grocery, (2) for Clothing, (3) for Pharmacy, (4) for done");
			type = Integer.valueOf(sc.nextLine());
			
			if(type < 1 || type > 3) { // INVALID ENTRY
				running = false;
			}
			else {
			
				System.out.println("Enter id:");
				id = Integer.valueOf(sc.nextLine());
				
				System.out.println("Enter name:");
				name = sc.nextLine();
				
				System.out.println("Enter price:");
				price = Double.valueOf(sc.nextLine());
				
				// CREATE ITEM & ADD TO ARRAYLIST
				if(type == 1) {
					item = new Grocery(id, name, price);
				}
				else if(type == 2) {
					item = new Clothing(id, name, price);
				}
				else if(type == 3) {
					item = new Pharmacy(id, name, price);
				}
				
				items.add(item);
				System.out.println(item);
			}
		}
		
		// PRINT ITEMS IN ARRAYLIST
		System.out.println("Items:");
		for(int i=0; i<items.size(); i++) {
			System.out.print(items.get(i).getName() + " $" + items.get(i).getPrice() + "\n");
		}
		
		// COMPUTE TOTAL W/ TAX
		System.out.println("Total:");
		for(int i=0; i<items.size(); i++) {
			total += items.get(i).price * items.get(i).getTax();
		}
		System.out.printf("$%.2f", total);
	}

}
