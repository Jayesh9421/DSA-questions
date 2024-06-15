package com.test.generalProgramme;

public class FindSumOfDigits {

	public static void main(String[] args) {
		
		int findSumDigits = findSumDigits(123);
		System.out.println(findSumDigits);
		
	}

	private static int findSumDigits(int num) {

		int sum = 0;		
		while(num != 0) {
			
			int digit = num%10;
			
			sum += digit;
			
			num = num/10;
			
		}
		
		return sum;
	}
}
