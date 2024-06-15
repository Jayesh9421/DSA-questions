package com.test.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Q2_CharacterCountInString_2 {
	
// by using getOrDefault method

	public static void main(String[] args) {
		String input = "Banana";

		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] charArray = input.toCharArray();
		
		for(char ch :charArray) {
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		// convert map to list comparactor use
		ArrayList<Entry<Character, Integer>> arrayList = new ArrayList<>(map.entrySet());
		
		arrayList.sort((o1 ,o2)-> o1.getValue().compareTo(o2.getValue()));
		
		for(Entry<Character, Integer> ch : arrayList) {
			System.out.println(ch.getKey() + " : "+ ch.getValue());
		}
		
	}
}
