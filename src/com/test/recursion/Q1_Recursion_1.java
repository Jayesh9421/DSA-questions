package com.test.recursion;

public class Q1_Recursion_1 {

	public static void main(String[] args) {

		int factorial = factorial(5);
		
		System.out.println(factorial);
		
	}

	public static int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}else {
			
			return num * factorial(num-1);
		}
	}
}
