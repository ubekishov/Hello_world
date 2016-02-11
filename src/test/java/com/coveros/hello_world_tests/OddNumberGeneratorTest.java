package com.coveros.hello_world_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coveros.hello_world.EvenNumberGenerator;

public class OddNumberGeneratorTest {
	
	   @Test

	   public void testRandomOddNumberGenerator() { 

	      int randomResult2 = 

	EvenNumberGenerator.generateRandomOdd();

	      

	      assertEquals(1,randomResult2%2);

	   }

}
