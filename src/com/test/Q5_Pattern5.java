package com.test;

import java.util.Iterator;

//patter :-> note :-> print " i " ;
//
//1 1 1 1 
//2 2 2 2 
//3 3 3 3 
//4 4 4 4 


public class Q5_Pattern5 {
	
	public static void main(String[] args) {
	
		int input = 4;
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		
	}
	
	
}
