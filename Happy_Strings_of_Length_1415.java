package com.LeetCode;

public class Happy_Strings_of_Length_1415 {
	 int count=0;
	 String res="";

	public String getHappyString(int n, int k) {
		backTrack(n,k, new StringBuilder(""));
		return res;
	}
	public boolean backTrack(int n,int k, StringBuilder cur){
		if (n== cur.length()){
			count++;
			if (k==count){
				res=cur.toString();
				return true;
			}
			return false;
		}
		for (char ch='a';ch<='c';ch++){
			int len=cur.length();
			if (len>0 && cur.charAt(len-1)==ch)continue;
			cur.append(ch);
			if(backTrack(n,k,cur)){
				return true;
			}

			cur.deleteCharAt(cur.length()-1);
		}
			return false;

	}
}
