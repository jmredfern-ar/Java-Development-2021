package com.redfern.carsoncode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Carson Crouther
 */
public class Person implements Comparable<Person>{
   
    private String FirstName, LastName;
   

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

	@Override
	public int compareTo(Person p) {
		int comp = this.FirstName.compareTo(p.LastName);
		if(comp == 0)
			comp = this.LastName.compareTo(p.FirstName);
		return comp;
	}

	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}