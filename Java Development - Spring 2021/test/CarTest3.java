import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.redfern.java_course_spring_2021.Week_06.Car2;

class CarTest3 {
	
	// VARIABLES
	static Car2 tomater;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tomater = new Car2();
	}
	
	@Test
	void testGetName() {
		tomater.setName("tomater");
		assertEquals("tomater", tomater.getName());
	}
}
