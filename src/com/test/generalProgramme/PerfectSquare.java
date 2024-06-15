package com.test.generalProgramme;

public class PerfectSquare {

	public static void main(String[] args) {
		
		perfectSq(3);
		
	}
	
	public static void perfectSq(int num) {
		
		for (int i = 0; i < num; i++) {
			
			if(i*i == num) {
				System.out.println("it is perfect square");
			}
		}
		
	}
}
