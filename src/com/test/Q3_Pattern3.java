package com.test;

//right angle triagle

//1
//12
//123
//1234
//12345

public class Q3_Pattern3 {

	public static void main(String[] args) {

		pattern(5);
		
	}

	public static void pattern(int input) {

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(j + "");
			}
			
			System.out.println();
		}

	}
}
