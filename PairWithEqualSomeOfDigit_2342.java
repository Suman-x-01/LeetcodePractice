package com.LeetCode;

import java.util.HashMap;

public class PairWithEqualSomeOfDigit_2342 {
	public static int maximumSum(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxSum = -1;

		for (int num : nums) {
			int digitSum = getDigitSum(num);

			if (map.containsKey(digitSum)) {
				maxSum = Math.max(maxSum, map.get(digitSum) + num);
				map.put(digitSum, Math.max(map.get(digitSum), num)); // Store the max number
			} else {
				map.put(digitSum, num);
			}
		}

		return maxSum;
	}

	private static int getDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums1 = {18, 43, 36, 13, 7};
		System.out.println(maximumSum(nums1)); // Output: 54

		int[] nums2 = {10, 12, 19, 14};
		System.out.println(maximumSum(nums2)); // Output: -1
	}
}
