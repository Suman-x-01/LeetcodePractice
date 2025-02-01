package com.LeetCode;

public class SmallestDivisorGivenThreshold_1283 {
	public static void main(String[] args) {
		int []arr={1,2,5,9};
		int threshold=7;
		int i = smallestDivisor(arr, threshold);
		System.out.println(i);
	}
	public static int smallestDivisor(int[] arr, int th){
		int start=1,end=0;
//		find the largest element from array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>end) end=arr[i];
		}
		while (start<=end){
			int mid=start+(end-start)/2;
			int sum=divisor(arr,mid);
			if (sum<=th){
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		return  start;
	}

	private static int divisor(int[] arr, int mid) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total +=arr[i]/mid;
			if (arr[i]%mid!=0){
				total+=1;
			}
		}
		return  total;
	}
}
