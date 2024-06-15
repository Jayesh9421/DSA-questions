package com.test.array;

import java.util.Arrays;


public class Q25_FirstDuplicateInArray_25 {
	public static void main(String[] args) {
		
		firstDuplicateElementInArray(new int[] {10,20,20,30,40,50,60,40});
		
	}
	
	public static void firstDuplicateElementInArray(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j] ) {
					System.out.println( arr[i]);
					return; // if we write a return then  it will return only one element
				}
			}
		}
	}
}
