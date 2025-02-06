package com.LeetCode;

public class Kth_SmallestElement_378 {
	public static void main(String[] args) {
	int [][]arr={
			{1,2,3},
			{2,3,4},
			{4,5,6}
	};
		int i = kthSmallest(arr, 9);
		System.out.println(i);
	}
	public static int kthSmallest(int[][] matrix, int k) {

		int r=matrix.length;
		int c=matrix[0].length;
		int start=0,end=matrix[r-1][c-1];
		while (start<=end){
			int mid=start+(end-start)/2;
			int smallElements=findSmallElement(matrix,mid);
			if (smallElements<=k-1){
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
			return start;
	}

	private static int findSmallElement(int[][] matrix, int k) {
		int totalValue=0;
		for (int i=0;i<matrix.length;i++){
			int start=0,end=matrix[i].length-1;
			while (start<=end){
				int mid=start+(end-start)/2;
				if (matrix[i][mid]<=k){
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			totalValue +=start;

		}
		return totalValue;
	}
}
