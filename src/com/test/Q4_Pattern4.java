package com.test;

import java.util.Iterator;

//patter :->

//0 1 2 3 4 
//0 1 2 3 4 
//0 1 2 3 4 
//0 1 2 3 4 
//0 1 2 3 4 

public class Q4_Pattern4 {
	
	public static void main(String[] args) {
		
		pattern(4,4);
		
	}
	
	public static void pattern(int columan , int row) {
		
		for (int i = 0; i <=row; i++) {
			for (int j = 0; j <=columan; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}
}
