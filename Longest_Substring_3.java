package com.LeetCode;

import java.util.HashSet;

public class Longest_Substring_3 {
	public static void main(String[] args) {
		int i = lengthOfLongestSubstring("pwwkew");
		System.out.println(i);
	}
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character>set=new HashSet<>();
		if (s.isEmpty())return 0;


		int left=0, max=0;
			for (int right = 0; right < s.length(); right++) {
				while (set.contains(s.charAt(right))) {
					set.remove(s.charAt(left));
					left++;
				}
				set.add(s.charAt(right));
				max=Math.max(max, right-left+1);

			}
		return max;

	}
}
