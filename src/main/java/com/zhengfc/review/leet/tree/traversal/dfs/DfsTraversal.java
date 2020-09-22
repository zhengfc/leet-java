package com.zhengfc.review.leet.tree.traversal.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.zhengfc.review.leet.TreeNode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DfsTraversal {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		sum -= root.getVal();
		if (root.getLeft() == null && root.getRight() == null)
			return sum == 0;
		return hasPathSum(root.getLeft(), sum) || hasPathSum(root.getRight(), sum);
	}
	
	public List<List<Integer>> pathSumII(TreeNode node, int sum) {
		var preList = new ArrayList<Integer>();
		var plist = new ArrayList<List<Integer>>();
		recursive(node, sum, preList, plist);
		log.info("plist: {}", plist);
		return plist;
	}

	public int pathSumIII(TreeNode node, int sum) {
		return findPathSum(node, sum) + findPathSum(node.getLeft(), sum) + findPathSum(node.getRight(), sum);
	}

	int findPathSum(TreeNode node, int sum) {
		if (node == null)
			return 0;
		return node.getVal() == sum ? 1 : findPathSum(node.getLeft(), sum - node.getVal()) + findPathSum(node.getRight(), sum - node.getVal());
	}

	void recursive(TreeNode node, int sum, List<Integer> preList, List<List<Integer>> plist) {
		if (node == null)
			return;
		sum = sum - node.getVal();
		preList.add(node.getVal());
		if (node.getLeft() == null && node.getRight() == null) {
			log.info("all list: {}", preList);
			if (sum == 0) {
				plist.add(new ArrayList<>(preList));
			}
		} else {
			if (node.getLeft() != null)
				recursive(node.getLeft(), sum, preList, plist);
			if (node.getRight() != null)
				recursive(node.getRight(), sum, preList, plist);
		}
		preList.remove(preList.size() - 1); // 删除上层节点
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
