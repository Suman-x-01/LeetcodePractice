package com.LeetCode;

public class Letter_Tile_Possibilities_1079 {
	public static void main(String[] args) {
		String tiles="AAB";
		int i = numTilePossibilities(tiles);
		System.out.println(i);
	}
	public static int numTilePossibilities(String tiles) {
		int []freq=new int[26];
		for (int i = 0; i < tiles.length(); i++) {
			freq[tiles.charAt(i)-'A']++;

		}
		return backTracking(freq);
	}
	public static int backTracking(int []freq){
		int count=0;
		for (int i=0;i<26;i++){
			if (freq[i]==0)continue;
			count++;
			freq[i]--;
			count+= backTracking(freq);
			freq[i]++;
		}
		return  count;
	}
}
