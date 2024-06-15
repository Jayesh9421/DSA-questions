package com.test.generalProgramme;

public class CountDigitInNumber {

	public static void main(String[] args) {
		
		int countDigits = countDigits(143);
		int countDigitsByUsingInBuiltMethod = countDigitsByUsingInBuiltMethod(143);
		System.out.println(countDigitsByUsingInBuiltMethod);
		
	}
	
	public static int countDigits(int num) {
		
		int count = 0;
		
		while(num != 0) {
			
			num = num/10;
			count++;
		}
		
		return count;
	}
	
	// use inbuilt Method
	public static int countDigitsByUsingInBuiltMethod(int num) {
		
		int digits = String.valueOf(num).length();
		
		return digits;
		
	}
}
