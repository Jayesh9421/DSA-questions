package com.test.array;


public class Q21_MaximunDifferenceBetweenTwoArray_21 {
	
	public static void main(String[] args) {
	
		int arr[]  = {10,20,30,40,50};
		
		int maximunDifference = maximunDifference(arr);
		System.out.println(maximunDifference);
		
	}
	
	public static int maximunDifference(int arr[]) {
		
		int max= Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return max - min;
	}
}
