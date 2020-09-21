package com.zhengfc.review.leet.tree.traversal.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.zhengfc.review.leet.TreeNode;
import com.zhengfc.review.leet.Utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BfsTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		Map<Integer, List<Integer>> bfsMap = new LinkedHashMap<>();
		bfs(root, bfsMap, 0);
		log.info("map result: {}", bfsMap);

		var result = new ArrayList<List<Integer>>();
		bfsMap.entrySet().stream().forEach(e -> result.add(e.getValue()));
		return result;
	}

	public List<List<Integer>> reverseLevelOrder(TreeNode root) {
		Map<Integer, List<Integer>> bfsMap = new HashMap<>();
		bfs(root, bfsMap, 0);
		log.info("map result: {}", bfsMap);

		var result = new ArrayList<List<Integer>>();
		bfsMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Utils.COMPARATOR)).forEachOrdered(e -> result.add(e.getValue()));
		return result;
	}

	public List<Double> averageOfLevels(TreeNode root) {
		Map<Integer, List<Integer>> bfsMap = new LinkedHashMap<>();
		bfs(root, bfsMap, 0);
		log.info("map result: {}", bfsMap);

		var result = new ArrayList<Double>();
		bfsMap.entrySet().stream().forEach(e -> {
			List<Integer> es = e.getValue();
			result.add(es.stream().reduce(0, Integer::sum) / (es.size() * 1.0));
		});
		return result;
	}

	public int minDepth(TreeNode root) {
		return bfsMinLevel(root, 0);
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

	int bfsMinLevel(TreeNode node, int level) {
		if (node == null) {
			return level;
		}
		level++;
		int x = bfsMinLevel(node.getLeft(), level);
		int y = bfsMinLevel(node.getRight(), level);
		return Math.min(x, y);
	}

}
