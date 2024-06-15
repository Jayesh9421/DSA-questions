package com.test.array;

import java.util.Arrays;


public class Q24_RotateElementToLeftInOnePosition_24 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		
		rotateArrayToLeft(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int rotateArrayToLeft(int arr[]) {
		
		// store first element in a temporay variable 
		
		int firstElement =  arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1]; // store a element except first one
		}
		
		return arr[arr.length-1] = arr[0]; // add first element to the last one 
		
	}
}
