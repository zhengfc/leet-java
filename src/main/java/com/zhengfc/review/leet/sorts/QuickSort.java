package com.zhengfc.review.leet.sorts;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort {
	int[] sort(int[] nums) {
		return qsort(nums);
	}

	int[] qsort(int[] nums) {
		if (nums.length < 2) {
			return nums;
		}
		// 基准分离
		int pivot = nums[nums.length - 1];
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > pivot)
				right.add(nums[i]);
			else
				left.add(nums[i]);
		}
		// 递归
		IntBuffer intBuffer = IntBuffer.allocate(nums.length);
		intBuffer.put(qsort(left.stream().mapToInt(e -> e).toArray())).put(pivot).put(qsort(right.stream().mapToInt(e -> e).toArray()));
		return intBuffer.array();
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		log.info("sort: {}", qs.sort(new int[] { 8, 1, 7, 2, 3, 6, 5, 4 }));
	}

}
