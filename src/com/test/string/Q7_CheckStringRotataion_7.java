package com.test.string;


public class Q7_CheckStringRotataion_7 {
// Simple just add a two string in variable and check conacnated string having a str2 string or not
	
	public static void main(String[] args) {

		String str1 = "Jay";
		String str2 = "yaj";
		
		boolean checkRotationOfString = checkRotationOfString(str1, str2);
		
		System.out.println(checkRotationOfString);
		
	}

	public static boolean checkRotationOfString(String str1 , String str2) {
		
		if(str1.length() != str2.length()) {
			
			return false;
		}else if(str1 == null || str2 == null) {
			
			return false;
		}
		
		String concatString =  str1 + str2;
		
		return concatString.contains(str2);
		
	}
}