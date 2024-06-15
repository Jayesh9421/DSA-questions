package com.test.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q17_AnagramString_17 {
	
	public static void main(String[] args) {
		
		String str1 = "listen";
        String str2 = "silent";

        boolean anagramString = anagramString(str1, str2);
        System.out.println(anagramString);
		
	}
	
	public static boolean anagramString(String str1 ,String str2) {
		
		if(str1.length() != str2.length()) {
			
			return false;
		}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
		
		
	}
}