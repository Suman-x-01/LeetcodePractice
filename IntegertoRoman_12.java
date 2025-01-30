package com.LeetCode;

public class IntegertoRoman_12 {
	public static void main(String[] args) {

		int num = 449;
		String romanNumber = findRomanNumber(num);
//		System.out.println(romanNumber);
	}

	private static String findRomanNumber(int num) {
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//		                 {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length && num > 0; i++) {
			while (num >= values[i]) {
				sb.append(roman[i]);
				num -= values[i];
			}
		}
		/*
		leetcode - 12 problem answer
		String p=" hello world";
		String arr[]=p.split("\\s+");
		int size= arr[arr.length-1].length();
		System.out.println(size);

		 */
		return sb.toString();
	}
}
