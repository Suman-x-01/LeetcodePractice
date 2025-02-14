package com.LeetCode;

import java.util.ArrayList;

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
public class Product_Of_Last_K_Number_1352 {
	ArrayList<Integer> list = new ArrayList<>();

	public Product_Of_Last_K_Number_1352() {
		list.clear();

	}

	//
	public void add(int num) {
		if (num == 0) {
			list.clear();
			return;
		}
//		if list is empty prev will be 1 else prev will be the last added element in the arraylist
		int prev = (list.size() == 0) ? 1 : list.get(list.size() - 1);
		list.add(prev * num);

	}

	public int getProduct(int k) {
		int s = list.size();
		if (s < k) return 0;
//      if no of element equals to k then return last element
		else if (s == k) return list.get(list.size() - 1);
//		if no of element in arraylist is greater then k then divide the last element with the kth element in the arraylist
		else return list.get(list.size() - 1) / list.get(list.size() - 1 - k);
	}


}
