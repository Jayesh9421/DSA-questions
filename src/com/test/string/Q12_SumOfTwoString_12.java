package com.test.string;

public class Q12_SumOfTwoString_12 {
	
	public static void main(String[] args) {
		
		String str1 = "90";
		String str2 = "53";
		
		sumstring(str1, str2);
		
	}
	
	public static void sumstring (String str1 , String str2) {
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int result = num1 + num2;
		
		System.out.println(num1 + " + "+ num2+" = "+ result);
	}
}