package com.zhengfc.review.leet.tree.traversal.dfs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhengfc.review.leet.TreeNode;

public class DfsTraversalTest {
	DfsTraversal dfs = new DfsTraversal();

	@Test
	public void testDfs() {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(8);
		TreeNode node4 = new TreeNode(11);
		TreeNode node5 = new TreeNode(13);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(2);
		TreeNode node9 = new TreeNode(1);
		node1.setLeft(node2);
		node2.setLeft(node4);
		node4.setLeft(node7);
		node4.setRight(node8);
		node1.setRight(node3);
		node3.setLeft(node5);
		node3.setRight(node6);
		node6.setRight(node9);
		assertTrue(dfs.hasPathSum(node1, 22));
	}
}
