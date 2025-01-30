package com.LeetCode;

/*
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"

 */
public class LongestPalindromicString_5 {
	public static void main(String[] args) {
		String str = "cdebabadew";
		FindPalindrome(str);
	}

	private static void FindPalindrome(String str) {
		String rev = "", longest = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String substr = str.substring(i, j);
				rev = new StringBuilder(substr).reverse().toString();
				if (substr.equals(rev)) {
					if (substr.length() > longest.length()) longest = substr;
				}
			}
		}
		System.out.println(longest);
	}
}
