package com.LeetCode;

public class SpiralMatrix2_59 {
	public static void main(String[] args) {
		int[][] ints = generateMatrix(3);
		for (int i = 0; i < ints.length; i++) {
			for (int j = 0; j < ints[i].length; j++) {
				System.out.print(ints[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] generateMatrix(int n) {

		int [][]matrix=new int[n][n];
		int startRow=0, startCol=0;
		int endRow=n-1, endCol=n-1;
		int val=1;
		while (startRow <= endRow && startCol <= endCol) {
//			first row
			for (int i = startCol; i <= endCol; i++) {
				matrix[startRow][i]=val;
				val +=1;
			}
			startRow += 1;

//			end col
			for (int i = startRow; i <= endRow; i++) {
				matrix[i][endCol]=val;
				val+=1;
			}
			endCol -= 1;

			if (startRow <= endRow) {
				//			end row
				for (int i = endCol; i >= startCol; i--) {
					matrix[endRow][i]=val;
					val+=1;
				}
				endRow -= 1;
			}
			if (startCol <= endCol) {
//			first col
				for (int i = endRow; i >= startRow; i--) {
					matrix[i][startCol]=val;
					val+=1;
				}
				startCol += 1;
			}
		}
		return matrix;
	}

}
