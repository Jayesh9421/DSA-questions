package com.test.array;

import java.util.Arrays;

public class Q28_DeleteElementFromPositionArray_28 {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20};
		
		int[] deleteElment = deleteElment(arr, 1);
		
		System.out.println(Arrays.toString(deleteElment));
		
	}
	
	public static int[] deleteElment(int arr[] , int position) {
		
		int [] newArray  = new int[arr.length -1 ];
		
		for (int i = 0; i < position; i++) {
			newArray[i] = arr[i];
		}
		
		for (int i = position+1; i < arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		
		return newArray;
				
	}
}

