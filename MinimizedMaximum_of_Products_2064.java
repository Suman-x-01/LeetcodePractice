package com.LeetCode;

/*
ou are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.

You need to distribute all products to the retail stores following these rules:

A store can only be given at most one product type but can be given any amount of it.
After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
Return the minimum possible x.



Example 1:

Input: n = 6, quantities = [11,6]
Output: 3
Explanation: One optimal way is:
- The 11 products of type 0 are distributed to the first four stores in these amounts: 2, 3, 3, 3
- The 6 products of type 1 are distributed to the other two stores in these amounts: 3, 3
The maximum number of products given to any store is max(2, 3, 3, 3, 3, 3) = 3.
Example 2:

Input: n = 7, quantities = [15,10,10]
Output: 5
Explanation: One optimal way is:
- The 15 products of type 0 are distributed to the first three stores in these amounts: 5, 5, 5
- The 10 products of type 1 are distributed to the next two stores in these amounts: 5, 5
- The 10 products of type 2 are distributed to the last two stores in these amounts: 5, 5
The maximum number of products given to any store is max(5, 5, 5, 5, 5, 5, 5) = 5.
 */
public class MinimizedMaximum_of_Products_2064 {
	public static void main(String[] args) {
		int[] arr = {11, 6};
		int shop = 6;
		int res = minimizedMaximum(shop, arr);
		System.out.println(res);
	}

	public static int minimizedMaximum(int n, int[] quantities) {
		int start = 1, end = 0;
		for (int i = 0; i < quantities.length; i++) {
			if (quantities[i] > end) {
				end = quantities[i];
			}
		}
		int ans=0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int shop = findShop(quantities, mid);
			if (shop <= n) {
				ans=mid;
				end = mid-1;
			} else {
				start = mid + 1;
			}
		}

		return start;
	}

	private static int findShop(int[] quantities, int mid) {
		System.out.println("mid "+mid);
		int total = 0;
		for (int i = 0; i < quantities.length; i++) {
			total += quantities[i] / mid;
			if (quantities[i] % mid != 0) {
				total += 1;
			}
		}
		System.out.println("total"+total);
		return total;
	}
}





















