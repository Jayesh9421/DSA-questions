package com.test.generalProgramme;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenTwoDates {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2020, 6, 14);
		
		LocalDate date2 = LocalDate.of(2024, 6, 14);
		
		Period period = Period.between(date1, date2);
		
		System.out.println("year :- "+period.getYears());
		System.out.println("month :- "+period.getMonths());
		System.out.println("date :- "+period.getDays());
		
	}
	

}
