package com.LeetCode;

public class Partition_Array_According_to_Given_Pivot_2161 {
	public static void main(String[] args) {
		int[] arr = {9, 12, 5, 10, 14, 3, 10};
		int pivot = 10;
		int[] ints = pivotArray(arr, pivot);
		for(int i:ints){
			System.out.println(i+" ");
		}
	}

	public static int[] pivotArray(int[] nums, int pivot) {
		int lCount = 0;
		int gCount = 0;
		int pCount = 0;
		for (int num : nums) {
			if (num < pivot) {
				lCount++;
			} else if (num > pivot) {
				gCount++;
			} else {
				pCount++;
			}
		}
		int i = 0;
		int j = lCount;
		int k = lCount + pCount;
		int res[] = new int[nums.length];
		for (int num : nums) {
			if (num < pivot) {
				res[i] = num;
				i++;
			} else if (num > pivot) {
				res[k] = num;
				k++;
			} else {
				res[j] = num;
				j++;
			}
		}
		return res;
	}
}
