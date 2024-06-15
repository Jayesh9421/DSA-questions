package com.test;

public class Q1_Pattern {

	// reactangle
	public static void main(String[] args) {
		
		printReactangle(7);
	}
	
	public static void printReactangle(int input) {
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				
				System.out.print(input+ " ");
			}
			System.out.println();
		}
	}
	
}
