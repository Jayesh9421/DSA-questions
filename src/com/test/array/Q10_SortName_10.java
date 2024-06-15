package com.test.array;

import java.util.Arrays;

public class Q10_SortName_10 {

	public static void main(String[] args) {

		String arr[] = { "Banana", "Grapes", "Apple" };

//		sortedName(arr);

		sortedByTraditionalWay(arr);
		System.out.println(Arrays.toString(arr));
	}

	// SORTED BY STREAM_API
	public static void sortedName(String arr[]) {

		String[] sortedName = Arrays.stream(arr).sorted().toArray(String[]::new);

		System.out.println(Arrays.toString(sortedName));
	}

	public static void sortedByTraditionalWay(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
