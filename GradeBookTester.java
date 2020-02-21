/**
 * 
 * @author Elysha Mustapha
 * GradeBookTester class, tests methods from GradeBook.java
 *
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {
	
	GradeBook book1;
	GradeBook book2;
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		
		book1.addScore(50);
		book1.addScore(75);
		
		book2 = new GradeBook(5);
		
		book2.addScore(60);
		book2.addScore(40);
		book2.addScore(80);
		book2.addScore(20);
		book2.addScore(90);
	}
	
	@AfterEach
	void tearDown() throws Exception{
		book1 = null;
		book2 = null;
	}
	
	@Test
	void TestAddScore() {
		assertTrue((book1.toString()).equals("50.0 75.0"));
		assertTrue((book2.toString()).equals("60.0 40.0 80.0 20.0 90.0"));
		
		assertEquals(2, book1.getScoreSize(), 0.001);
		assertEquals(5, book2.getScoreSize(), 0.001);
	}
	
	@Test
	void testSum() {
		assertEquals(125.0, book1.sum(), 0.0001);
		assertEquals(290.0, book2.sum(), 0.0001);
	}
	
	@Test
	void testMinimum() {
		assertEquals(50.0, book1.minimum(), 0.001);
		assertEquals(20.0, book2.minimum(), 0.001);
	}
	
	@Test
	void testFinalScore() {
		assertEquals(75.0, book1.finalScore(), 0.001);
		assertEquals(270.0, book2.finalScore(), 0.001);
	}

}
