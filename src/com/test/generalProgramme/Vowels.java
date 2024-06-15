package com.test.generalProgramme;

import java.util.Scanner;

public class Vowels {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		
		String name = scanner.next();
		
		char[] charArray = name.toCharArray();
		
		int count=0;
		
		for(char c: charArray ) {
			
			switch(c) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
				count++;
				System.out.print(c+","); // to print the all vowel which is occure
				break;
			//default:System.out.println("Their is no vowels found in this string");	
			}
		}
		
		System.out.println(":-"+count +" this is count of the vowels");
		
	}
}
