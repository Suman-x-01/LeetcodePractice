package com.LeetCode;

public class Remove_All_Occurrences_Substring_1910 {
	public static void main(String[] args) {
		System.out.println(removeOccurrences("daabcbaabcbc","abc"));
	}
	public static String removeOccurrences(String s, String part) {
		if (s.isEmpty())return null;
		StringBuilder sb=new StringBuilder(s);
		while (sb.indexOf(part)!=-1){
			int index=sb.indexOf(part);
			sb.delete(index,index+part.length());
		}

		return sb.toString();
	}
}
