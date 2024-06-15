package com.test.generalProgramme;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		boolean prime = isPrime(7);
		
		System.out.println(prime);
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num <=1 ) {
			
			return false;
		}
		
		for (int i = 2; i < num/2; i++) { // start from 2 and divide by /2
			
			if(num%i==0) {
				
				return false;
			}
		}
		
		return true;
	}
}
