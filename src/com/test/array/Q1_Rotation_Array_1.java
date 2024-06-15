package com.test.array;


public class Q1_Rotation_Array_1 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		leftRotate(arr, 8, 2);
		
		for (int i : arr) {
			System.out.println(arr);
		}

	}

	public static void leftRotate(int arr[], int left, int right) {

		rotateArray(arr, 0, right - 1);
		rotateArray(arr, right, left - 1);
		rotateArray(arr, 0, left - 1);
	}

	public static void rotateArray(int arr[], int left, int right) {


		while (left <= right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

	}
}
