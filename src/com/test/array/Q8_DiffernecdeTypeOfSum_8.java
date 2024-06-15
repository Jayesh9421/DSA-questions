package com.test.array;

import java.util.Arrays;

public class Q8_DiffernecdeTypeOfSum_8 {

	public static void main(String[] args) {

//		sum1(new int[] {1,2,3});
		// ***********************
//		int sum2 = sum2(new int[] {1,2,3});
//		System.out.println(sum2);
		// ***********************

	}

	// type 1- sum

	public static void sum1(int arr[]) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		System.out.println(sum);

	}

	// type 2- sum
	public static int sum2(int arr[]) {

		return Arrays.stream(arr).sum();

	}

	// type 3 - sum

}
