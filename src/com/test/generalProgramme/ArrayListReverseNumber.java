package com.test.generalProgramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReverseNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		
		reverseArrayList(list);
		
		System.out.println(list);
		
	}
	
	public static void reverseArrayList(List<Integer> list) {
		
		Collections.reverse(list);
		
	}
	
	// traditional way
	public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            
            // Move pointers towards the center
            left++;
            right--;
        }
    }

}
