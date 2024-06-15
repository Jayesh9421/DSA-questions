package com.test.array;

import java.util.Arrays;

public class Q23_MovingAllNegativeNoToStart_23 {
	public static void main(String[] args) {
		
		int arr[] = {-10,30,40,-50,60,-70,80};
		movieNegativeStart(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void movieNegativeStart(int arr[]) {
		
		int negativeNumgber = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				int temp = arr[negativeNumgber];
				arr[negativeNumgber] = arr[i];
				arr[i] = temp;
				
				negativeNumgber++;
			}
		}
		
	}
}
