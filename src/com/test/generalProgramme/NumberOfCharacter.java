package com.test.generalProgramme;

public class NumberOfCharacter {

	public static void main(String[] args) {
		
		String name = "jayesh   kakad";

		String[] split = name.split(" "); // split in a empty space then count each character separate
		
		for (String string : split) {
			if(!string.isEmpty()) {
				
				System.out.println(string+" : "+ string.length());
			}
		}
		
	}
	
}
