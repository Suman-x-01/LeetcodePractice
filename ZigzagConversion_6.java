package com.LeetCode;

public class ZigzagConversion_6 {
	public static void main(String[] args) {
		String str="PAYPALISHIRING";
		int numofrows=3;
		String convert = convert(str, numofrows);
		System.out.println(convert);
	}

	public static String convert(String s, int numRows) {
		// If there's only one row, return the string as is.
		if (numRows == 1) return s;

		// Create a list to hold each row of the zigzag pattern.
		StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];

		// Initialize each row as an empty StringBuilder.
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new StringBuilder();
		}

		int currentRow = 0;
		boolean goingDown = false;

		// Traverse the string and place characters in the appropriate row.
		for (char c : s.toCharArray()) {
			rows[currentRow].append(c);

			// Change direction when we reach the first or last row.
			if (currentRow == 0 || currentRow == numRows - 1) {
				goingDown = !goingDown;
			}

			// Move to the next row (up or down).
			currentRow += goingDown ? 1 : -1;
		}

		// Combine all rows into a single string.
		StringBuilder result = new StringBuilder();
		for (StringBuilder row : rows) {
			result.append(row);
		}

		return result.toString();
//		System.out.println(rows.toString());
	}
}
