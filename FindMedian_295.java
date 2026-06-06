package com.LeetCode;

import java.util.ArrayList;

public class FindMedian_295 {
	ArrayList<Integer> al = new ArrayList<>();

	public FindMedian_295() {

	}

	public void addNum(int num) {
		al.add(num);

	}

	public double findMedian() {
		if (al.size() / 2 == 1) {
			return al.get(al.size()/2);
		}else{
			int n1=al.get((al.size()/2)-1);
			int n2=al.get(al.size()/2);
			return ((n1+n2)/2.0);
		}

	}
}
