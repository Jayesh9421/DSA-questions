package com.test.generalProgramme;

public class CountNumberOfEvenAndOddInInteger {

	public static void main(String[] args) {
		
		countOddEven(134);
	}
	
	public static void countOddEven(int num) {
		
		int evenCount =0;
		int oddCount =0;
		
		while (num != 0) {
            int digit = num % 10; // Get the last digit of num

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10; // Remove the last digit from num
        }

		System.out.println("even - "+ evenCount);
		System.out.println("odd -"+ oddCount);
		
	}
}
