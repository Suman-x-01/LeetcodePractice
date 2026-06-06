package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class SquresOfShortedArray_977 {
	public static int[] sortedSquares(int[] nums) {
//		ArrayList <Integer> arr=new ArrayList<>();
//		arr.remove();
		int []arr=new int[nums.length];
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<0){
				count++;
			}

		}
		int []left=Arrays.copyOfRange(nums,0,count);
		int []right=Arrays.copyOfRange(nums,count,nums.length);
		for (int i = 0; i < left.length; i++) {
			left[i] = left[i] * left[i];
		}
		for (int i = 0, j = left.length - 1; i < j; i++, j--) {
			int temp = left[i];
			left[i] = left[j];
			left[j] = temp;
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = right[i] * right[i];
		}

		int i=0,j=0,p=0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[p++] = left[i++];
			} else {
				arr[p++] = right[j++];
			}
		}

		while (i < left.length) arr[p++] = left[i++];
		while (j < right.length) arr[p++] = right[j++];
		return arr;
//===============================
//				for (int i = 0; i < nums.length; i++) {
//			nums[i] = nums[i] * nums[i];
//		}
//				Arrays.sort(nums);
//		return nums;

	}

	public static void main(String[] args) {
		int arr[]={-4,-1,3,4,5};
		int[] ints = sortedSquares(arr);
		for (int p:ints){
			System.out.println(p);
		}
	}
}
