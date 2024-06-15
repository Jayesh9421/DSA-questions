package com.test.array;


public class Q27_MatricInArray_27 {

	public static void main(String[] args) {
		
		matrixInArray(2,3,3);
		
	}

	public static void matrixInArray( int value , int r , int c) {
		
		int matric[][] =  new int[r][c];
		for (int i = 0; i <r; i++) {
			for (int j = 0; j < c; j++) {
				matric[i][j] = value; // focus on this value this value in flex in whole matrix
			}
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matric[i][j]+" ");
			}
			System.out.println();
		}
	}
}

