package com.test.generalProgramme;

import java.util.Random;

public class GenerateRandomNumberInJava {

	public static void main(String[] args) {
		
		Random random = new Random();

		int nextInt = random.nextInt(100); // this is generate a random String up to the 100
		
		System.out.println(nextInt);
	}
}
