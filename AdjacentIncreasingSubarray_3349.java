package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class AdjacentIncreasingSubarray_3349 {
	public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
		int n = nums.size();

		// Loop through all possible starting indices of the first subarray
		for (int i = 0; i <= n - 2 * k; i++) {
			int count1 = 0; // counts increases in first subarray
			int count2 = 0; // counts increases in second subarray

			// Check first subarray
			for (int j = i; j < i + k - 1; j++) {
				if (nums.get(j) < nums.get(j + 1)) {
					count1++;
				}
			}

			// Check second subarray (adjacent)
			for (int j = i + k; j < i + 2 * k - 1; j++) {
				if (nums.get(j) < nums.get(j + 1)) {
					count2++;
				}
			}

			// Each subarray must have k-1 increases
			if (count1 == k - 1 && count2 == k - 1) {
				return true; // found two adjacent increasing subarrays
			}
		}

		return false; // no such subarrays found
	}
	public static void main(String[] args) {
List<Integer>list=new ArrayList<>();
list.add(2);
list.add(5);
list.add(7);
list.add(8);
list.add(9);
list.add(2);
list.add(3);
list.add(4);
list.add(3);
list.add(1);
		boolean b = hasIncreasingSubarrays(list, 3);
		System.out.println(b);
	}
}
