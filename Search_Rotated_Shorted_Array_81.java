package com.LeetCode;

public class Search_Rotated_Shorted_Array_81 {
	public static void main(String[] args) {
		int []arr={1,0,1,1,1};
		int target=0;
		boolean search = search(arr, target);
		System.out.println(search);
	}
	public static boolean search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid])
				return true;
			if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
				start++;
				end--;
			}
			// left part of the array is shorted
			else if (nums[start] <= nums[mid]) {
				if (target >= nums[start] && target <= nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target >= nums[mid + 1] && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return false;
	}
}
