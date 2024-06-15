package com.test.string;

public class Q10_NoOfOccurancesCharacterInString_10 {

	public static void main(String[] args) throws Exception {

		String name = "bannana";
		
		countCharacterInString(name, 'n');
		
	}

	public static void countCharacterInString(String str, char target) throws Exception {
		
		char[] charArray = str.toCharArray();
		
		int count = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == target) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.println(target +" = occures "+count+" times ");
		}else {
			throw new Exception("Sorry charcter is not found in a String");
		}
		
	}

}