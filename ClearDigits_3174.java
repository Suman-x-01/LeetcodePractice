package com.LeetCode;

public class ClearDigits_3174 {
	public static void main(String[] args) {
		String str="a2bch55sj4ase";
		String res=clearDigits(str);
		System.out.println(res);
	}
	public static String clearDigits(String s) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))){
				sb.append(s.charAt(i));
			}else{
				if (!sb.isEmpty()){
					sb.deleteCharAt(sb.length()-1);
				}
			}
		}
		return sb.toString();
	}
}
