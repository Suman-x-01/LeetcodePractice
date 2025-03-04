package com.LeetCode;

public class CheckPowerOfThree_1780 {
	public static void main(String[] args) {
		int n=91;
		boolean b = checkPowersOfThree(n);
		System.out.println(b);
	}
	public static boolean checkPowersOfThree(int n) {
		while (n>0){
			if ((n%3)==2){
				return false;
			}
			n/=3;

		}
		return true;
	}
}
