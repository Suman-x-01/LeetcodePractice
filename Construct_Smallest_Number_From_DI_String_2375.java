package com.LeetCode;

public class Construct_Smallest_Number_From_DI_String_2375 {
	public static void main(String[] args) {
String str="DDD";
String res=smallestNumber(str);
		System.out.println(res);
	}

	public static String smallestNumber(String pattern) {
		int n = pattern.length();
		boolean[] used = new boolean[10];
		StringBuilder result = new StringBuilder();
		backTrack(pattern, used, new int[n + 1], 0, result);
		return result.toString();
	}

	public static boolean backTrack(String pattern, boolean[] used, int[] num, int index, StringBuilder result) {
		if (index > pattern.length()) {
			for (int i = 0; i < num.length; i++) {
				result.append(num[i]);
			}
			return true;
		}
		for (int i = 1; i <= 9; i++) {
			if (!used[i] && (index == 0 || isValid((num[index - 1]), i, pattern.charAt(index-1)))) {
				used[i] = true;
				num[index] = i;
				if (backTrack(pattern, used, num, index + 1, result)) {
					return true;
				}
				used[i]=false;
				num[index]=0;
			}
		}
		return false;
	}

	public static boolean isValid(int lastDigit, int currentDigit, char condition) {
		return (condition == 'I' && lastDigit < currentDigit || condition == 'D' && lastDigit > currentDigit);
	}
}
