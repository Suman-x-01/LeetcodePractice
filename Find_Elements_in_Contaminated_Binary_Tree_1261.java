package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Find_Elements_in_Contaminated_Binary_Tree_1261 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	Set<Integer> set = new HashSet<>();

	public Find_Elements_in_Contaminated_Binary_Tree_1261(TreeNode root) {
		dfs(root, 0);
	}

	public boolean find(int target) {
		return set.contains(target);
	}

	public void dfs(TreeNode node, int val) {
		if (node == null) return;
		node.val = val;
		set.add(val);
		dfs(node.left, 2 * val + 1);
		dfs(node.right, 2 * val + 2);
	}
}

