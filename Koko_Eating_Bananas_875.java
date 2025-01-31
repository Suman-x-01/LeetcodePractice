package com.LeetCode;

public class Koko_Eating_Bananas_875 {
	public static void main(String[] args) {

	}
	public int minEatingSpeed(int[] piles, int h) {
		int start=0,end=Integer.MIN_VALUE;
		for(int i=0;i<piles.length;i++){
			if(piles[i]>end){
				end=piles[i];
			}
		}
		if(piles.length==h){
			return end;
		}

		while(start<=end){
			int mid=start+(end-start)/2;

		}
return -1;
	}
}
