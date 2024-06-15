package com.test.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q16_FirstNonRepeatedCharacter_16 {

	public static void main(String[] args) {
		
		String str = "mmccug";
		
		char firstNonRepeatedCharcater = firstNonRepeatedCharcater(str);
		
		System.out.println(firstNonRepeatedCharcater);
	}
	
	public static char firstNonRepeatedCharcater(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] charArray = str.toCharArray();
		
		for(Character ch : charArray) {
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : charArray) {
			if(map.get(ch) == 1) {
				return ch;
			}
		}
		return '\0';
	}
}