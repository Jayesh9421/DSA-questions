package com.test.array;

import java.util.Arrays;

public class Q3_BubbleSort_3 {

	public static void main(String[] args) {

		int arr[] = { 20, 30, 10, 40 };

		bubbleSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
