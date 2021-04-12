package com.redfern.java_course_spring_2021.Week_06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

class MonsterTest2 {
	
	// DECLARE STATIC VARIABLES
	static Monster m0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m0 = new Monster();
	}

	@Test
	@Order(1)
	void testFoo() {
		fail("Not yet implemented");
	}

}
