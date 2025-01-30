package com.LeetCode;

import java.lang.reflect.Array;
import java.util.*;

/*
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 */
public class LetterCombination_17 {
	public static void main(String[] args) {


		String ch = "2";
		List<String> words = findCombinationWords(ch);
		System.out.println(words);
//		System.out.println(words);
	}

	private static List<String> findCombinationWords(String ch) {
		ArrayList<String> res = new ArrayList<>();
		if (ch.isEmpty()){
			return  new ArrayList<>();
		}
		HashMap<Integer, String> map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "nmo");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

		int num = Integer.parseInt(ch);
		ArrayList<String> arrayList = new ArrayList<>();
		int count=0;
		while (num > 0) {
			count++;
			int temp = num % 10;
			if (temp == 1) return null;
			else
				arrayList.add(map.get(temp));
			num = num / 10;
		}
		if (count==1){
			String s = arrayList.get(0);

			for (int i = 0; i < s.length(); i++) {

					res.add(String.valueOf(s.charAt(i)));

			}
			return res;
		}else{

		String s = arrayList.get(0);
		String s2 = arrayList.get(1);
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				res.add(String.valueOf(s.charAt(i)) + String.valueOf(s2.charAt(j)));
			}
		}

		return res;
		}
	}
}
