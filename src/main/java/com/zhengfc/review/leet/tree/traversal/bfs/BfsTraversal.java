package com.zhengfc.review.leet.tree.traversal.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhengfc.review.leet.TreeNode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BfsTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		Map<Integer, List<Integer>> bfsMap = new HashMap<>();
		bfs(root, bfsMap, 0);
		log.info("map result: {}", bfsMap);

		var result = new ArrayList<List<Integer>>();
		for (Integer k : bfsMap.keySet())
			result.add(k, bfsMap.get(k));
		return result;
	}

	void bfs(TreeNode node, Map<Integer, List<Integer>> result, int level) {
		if (node == null)
			return;
		if (!result.containsKey(level)) {
			var valList = new ArrayList<Integer>();
			valList.add(node.getVal());
			result.put(level, valList);
		} else {
			result.get(level).add(node.getVal());
		}
		level++;
		bfs(node.getLeft(), result, level);
		bfs(node.getRight(), result, level);
	}

}
