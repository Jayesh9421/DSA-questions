package com.test.recursion;

public class Q4_Recursion_4 {

	public static void main(String[] args) {
		int recurion = recurion(6);

		System.out.println(recurion);
	}

	public static int recurion(int num) {

		if (num <= 1) {

			return num;
		} else {
//			System.out.println(recurion(num));
			return (recurion(num - 2) + recurion(num - 1));
		}

	}
}
