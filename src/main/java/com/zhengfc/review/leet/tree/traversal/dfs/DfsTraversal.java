package com.zhengfc.review.leet.tree.traversal.dfs;

import java.util.Stack;

import com.zhengfc.review.leet.TreeNode;

public class DfsTraversal {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		sum -= root.getVal();
		if (root.getLeft() == null && root.getRight() == null)
			return sum == 0;
		return hasPathSum(root.getLeft(), sum) || hasPathSum(root.getRight(), sum);
	}

	void dfs(TreeNode root) {
		var st = new Stack<TreeNode>();
		st.push(root);
		while (!st.isEmpty()) {
			TreeNode node = st.pop();
			if (node.getRight() != null)
				st.push(node.getRight());
			if (node.getLeft() != null)
				st.push(node.getLeft());
		}
	}
}
