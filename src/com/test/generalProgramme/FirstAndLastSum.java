package com.test.generalProgramme;

public class FirstAndLastSum {

	public static void main(String[] args) {
		
		int num = 123;
		
		int lastDigit = num%10;
		int fistdigit = num;
		
		while(fistdigit >=10) {
			fistdigit = fistdigit/10;
		}
		
		int result = fistdigit + lastDigit;
		
		System.out.println(result);
		
	}
	
}
