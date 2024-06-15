package com.test.generalProgramme;

public class FindLargestNumber {

	public static void main(String[] args) {
	
		int largestNumber = findLargestNumber(40,50,60);
		System.out.println(largestNumber);
		
	}

	private static int findLargestNumber(int num1 , int num2 , int num3) {

		int largestNumber = num1;
		
		if(num2 > largestNumber) {
			largestNumber = num2;
		}
		
		if(num3 > largestNumber) {
			largestNumber = num3;
		}
		
		return largestNumber;
	}
	
	
	
}
