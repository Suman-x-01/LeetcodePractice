package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatination_30 {
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer>list=new ArrayList<>();
		String wordString="";
		int count=0;
		for (String word : words) {
			wordString = wordString.concat(word);

		}
		for (int i=0;i<s.length()-wordString.length()+1;i++){
			int p=i;
			while (p<s.length()-wordString.length()){
				if (s.charAt(p)==wordString.charAt(p)){

				count++;
				if (count==wordString.length()){
					list.add(wordString.length()-p);
				}
				}else{
					count=0;
					break;
				}
				p++;
			}

		}
return list;
	}

	public static void main(String[] args) {
		String []arr={"foo","bar"};
		System.out.println(findSubstring("barfoothefoobarman",arr));
	}
}
