package com.LeetCode;

import java.util.HashMap;

public class CountNoOfBadPair_2364 {
	public static void main(String[] args) {
		int []nums={4,1,3,3};
		long res=countBadPairs(nums);
		System.out.println(res);
	}
	public static long countBadPairs(int[] nums) {
	long goodPair=0;
	long n=nums.length;
	long total=n*(n-1)/2;
		HashMap<Integer,Integer>map=new HashMap<>();
	for (int i=0;i<n;i++){

		int val=i-nums[i];
		int isPresent=map.getOrDefault(val,0);
		goodPair+=isPresent;
		map.put(val,map.getOrDefault(val,0)+1);
	}
		return total-goodPair;
	}
}
