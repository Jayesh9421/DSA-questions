package com.test.string;


public class Q3_StringPaligram_3 {
	// panagram a string which has a all A_Z characters
	public static void main(String[] args) {

		String name = "The quick brown fox jumps over the lazy dog";

		boolean stringPanagram = stringPanagram(name.toLowerCase());
		System.out.println(stringPanagram);

	}

	// 1 method
	public static boolean stringPanagram(String str) {
		
		if(str.length() < 26) {
			
			return false;
		}else {
			for (int i = 'a'; i <='z'; i++) {
				
				if(str.indexOf(i) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
