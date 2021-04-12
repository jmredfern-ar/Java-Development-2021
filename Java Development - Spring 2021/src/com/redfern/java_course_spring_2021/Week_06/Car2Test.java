package com.redfern.java_course_spring_2021.Week_06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class Car2Test {
	
	// VARIABLES
	static Car2 tomater;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tomater = new Car2();
	}

	@Test
	@Order(1)
	void testGetName() {
		tomater.setName("tomater");
		assertEquals("tomater", tomater.getName());
	}

}
