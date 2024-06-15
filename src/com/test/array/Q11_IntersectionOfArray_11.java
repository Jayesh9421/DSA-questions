package com.test.array;

import java.util.HashSet;
import java.util.Set;

public class Q11_IntersectionOfArray_11 {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40 };
		int arr2[] = { 30, 40, 50, 60 };

		intersectionOfTwoArray(arr1, arr2);

	}

	public static void intersectionOfTwoArray(int arr1[], int arr2[]) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}

		for (int j = 0; j < arr2.length; j++) {
			if (set.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}

		}

		System.out.println("interction array");
	}

}
