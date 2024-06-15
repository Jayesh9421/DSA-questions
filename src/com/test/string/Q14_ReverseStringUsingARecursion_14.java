package com.test.string;

public class Q14_ReverseStringUsingARecursion_14 {
	
	public static void main(String[] args) {
		
		String name = "jayesh";
		String recuriveString = recuriveString(name);
		System.out.println(recuriveString);
		
	}
	
	public static String recuriveString(String  str) {
		
		if(str.length() <=1 || str == null) {
			return str;
		}
		
		return recuriveString(str.substring(1))+str.charAt(0);
	}
}