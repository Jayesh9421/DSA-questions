package com.test.generalProgramme;

public class CheckLeapYear {

	public static void main(String[] args) {

		int year = 2021;
		
		boolean checkLeapYear = checkLeapYear(year);
		System.out.println(checkLeapYear);
		
	}

	public static boolean checkLeapYear(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

			return true;
		} else {

			return false;
		}
	}

}
