package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix_54 {
	public static void main(String[] args) {
		int [][]matrix={
				{1,2,3,3},
				{4,5,6,4},
				{7,8,5,9}
		};
		List<Integer> integers = spiralOrder(matrix);

		System.out.println(integers);
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		int startRow = 0, startCol = 0;
		int endRow = matrix.length-1;
		int endCol = matrix[0].length-1;
		while (startRow <= endRow && startCol <= endCol) {
//			first row
			for (int i = startCol; i <= endCol; i++) {
				list.add(matrix[startRow][i]);
			}
			startRow += 1;

//			end col
			for (int i = startRow; i <= endRow; i++) {
				list.add(matrix[i][endCol]);
			}
			endCol -= 1;

			if (startRow <= endRow) {
				//			end row
				for (int i = endCol; i >= startCol; i--) {
					list.add(matrix[endRow][i]);
				}
				endRow -= 1;
			}
			if (startCol <= endCol) {
//			first col
				for (int i = endRow; i >= startRow; i--) {
					list.add(matrix[i][startCol]);
				}
				startCol += 1;
			}
		}

		return list;
	}
}
