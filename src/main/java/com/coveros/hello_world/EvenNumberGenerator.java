package com.coveros.hello_world;
/* Selenium HTML Report
 * 
 */
import java.util.Random;

public class EvenNumberGenerator {
	private EvenNumberGenerator()
	{
		//do nothing
	}
	public static int generateRandomEven(){
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		if (result%2!=0){
			result++;
		}
		else {
			//do nothing
		}
		return result;
	}
	public static int generateRandomOdd(){
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		
		if (result%2==0){
			result++;
		}
		else {
			//do nothing
		}
		return result;
	}
}
