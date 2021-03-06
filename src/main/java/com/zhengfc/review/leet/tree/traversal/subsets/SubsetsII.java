package com.zhengfc.review.leet.tree.traversal.subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubsetsII {

	Set<List<Integer>> bitSolution(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
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
}
