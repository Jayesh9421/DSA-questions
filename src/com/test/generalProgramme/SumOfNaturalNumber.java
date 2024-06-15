package com.test.generalProgramme;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		
//		sumOfNaturalNumber(6);
		
		printNEvenNumber(6);
		
	}
//	1st method
	public static void sumOfNaturalNumber(int num) {
		
		int sum =0;
		
		for (int i = 0; i <= num; i++) {
			
			sum = num*(num+1)/2;
			
		}
		
		System.out.println(sum);
	}
	
	// 2nd method
	public static void sumOfNumber(int num) {
		
		int sum=0;
		
		for (int i = 0; i <= num ; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
	
	public static void printNEvenNumber(int num) {
		
		for (int i = 1; i <=num; i++) {
			
			if(i%2 == 0) { // focus on this condition
				
				System.out.println(i);
			}
		}
	}
}
