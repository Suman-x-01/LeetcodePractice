package com.LeetCode;

public class Search_Rotated_Shorted_Array_33 {
	public static void main(String[] args) {
		int []arr={5,6,7,4,3,2};
		int target=4;
		int search = search(arr, target);
		System.out.println(search);
	}
	public static int search(int[] arr, int target) {
		int start=0, end=arr.length-1,ans=-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]==target)return mid;
			// left side shorted
			if(arr[start]<=arr[mid]){
				// check is the element is exist or not
				if(target>=arr[start] && target<=arr[mid]){
					end=mid-1;
				}else{
					start=mid+1;
				}
			}else{
				// check if element is exist or not
				if(target>=arr[mid+1] && target <=arr[end]){
					start=mid+1;
				}else{
					end=mid-1;
				}
			}
		}
		return ans;
	}
}
