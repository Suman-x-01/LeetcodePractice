package com.LeetCode;

import java.util.HashSet;

public class Find_Unique_Binary_String_1980 {
	StringBuilder sb;
	public String findDifferentBinaryString(String[] nums) {
		// StringBuilder sb=new StringBuilder("");
		// for(int i=0;i<nums.length;i++){
		//     char ch=(nums[i].charAt(i)=='0'?'1':'0');
		//     sb.append(ch);
		// }
		// return sb.toString();

		int n = nums.length;
		HashSet<String> hs = new HashSet<>();
		for (String ch : nums) {
			hs.add(ch);
		}
		sb=new StringBuilder("");
		backTrack(nums, hs, n, sb);
		return sb.toString();
	}
	public static boolean backTrack(String []nums, HashSet<String>hs, int n, StringBuilder sb){
		if (n==sb.length()){
			if (!hs.contains(sb.toString())){
				return true;
			}
			return false;
		}
		for(char ch='0';ch<='1';ch++){
			sb.append(ch);
			if(backTrack(nums,hs,n,sb)){
				return true;
			}
			sb.deleteCharAt(sb.length()-1);
		}
		return false;
	}
}
