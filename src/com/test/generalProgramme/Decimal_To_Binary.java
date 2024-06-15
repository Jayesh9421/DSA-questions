package com.test.generalProgramme;

public class Decimal_To_Binary {
// first reaminder then remaineder/2 then remiander store in a varibale i.r res += rem
	public static void main(String[] args) {

		String decimalToBinary = decimalToBinary(19);
		System.out.println(decimalToBinary);
	}

	public static String decimalToBinary(int num) {
		
		String res = " ";
		
		while(num > 0) {
			
			int rem = num%2; // remainder
			res += rem; // it is store  in a varibale
			num = num /2; // again devide remainder
			
		}
		return res;
	}

}
