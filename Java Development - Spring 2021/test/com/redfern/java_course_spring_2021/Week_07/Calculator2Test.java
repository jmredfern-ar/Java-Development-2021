package com.redfern.java_course_spring_2021.Week_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class Calculator2Test {

	// STATIC VARS
	static Calculator2 c2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c2 = new Calculator2();
	}

	@Test
	@Order(1)
	//<method>_Should<Do Something>_Given<Params>
	void add_ShouldReturnInt_GivenTwoInts() {
		assertEquals(4, c2.add(2,  2));
		//assertEquals(5, c2.add(2,  2));
	}
	
	@Test
	@Order(2)
	void add_ShouldReturnInt_GivenTwoStrings() {
		assertEquals(4 ,c2.add("2", "2"));
//		assertEquals(4 ,c2.add("forty-two", "2"));
	}
	
	@Test
	@Order(3)
	void add_ShouldReturnMinVal_GivenNonNumberString() {
		assertEquals(Integer.MIN_VALUE, c2.add("forty-two", "2"));
	}
	
	@Test
	@Order(4)
	void addNoNulls_ShouldThrowException_GivenNullString() {
		assertThrows(IllegalArgumentException.class, () -> {c2.addNoNulls(null, "2");});
	}
	
}
