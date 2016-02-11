package com.coveros.hello_world_tests;

import static org.junit.Assert.assertEquals;

public class OddNumberGeneratorTest {
	
	   @Test

	   public void testRandomEvenNumberGenerator() { 

	      int randomResult2 = 

	EvenNumberGenerator.generateRandomOdd();

	      

	      assertEquals(1,randomResult2%2);

	   }

}
