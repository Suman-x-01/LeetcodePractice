package com.LeetCode;

public class RotatedArray_189 {
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;

		reverse(nums, 0, n - 1);
		System.out.println(" After First");
		reverse(nums, 0, k - 1);
		System.out.println("After Second");

		reverse(nums, k, n - 1);
	}

	private static void reverse(int[] nums, int l, int r) {
		while (l < r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
			l++;
			r--;
			for(int n:nums){
				System.out.print("[ "+n+" ]");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7};
		rotate(arr,3);
	}
}
