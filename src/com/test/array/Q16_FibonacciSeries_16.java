package com.test.array;

import java.util.ArrayList;
import java.util.List;

public class Q16_FibonacciSeries_16 {
	
	public static void main(String[] args) {
		
//		fibonacci(10, 0, 1);
		List<Integer> fibonacciSeriesUsingList = fibonacciSeriesUsingList(10);
		System.out.println(fibonacciSeriesUsingList);
	}
	
	public static void fibonacci(int n , int firstTerm , int secondTerm) {
		
		firstTerm = 0;
		secondTerm = 1;
		
		for (int i = 0; i <=n; i++) {
			
			System.out.println(firstTerm);
			
			int thirdTerm = firstTerm + secondTerm;
			secondTerm = firstTerm;
			firstTerm = thirdTerm;
		}
	}
	
	public static List<Integer> fibonacciSeriesUsingList(int n) {
		
		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		
		if(n>1) {
			fibonacci.add(1);
		}
		
		for (int i = 2; i < n; i++) {
			int thridTerm = fibonacci.get(i-1)+ fibonacci.get(i-2);
			fibonacci.add(thridTerm);
		}
		
		return fibonacci;
	}
}
