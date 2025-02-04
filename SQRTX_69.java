package com.LeetCode;

public class SQRTX_69 {
	public static void main(String[] args) {
		int i = mySqrt(10);
		System.out.println(i);

	}
	public static int mySqrt(int x) {

		int start=1,end=x;
		while (start<=end){
			int mid=start+(end-start)/2;
			if (mid<=x/mid){
				if (x%mid==0 && x/mid==0){
					return mid;
				}
				start=mid+1;
			}else
			{
				end=mid-1;
			}
		}
		return end;
	}
}
