package com.test.array;

import java.util.HashSet;

public class Q19_DuplicateElementInArray_19 {
	// use a hashSet
	public static void main(String[] args) {
		
		int arr[] = {10,20,10,30,30,40,50};
		
		duplicateElemenetInArray(arr);
	}

	public static void duplicateElemenetInArray(int arr[]) {

		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) {
				
				System.out.println(arr[i]);
			}
		}
		
	}
}
