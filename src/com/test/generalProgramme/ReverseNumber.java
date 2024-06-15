package com.test.generalProgramme;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num = 341;
		
		int reverseNumber = reverseNumber(num);
		System.out.println(reverseNumber);
		
	}
	
	public static int reverseNumber(int num) {
		
		int reverse =0;
		
		while(num != 0) {
			
			int digit = num%10;
			reverse = reverse* 10+digit;
			num = num/10;
			
		}
		
		return reverse;
	}
}