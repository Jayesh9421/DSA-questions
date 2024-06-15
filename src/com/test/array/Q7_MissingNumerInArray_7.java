package com.test.array;

import java.util.HashSet;

public class Q7_MissingNumerInArray_7 {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 50, 60 };

		int findMissingNumber = findMissingNumber(arr);
		System.out.println(findMissingNumber);

	}

	public static int findMissingNumber(int[] array) {
		
		int n = array.length+1;
		
		int expectedSum = n*(n+1)/2;
		
		int actualSum = 0;
		
		for(Integer sum : array) {
			actualSum += sum;
		}
		
		return expectedSum - actualSum;
	}

}
