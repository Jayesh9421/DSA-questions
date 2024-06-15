package com.test.string;


public class Q8_PrintSubStringOfString_8 {
	
	public static void main(String[] args) {
		
	String name = "jayesh";
	
	printAllSubString(name);

	}
	
	public static void printAllSubString(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
}