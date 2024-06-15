package com.test.array;

import java.util.Arrays;

public class Q12_SortSquareArray_12 {

	public static void main(String[] args) {

		int arr[] = { -6, -1, 5, 7, 4 };

		int[] sortSquareArray = sortSquareArray(arr);
		
		System.out.println(Arrays.toString(sortSquareArray));

	}

	public static int[] sortSquareArray(int arr[]) {

		int[] squareArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			squareArray[i] = arr[i] * arr[i];
		}
		// in a practice we are trying to swap a arr[] intead of squareArray[] is our mistake
		for (int i = 0; i < squareArray.length; i++) {
			for (int j =0; j < squareArray.length-1-i; j++) {
				if(squareArray[j] > squareArray[j+1] ) {
					int temp = squareArray[j];
					squareArray[j] = squareArray[j+1];
					squareArray[j+1] = temp;
				}
			}
		}
		
		return squareArray;

	}

}
