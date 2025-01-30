package com.LeetCode;
/*
Example 1:

Input: s = "barfoothefoobarman", words = ["foo","bar"]

Output: [0,9]

Explanation:

The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.

Example 2:

Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]

Output: []

Explanation:

There is no concatenated substring.
 */
public class Concatenation_of_All_Words_30 {
	public static void main(String[] args) {
		String str="barfoothefoobarman";
		String []strArr={"foo","bar"};
		findConcatinationWords(str,strArr);
	}

	private static String findConcatinationWords(String str, String[] strArr) {
		int p=1;
//		while (p==1){
		for (int i = 0; i < strArr.length; i++) {
			int index=str.indexOf(strArr[0]);
		System.out.println(index);
//		System.out.println(str.indexOf(strArr[1]));
//		System.out.println(strArr[1].length());
			if (index != -1){
//				if ()
			}

		}
//		}
		return null;
	}
}




















