package com.LeetCode;

public class ReverseInteger_7 {
	public static void main(String[] args) {
		int num = 1534236469;
		int i = ReverseNumber(num);
//		ctrl + alt +v
		System.out.println(i);
	}

	private static int ReverseNumber(int num) {
		int rem = 0, sum=0;


		while (num != 0) {
			rem = num % 10;
			if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && rem > 7)) {
				return 0; // Overflow occurred, return 0
			}
			if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && rem < -8)) {
				return 0; // Underflow occurred, return 0
			}
			sum = sum * 10 + rem;
			num = num / 10;
		}
			return sum;
	}
}
