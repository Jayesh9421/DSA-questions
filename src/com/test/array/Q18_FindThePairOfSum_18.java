package com.test.array;

public class Q18_FindThePairOfSum_18 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,20};
		findThePairOfSum(arr, 40);
		
		
	}
	
	public static void findThePairOfSum(int arr[] , int targetSum) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int expectedSum = arr[i]+ arr[j];
				
				if(expectedSum == targetSum) {
					
					System.out.println(arr[i]+" + " +arr[j]+" = "+targetSum );
				}
				
				
				
			}
		}
	}
}
