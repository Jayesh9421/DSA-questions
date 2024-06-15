package com.test.string;

import java.util.HashSet;
import java.util.Set;

public class Q4_LongestSubstring_4 {

	public static void main(String[] args) {
		

		String name = "abcdab";

		String longestSubString = longestSubString(name.toLowerCase());
		
		System.out.println(longestSubString);
		
		
		
	}
	
	public static String longestSubString(String str) {
		
		Set<Character> set = new HashSet<>();
		
		String longTillNow = "";
		String longOverAll = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char charAt = str.charAt(i);
			
			if(set.contains(charAt)) {
				longTillNow="";
				set.clear();
			}
			set.add(charAt);
			longTillNow += charAt;
			
			if(longTillNow.length() > longOverAll.length()) {
				longOverAll =  longTillNow;
			}
		}
		
		return longOverAll;
	}

}