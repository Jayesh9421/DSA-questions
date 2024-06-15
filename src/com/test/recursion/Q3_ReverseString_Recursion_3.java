package com.test.recursion;

public class Q3_ReverseString_Recursion_3 {
	
	public static void main(String[] args) {
//		String recursiveString = recursiveString("jayesh");
		
		String name = "jayesh";
		
		System.out.println(name.substring(1)+name.charAt(0));
		
//		System.out.println(recursiveString);
	}
	
	private static String recursiveString(String s) {
		
		if(s == null || s.length() <= 1) {
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
	}
	
	// vidual reprentation
//	recursiveString("jayesh")
//	= recursiveString("ayesh") + 'j'
//	  = recursiveString("yesh") + 'a'
//	    = recursiveString("esh") + 'y'
//	      = recursiveString("sh") + 'e'
//	        = recursiveString("h") + 's'
//	          = "h"
//	        = "h" + 's' = "hs"
//	      = "hs" + 'e' = "hse"
//	    = "hse" + 'y' = "hsey"
//	  = "hsey" + 'a' = "hseya"
//	= "hseya" + 'j' = "hseyaj"

	
}
