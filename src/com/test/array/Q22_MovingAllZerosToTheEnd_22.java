package com.test.array;

import java.util.Arrays;

public class Q22_MovingAllZerosToTheEnd_22 {
	
	public static void main(String[] args) {
		
		int arr[] = {0,10,2,0,30,0,40,0,80,0,3};
		
		movingZeros(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void movingZeros(int arr[]) {
		
		int nonZero = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[nonZero] = arr[i];
				nonZero++;
			}
		}
		
		for (int i = nonZero; i < arr.length; i++) {
			arr[nonZero] = 0;
			nonZero++;
		}
	}
}
