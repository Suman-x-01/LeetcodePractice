package com.LeetCode;

public class Koko_Eating_Bananas_875 {
	public static void main(String[] args) {
		int[] arr = {805306368,805306368,805306368};
		int h = 1000000000;
		int i = minEatingSpeed(arr, h);
		System.out.println(i);
	}

	public static int minEatingSpeed(int[] piles, int h) {

		int start = 1, end = 0;
//		find the maximum from the array
		for (int i = 0; i < piles.length; i++) {
			if (piles[i] > end) {
				end = piles[i];
			}
		}
		int ans = end;

		while (start <= end) {
			int mid = start + (end - start) / 2;
//			validate each mid value is the actual value or not from (1 -> k) if yes then this mid value would be my possible answer
//			unless we find the better answer
			if (validEatingSpeed(piles, h, mid)) {
				ans = mid;
				end = mid-1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	private static boolean validEatingSpeed(int[] piles, int h, int mid) {
		long totalHour = 0;
		for (int i = 0; i < piles.length; i++) {
			totalHour += piles[i] / mid;
			if (piles[i] % mid != 0) {
				totalHour += 1;
			}
		}

		return totalHour <= h;
	}
}
