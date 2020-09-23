package com.zhengfc.review.leet.tree.traversal.subsets;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
//		return bitSolution(nums);
		return dfs(nums);
	}

	List<List<Integer>> bitSolution(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		int size = 1 << nums.length;
		for (int i = 0; i < size; i++) {
			result.add(bitOne(nums, i));
		}
		return result;
	}

	List<Integer> bitOne(int[] nums, int size) {
		List<Integer> one = new ArrayList<>();
		for (int x = 0; x < nums.length; x++) {
			if (valueAtBit(size, x) == 1)
				one.add(nums[x]);
		}
		log.info("one: {}", one);
		return one;
	}

	private int valueAtBit(int num, int i) {
		log.info("num: {}, i: {}", num, i);
		return (num >> i) & 1;
	}

	List<List<Integer>> dfs(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		dfsSolution(0, nums, new ArrayList<Integer>(), result);
		return result;
	}

	void dfsSolution(int index, int[] nums, List<Integer> subList, List<List<Integer>> result) {
		if (index == nums.length) {
			result.add(subList);
			return;
		}
		dfsSolution(index + 1, nums, subList, result);// 不取当前数直接往下递归
		List<Integer> newSub = new ArrayList<Integer>();
		newSub.addAll(subList);// 复制一份List对象
		newSub.add(nums[index]);// 取当前数
		dfsSolution(index + 1, nums, newSub, result);
	}

}
