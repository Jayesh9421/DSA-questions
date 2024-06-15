package com.test.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q9_MejorityElement_9 {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		int majority = findMajorityElement(arr);
		System.out.println("Majority Element: " + majority);
	}

	public static int findMajorityElement(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int size = arr.length;

		for (Integer i : arr) {
			int value = map.getOrDefault(i, 0);
			map.put(i, value + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > size / 2) {
				return entry.getKey();
			}
		}

		throw new IllegalArgumentException("No majority element found");
	}
}
