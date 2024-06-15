package com.test.string;

public class Q1_SplitString_1 {

	public static void main(String[] args) {
		
		String name = "jayesh , kakad";
		
		String[] split = name.split(",");
		
		
		for (String string : split) {
			System.out.println(string);
		}
	}
}
