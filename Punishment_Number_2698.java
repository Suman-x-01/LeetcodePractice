package com.LeetCode;

public class Punishment_Number_2698 {
	public static void main(String[] args) {
		int i = punishmentNumber(10);
		System.out.println(i);
	}

	public static int punishmentNumber(int n) {
		int ans = 0;
		if (n < 1) return -1;
		for (int i = 1; i <= n; i++) {
		String str=Integer.toString(i*i);
			if (isNeon(0, i, str,0)){
				ans+=(i*i);
			}

		} return ans;
	}

	public static boolean isNeon(int start, int n, String str, int curSum) {
		int size=str.length();

//	100
		if (start==size)return (curSum==n);
		for (int i = start; i <size ; i++) {
			int val=Integer.parseInt(str.substring(start,i+1));
			if (isNeon(i+1,n,str,curSum+val)){
				return true;
			}
		}
		return false;
	}
}
