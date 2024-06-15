package com.test.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q6_FirstCharacterOFString_6 {
	
	public static void main(String[] args) {
		
		String sentance = "jayesh rajesh kakad";
		
		String firstCharacterString = getFirstCharacterString(sentance);
		System.out.println(firstCharacterString);
		
	}
	
	public static String getFirstCharacterString(String str) {
		
		StringBuilder builder = new StringBuilder();
		
		String[] split = str.split("\\s+");
		
		for (String word : split) {
			
			if(!word.isEmpty()) {
				builder.append(word.charAt(0));
			}
		}
		
		return builder.toString();
	}
}