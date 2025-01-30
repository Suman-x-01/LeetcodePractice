package com.LeetCode;

public class ZigzagConversion_6 {
	public static void main(String[] args) {
		String str="1234567890";
		int numofrows=4;
		convert(str, numofrows);
	}

	public static void convert(String str, int numRows) {
//		1234567890
		int vertical=0,res=0;
		res= numRows-3;
		vertical=res +numRows;
		for (int i = 0; i < numRows; i++) {
			System.out.print(str.charAt(i));
//			printing the space
//			for ( int j=0;j<vertical-(i+2);j++){
			int j=0;
				while (j<=vertical-(i+2)){
					j++;
				System.out.print(" ");
				if (j==vertical-(i+2) && i!=0){
					System.out.print(str.charAt((vertical+1)-i));
				}
			}


			for (int k = 1; k <=i-1; k++) {
//				if (i==1 ||i>1){

				System.out.print(" ");
//				}
			}
				System.out.print(str.charAt(vertical+1+i));
//			}
			System.out.println();
		}

	}
}
