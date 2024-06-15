package com.test.array;

public class Q13_QuickSort_13 {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 30, 50, 40 };

		QuickSortAlgoritham(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static int partition(int arr[], int low, int high) {

		int pivot = arr[(low + high) / 2];

		while (low <= high) {

			while (arr[low] < pivot) {

				low++;
			}

			while (arr[high] > pivot) {
				high--;
			}

			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low++;
			high--;
		}
		return low;
	}

	public static void QuickSortAlgoritham(int arr[], int low, int high) {

		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			QuickSortAlgoritham(arr, low, pi - 1);
		}
		if (pi < high) {
			QuickSortAlgoritham(arr, pi, high);
		}
	}
}
