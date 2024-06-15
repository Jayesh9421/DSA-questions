package com.test.array;

import java.util.HashSet;

public class Q20_BinarySearch_20 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		
		int binarySearch = binarySearch(arr, 30);
		
		System.out.println(binarySearch);

		
	}

	public static int binarySearch(int arr[], int taragetElement) {

		int left = 0;
		int right = arr.length - 1;
		int mid = left + (right - left) / 2;

		while (left < right) {

			if (arr[mid] == taragetElement) {
				return mid;
			}

			if (arr[mid] < taragetElement) {
				left = mid + 1;
			} else if (arr[mid] > taragetElement) {
				right = mid - 1;
			}

			left++;
			right--;
		}

		return -1;
	}

}
