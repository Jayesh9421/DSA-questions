package com.test;

public class Q2_Pattern2 {

//reverse right angle triangle

//	555555
//	55555
//	5555
//	555
//	55
//	5

	public static void main(String[] args) {

		rectanglePattern(5);
	}

	public static void rectanglePattern(int input) {

		for (int i = 0; i <= input; i++) {
			for (int j = i; j <= input; j++) {

				System.out.print(input);

			}

			System.out.println();
		}

	}
}
