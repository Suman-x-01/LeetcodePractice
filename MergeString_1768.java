package com.LeetCode;
/*
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
 */
public class MergeString_1768 {
	public static void main(String[] args) {
	String word1="abcccccccccc", word2="ppkn";
		String s = MergeString(word1, word2);
		if (s!=null) System.out.println(s);
	}

	private static String MergeString(String word1, String word2) {
		if (word1.isEmpty() && word2.isEmpty()) return null;

		String concat="";
		if (word1.length() >=word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				concat=concat+ word1.charAt(i);
				if (word2.length()>i) concat=concat+word2.charAt(i);
			}
		}else {
			for (int i = 0; i < word2.length(); i++) {
				if (word1.length()>i) concat+=word1.charAt(i);
				concat = concat + word2.charAt(i);
			}
		}
			return concat;
	}
}
