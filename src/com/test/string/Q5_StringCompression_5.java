package com.test.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q5_StringCompression_5 {
	public static void main(String[] args) {

		String name = "Jayeesh";
		
		springCompression(name);
	}

	public static void springCompression(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			map.put(charAt, map.getOrDefault(charAt, 0)+1);
		}
		StringBuilder builder = new StringBuilder();
		
		for(Entry<Character, Integer> en:map.entrySet()) {
			
			builder.append(en.getKey());
			builder.append(en.getValue());
			
		}
		
		System.out.println(builder.toString());
		
	}
}