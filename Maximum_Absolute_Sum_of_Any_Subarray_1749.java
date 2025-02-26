package com.LeetCode;

public class Maximum_Absolute_Sum_of_Any_Subarray_1749 {
	public static void main(String[] args) {
		int []sum={1,-3,2,3,-4};
		int i = maxAbsoluteSum(sum);
		System.out.println(i);
	}
	public static int maxAbsoluteSum(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		int curPSum=0;
		int curNSum=0;
		for(int num : nums){
			// pos
			curPSum += num;
			maxSum = Math.max(maxSum,curPSum);
			if(curPSum < 0){
				curPSum = 0;
			}
			// neg
			curNSum += num;
			minSum = Math.min(minSum,curNSum);
			if(curNSum > 0){
				curNSum = 0;
			}
		}
		return Math.max(maxSum, Math.abs(minSum));
	}
}
