package com.test.array;

import java.util.Arrays;

public class Q2_AddingElement_2 {

	public static void main(String[] args) {

		int a[] = {10,20,30,40};
		
		addArray(a, 2 , 100);
		
		String string = Arrays.toString(a);
		
		System.out.println(string);
		
	}

	public static int[] addArray(int arr[], int position , int element) {
		
		int temp[] = new int[arr.length+1];
		
		for (int i = arr.length-1; i > position-1 ; i--) {
			
			temp[i] = arr[i-1];
			arr[i-1] =  element;
		
		}
		
		return temp;
		
	}
}
