package com.test.string;

import java.util.Stack;

public class Q11_CheckparenthesesInString_11 {
	
	public static void main(String[] args) {
		
		String name = "";
		
		boolean parenthesesCheck = parenthesesCheck(name);
		System.out.println(parenthesesCheck);
		
		
	}
	
	public static boolean parenthesesCheck(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			
			if(charAt == '(' || charAt == '{' || charAt == '[') {
				stack.push(charAt);
			}else if(charAt == ')' || charAt == '}' || charAt == ']') {
				if(stack.isEmpty()) { // it means that only one OneSide bracket provided like "]" then it is false
					return false;
				}
				
				Character top = stack.pop();// for last parentheses get
				if(!(top == '(' && charAt == ')' || top == '{' && charAt == '}' || top == '[' && charAt == ']' )) {
					return false;
				}
			}
		}
		return stack.isEmpty(); // Stack should be empty if all parentheses are balanced
	}
}