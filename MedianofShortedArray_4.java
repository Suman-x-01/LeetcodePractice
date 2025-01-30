package com.LeetCode;
/*

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianofShortedArray_4 {
	public static void main(String[] args) {
		int[] arr = {2, 4};
		int[] arr2 = {3,6};

		double i = FindMedian(arr, arr2);
		System.out.println(i);
	}

	private static double FindMedian(int[] arr, int[] arr2) {
		int[] arr3 = new int[arr.length + arr2.length];
		int p = 0, q = 0,i=0;
		while (p < arr.length && q < arr2.length) {
			if (arr[p] <= arr2[q]) {
				arr3[i] = arr[p];
				p++;i++;
			}
			else {
				arr3[i] = arr2[q];
				q++;i++;
			}
		}
		while(p<arr.length){
			arr3[i] = arr[p];
			p++; i++;
		}
		while(q<arr2.length){
			arr3[i] = arr2[q];
			q++; i++;
		}
//		find array is even or odd
		int mid=arr3.length/2;
		if (arr3.length%2==0){
			return (arr3[mid-1] +arr3[mid])/2.0;
		}else{
			return arr3[mid-1];
		}

	}
}
