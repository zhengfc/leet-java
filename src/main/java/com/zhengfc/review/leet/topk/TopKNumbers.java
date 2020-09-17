package com.zhengfc.review.leet.topk;

import java.util.Arrays;
import java.util.PriorityQueue;

import com.zhengfc.review.leet.Utils;

public class TopKNumbers {
	public int[] topK(int[] nums, int k) {
//		return priorityQueueSolution(nums, k);
		return sortSolution(nums, k);
	}

	int[] priorityQueueSolution(int[] nums, int k) {
		var priorityQueue = new PriorityQueue<Integer>(Utils.COMPARATOR);
		for (int e : nums)
			priorityQueue.add(e);
		int[] retNums = new int[k];
		for (int i = 0; i < k; i++)
			retNums[i] = priorityQueue.poll();
		return retNums;
	}

	int[] sortSolution(int[] nums, int k) {
		Arrays.sort(nums);
		int[] retNums = new int[k];
		for (int i = 0; i < k; i++)
			retNums[i] = nums[nums.length - 1 - i];
		return retNums;
	}
}
