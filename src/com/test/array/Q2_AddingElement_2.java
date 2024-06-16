package com.test.array;

import java.util.Arrays;

public class Q2_AddingElement_2 {

	public static void main(String[] args) {

		int a[] = {10,20,30,40};
		
		int[] addArray = addArray(a, 2 , 100);
		
		String string = Arrays.toString(addArray);
		
		System.out.println(string);
		
	}

	public static int[] addArray(int arr[], int position , int element) {
		
		int newArray[] = new int[arr.length+1];
		
		for (int i = 0; i < position; i++) {
			 newArray[i] = arr[i];
		}
		
		newArray[position] = element;
		
		for (int i = position; i < arr.length; i++) {
			newArray[i+1] = arr[i];
		}
		
		return newArray;
	}
	
	
}




