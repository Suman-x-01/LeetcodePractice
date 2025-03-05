package com.LeetCode;

public class CountTotalNumber_2579 {
	public static long coloredCells(int n) {
		return 1 + (long) n * (n-1)  * 2;
	}

	public static void main(String[] args) {
		int n=4;
		long l = coloredCells(n);
		System.out.println(l);
	}
}
