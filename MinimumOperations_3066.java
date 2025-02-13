package com.LeetCode;

import java.util.PriorityQueue;

public class MinimumOperations_3066 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 4, 9};
		int i = minOperations(arr, 20);
		System.out.println(i);
	}

	public static int minOperations(int[] nums, int k) {
		// Create a min-heap (PriorityQueue in Java)
		PriorityQueue<Long> minHeap = new PriorityQueue<>();
		for (int num : nums) {
			minHeap.offer((long) num); // Use long to avoid integer overflow
		}

		int operations = 0;

		// Perform operations until all elements are >= k
		while (minHeap.size() >= 2 && minHeap.peek() < k) {
			long x = minHeap.poll(); // Remove the smallest element
			long y = minHeap.poll(); // Remove the second smallest element
			long newElement = Math.min(x, y) * 2 + Math.max(x, y); // Compute new element
			minHeap.offer(newElement); // Add the new element back to the heap
			operations++; // Increment operation count
		}

		// Check if all elements are >= k
		if (minHeap.peek() < k) {
			return -1; // Not possible to make all elements >= k
		}

		return operations;
	}
}
