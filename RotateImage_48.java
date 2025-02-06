package com.LeetCode;
//clockwise rotate
/*
1. transpose (mirror reflection of matrix)
2. Swap
 */
public class RotateImage_48 {
	public static void main(String[] args) {
		int [][]mat={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		rotate(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=============================");
		clockwiseRotation(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				swap(matrix,i,j);
			}
		}
	}
	public static void swap(int [][]matrix, int i, int j){
		int temp=matrix[i][j];
		matrix[i][j]=matrix[j][i];
		matrix[j][i]=temp;
	}
	public static void clockwiseRotation(int [][]matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length/2; j++) {
				swap2(matrix,i,j,i,matrix.length-1-j);
			}
		}
	}

	private static void swap2(int[][] matrix, int i, int j,int p, int q) {
		int temp=matrix[i][j];
		matrix[i][j]=matrix[p][q];
		matrix[p][q]=temp;
	}
}
