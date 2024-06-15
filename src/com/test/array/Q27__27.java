package com.test.array;

import java.util.Arrays;
import java.util.HashSet;


public class Q27__27 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 7, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {5, 7, 8, 9, 10};

        HashSet<Integer> commonElements = commonElementInThreeArray(array1, array2, array3);
        System.out.println("Common elements in all three arrays: " + commonElements);
    }

    public static HashSet<Integer> commonElementInThreeArray(int arr1[], int arr2[], int arr3[]) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();

        // Add elements of arr1 to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Add elements of arr2 to set2
        for (int num : arr2) {
            set2.add(num);
        }

        // Iterate through arr3 to find common elements in set1 and set2
        for (int num : arr3) {
            if (set1.contains(num) && set2.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
	}
}
