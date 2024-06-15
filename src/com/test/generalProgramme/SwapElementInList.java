package com.test.generalProgramme;

import java.util.Arrays;
import java.util.List;

public class SwapElementInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20);
		swapElementInList(list);
		System.out.println(list);
		
	}
	
	public static void swapElementInList(List<Integer> list) {
		
		
		int left=0;
		int right = list.size()-1;
		
		while(left < right) {
			int temp = list.get(left);
			list.set(left, list.get(right)); // focus on this logic set and get
			list.set(right, temp);
			
			left++;
			right--;
		}
		
	}
}
