package com.LeetCode;

import java.util.Stack;

public class Valid_Parenthisis_20 {
	public static void main(String[] args) {
		String str = "){";
		boolean valid = isValid(str);
		System.out.println(valid);
	}

	public static boolean isValid(String str) {
		if (str.length() < 2) return false;
		Stack<Character> s = new Stack<>();
		for (char i : str.toCharArray()) {
//			System.out.println(i);

			if (i == '[' || i == '{' || i == '(') {
				s.push(i);
			} else if (i == ']' || i == '}' || i == ')') {
				if (s.isEmpty()) return false;
				switch (i) {
					case ')':
						if (s.pop() != '(') return false;
						continue;
					case '}':
						if (s.pop() != '{') return false;
						continue;
					case ']':
						if (s.pop() != '[') return false;

				}
			}
		}
		if (s.isEmpty()) {
			return true;
		} else return false;
	}
}
