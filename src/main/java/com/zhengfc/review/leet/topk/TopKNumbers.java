package com.zhengfc.review.leet.topk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TopKNumbers {
	public int[] topK(int[] nums, int k) {
//		return priorityQueueSolution(nums, k);
		return sortSolution(nums, k);
	}

	int[] priorityQueueSolution(int[] nums, int k) {
		var priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2)
					return -1;
				else if (o1 < o2)
					return 1;
				return 0;
			}

		});
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
