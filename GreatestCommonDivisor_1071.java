package com.LeetCode;

public class GreatestCommonDivisor_1071 {
	public static void main(String[] args) {
		String str1="ABCABC",str2="ABC";
		String calculation = calculation(str1, str2);
		if (calculation!=null)System.out.println(calculation);
	}

	private static String calculation(String str1, String str2) {
//		String largest=Math.max(str1.length(),str2.length());
//		ABABAC  ABAB
		if (str1.length()>str2.length()){
//			check the str 2  characters are same as str1 first chars
			boolean equalCheck= str1.substring(0,str2.length()).equals(str2.substring(0,str2.length()));
//			check rest of str1 chars are same as str2 chars
			String subStr = str1.substring(str2.length());
			boolean equalCheck2=subStr.equals(str2.substring(0,subStr.length()));
			String res="";
			if (equalCheck && equalCheck2){
				return  subStr;
			}

		}else{
//		ABBCABBCABBCABBCABBCABBC   ABBCABBC
			boolean equalCheck= str2.substring(0,str1.length()).equals(str1.substring(0,str1.length()));
			String subStr = str2.substring(str1.length());
			boolean equalCheck2=subStr.equals(str1.substring(0,subStr.length()));
			String res="";
			if (equalCheck && equalCheck2){
				return  subStr;
			}
		}
		return "";
	}
}
