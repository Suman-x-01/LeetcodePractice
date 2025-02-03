package com.LeetCode;

import java.util.Stack;

public class Valid_Parenthisis_20 {
	public static void main(String[] args) {
		String str="[({}){}]";
		boolean valid = isValid(str);
		System.out.println(valid);
	}
	public static boolean isValid(String str){
		if (str.isEmpty())return false;
		Stack<Character>s=new Stack<>();
		for(char i:str.toCharArray()){
//			System.out.println(i);
			if (i == '[' || i =='{' || i == '('){
				s.push(i);
			}else{
				switch (i){
					case ')':
						if (s.pop()!='(') return false;
						break;
					case '}':
						if (s.pop()!='{') return false;
						break;
					case ']':
						if (s.pop()!='[') return false;
						break;
				}
			}
		}

		return true;
	}
}
