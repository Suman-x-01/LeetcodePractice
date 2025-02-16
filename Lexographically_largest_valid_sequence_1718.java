package com.LeetCode;

public class Lexographically_largest_valid_sequence_1718 {
	public int[] constructDistancedSequence(int n) {
		boolean []used=new boolean[n+1];
		int []seq=new int[n*2-1];
		backTracking(used, seq, n, 0);
		return seq;
	}
	public static boolean backTracking(boolean []used, int []seq, int n, int index)
	{
		while (index<seq.length && seq[index]!=0){
			index++;
		}
		if (index==seq.length) return  true;
		for (int i = n; i >1 ; i--) {
			if (i==1){
				if (used[i])continue;
				seq[index]=i;
				used[i]=true;
				if (backTracking(used,seq,n,index+1)) return true;
				seq[index]=0;
				used[i]=false;
			} else if (index+i<seq.length && seq[index]==0) {
				seq[index]=i;
				seq[index+i]=i;
				used[i]=true;
				if (backTracking(used,seq,n,index+1))return true;
				seq[index]=0;
				used[i]=false;
				seq[index+i]=0;
			}
		}
		return  false;
	}
}
