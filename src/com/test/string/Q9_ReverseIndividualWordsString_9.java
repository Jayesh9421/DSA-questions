package com.test.string;

public class Q9_ReverseIndividualWordsString_9 {

	public static void main(String[] args) {

		String words = "jayesh kakad";

		String reverseWords = reverseWordString(words);
		
//		String reverseWords = reverseWords(words);
		System.out.println(reverseWords);

	}
	// use this
	public static String reverseWordString(String str){
		
		String[] words = str.split("\\s+");
		
		StringBuilder result = new StringBuilder();
		
		for(String word:words) {
			
			StringBuilder builder = new StringBuilder(word);
			
			result.append(builder.reverse().toString()).append(" ");
		}
		
		return result.toString();
		
		
		
	}
	
	public static String reverseWords(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                result.append(currentWord.reverse()).append(" ");
                currentWord.setLength(0); // Clear currentWord for next word
            } else {
                currentWord.append(ch);
            }
        }

        // Append the last word (no space at the end)
        result.append(currentWord.reverse());

        return result.toString();
    }

}