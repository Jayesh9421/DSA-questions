package com.test.array;

import java.util.Arrays;
import java.util.Iterator;

public class Q4_SelectionSort_4 {

	public static void main(String[] args) {

		int arr[] = {20,10,40,30};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void selectionSort(int arr[]) {
		
		for (int i = 0; i < arr.length-1; i++) {
				int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if( arr[j] < arr[min]) {
					min = j;
				}
				
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
