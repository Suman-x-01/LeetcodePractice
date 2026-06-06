package com.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray_26 {
	public static int removeDuplicates(int[] nums) {

		int count=0;
			int p=1;
		for(int i=1;i<nums.length;i++){
			if (nums[i]!=nums[i-1]){
				nums[p]=nums[i];
				p++;
			}
		}
		return p;
	}
	public static void main(String[] args) {
		int []arr={1,1,2,2,4,3,6,5,7,3,8,6,3};
		Arrays.sort(arr);
		System.out.println(removeDuplicates(arr));
	}
}
