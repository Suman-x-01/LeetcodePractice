package com.LeetCode;

import java.util.Scanner;

public class CandyRating_135 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,2};
		int i = giverating(arr);
		System.out.println(i);
	}

	private static int giverating(int[] arr) {
		int res=0;
		int[] arr2 = new int[arr.length];

		if (arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = 1;
			}
//			left to right 1,3,4,5,2
			for (int i = 0; i < arr2.length - 1; i++) {
				if (arr[i + 1] > arr[i] ) {
					arr2[i+1] = arr2[i] + 1;
				}
			}
//			right to left {1,3,4,5,2 }
			for (int i = arr.length - 1; i > 0; i--) {
				if (arr[i - 1] > arr[i]) {
					arr2[i - 1] =Math.max( arr2[i-1],arr2[i]+1);
				}
			}
		}


		for (int i : arr2) {
			res+=i;
			System.out.print(i+" ");
		}
		return res;
	}
}
