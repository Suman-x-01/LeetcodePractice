package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>>ans=new ArrayList<>();
		if(nums.length<4)return ans;
		int n=nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < n-3; i++) {
			if (i>0 &&nums[i]==nums[i-1])continue;
			for (int j=i+1;j<n-2;j++){
				if (j>i+1 && nums[j]==nums[j-1])continue;
				long remain=(long)target-nums[i]-nums[j];
				int left=j+1;
				int right =n-1;
				while(left<right){
					long sum=(long)nums[left]+nums[right];
					if (sum==remain){
						ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						left++;
						right--;
						while (left<right &&nums[left]==nums[left-1])left++;
						while (left<right &&nums[right]==nums[right-1])right++;
					}else if(sum<remain)left++;
					else right--;
				}
			}
		}
		return  ans;
	}

	public static void main(String[] args) {
		int []arr={1,0,-1,0,-2,2};
		List<List<Integer>> lists = fourSum(arr, 0);
		for(List l:lists){
			System.out.println(l);
		}

	}
}
