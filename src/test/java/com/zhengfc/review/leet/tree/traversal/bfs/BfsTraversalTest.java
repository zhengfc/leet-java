package com.zhengfc.review.leet.tree.traversal.bfs;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.zhengfc.review.leet.TreeNode;

public class BfsTraversalTest {
	BfsTraversal bfs = new BfsTraversal();

	@Test
	public void testLevelOrder() {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		node3.setLeft(node4);
		node3.setRight(node5);
		node1.setLeft(node2);
		node1.setRight(node3);

		var level0 = Arrays.asList(3);
		var level1 = Arrays.asList(9, 20);
		var level2 = Arrays.asList(15, 7);
		var exp = Arrays.asList(level0, level1, level2);
		var exp2 = Arrays.asList(level2, level1, level0);
		assertEquals(exp, bfs.levelOrder(node1));
		assertEquals(exp2, bfs.reverseLevelOrder(node1));

		var exp3 = Arrays.asList(3.0, 14.5, 11.0);
		assertEquals(exp3, bfs.averageOfLevels(node1));

		var exp4 = 2;
		assertEquals(exp4, bfs.minDepth(node1));
		bfs.bfsWithQueue(node1);
	}

}
