package com.LeetCode;

public class SingleElementInShortedArray_540 {
	public static void main(String[] args) {
int []arr={2,2,3,3,4,4,5,6,6,7,7};
		int i = singleNonDuplicate(arr);
		System.out.println(i);
	}
	public static int singleNonDuplicate(int[] nums) {
		int start=0,end=nums.length-2;
		while (start<=end){
			int mid=start+(end-start)/2;
			if (nums[mid]==nums[mid^1]){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return nums[start];
	}
}
