package com.test.string;

public class Q15_CompareTwoString_15 {
	
	public static void main(String[] args) {
		
		String str1 = "Jayesh";
		String str2 = "jayesh";
		
		boolean compareTwoStrings = compareTwoStrings(str1, str2);
		System.out.println(compareTwoStrings);
	}
	
	public static boolean compareTwoStrings(String str1 , String str2) {
		
		if(str1.length() != str2.length()) {
			
			return false;
		}
		
		String name1 =str1.toLowerCase();
		String name2 =str2.toLowerCase();
		
		for (int i = 0; i < name1.length(); i++) {
			if(name1.charAt(i) != name2.charAt(i)) {
				return false;
				
			}
		}
		
		return true;
	}
}