package com.LeetCode;

public class NumberOfSubArraysWithOddSum_1524 {
	public static void main(String[] args) {
		int []sum={1,3,5};
		int i = numOfSubarrays(sum);
		System.out.println(i);
	}
	public static int numOfSubarrays(int[] arr) {
		int Mod=1000000007;
		int evenC=1;
		int oddC=0;
		int prefix=0;
		int res=0;
		for(int num : arr){
			prefix+=num;
			if(prefix%2==0){
				res += oddC;
				evenC++;
			}else{
				res += evenC;
				oddC++;
			}
			res = res % Mod;
		}
		return res;
	}
}
