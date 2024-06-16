package com.test.array;

public class Q14_NextGreaterELement_14 {
	
    public static void main(String[] args) {
    	
        int arr[] = {20, 10, 30, 50, 40};
        int next = 0;
        for (int i = 0; i < arr.length; i++) {
			 next = -1;
        	for (int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
        	System.out.println(arr[i]+" "+next);
		}
    }
}
