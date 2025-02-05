package com.LeetCode;

public class Regular_Expression_Matching_10 {
	public static void main(String[] args) {
String s="abc", p=".*";
		boolean match = isMatch(s, p);
		System.out.println(match);
	}
	public static boolean isMatch(String s, String p) {
		// Create a DP table of size (s.length() + 1) x (p.length() + 1)
		boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

		// Base case: empty string and empty pattern match
		dp[0][0] = true;

		// Handle patterns like "a*", ".*" matching an empty string
		for (int j = 1; j <= p.length(); j++) {
			if (p.charAt(j - 1) == '*') {
				dp[0][j] = dp[0][j - 2];  // '*' can match zero occurrences of the previous character
			}
		}

		// Fill the DP table
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= p.length(); j++) {
				char sc = s.charAt(i - 1);
				char pc = p.charAt(j - 1);

				if (pc == sc || pc == '.') {
					// If characters match or the pattern is '.', inherit from the previous state
					dp[i][j] = dp[i - 1][j - 1];
				} else if (pc == '*') {
					// Handle '*' pattern: two cases:
					// 1. '*' matches zero of the preceding element (dp[i][j - 2])
					// 2. '*' matches one or more of the preceding element (dp[i - 1][j] if sc matches the preceding character)
					dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (sc == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
				}
			}
		}

		// The result is stored in dp[s.length()][p.length()]
		return dp[s.length()][p.length()];
	}

}
