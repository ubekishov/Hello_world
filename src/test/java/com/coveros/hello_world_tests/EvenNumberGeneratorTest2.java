package com.coveros.hello_world_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coveros.hello_world.EvenNumberGenerator;

public class EvenNumberGeneratorTest2 {

   @Test

   public void testRandomEvenNumberGenerator2() { 

      int randomResult2 = 

EvenNumberGenerator.generateRandomEven();

      

      assertEquals(0,randomResult2%2);

   }

}