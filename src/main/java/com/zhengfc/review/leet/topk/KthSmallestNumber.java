package com.zhengfc.review.leet.topk;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestNumber {
	public int kthSmallest(int[] nums, int k) {
//		return priorityQueueSolution(nums, k);
		return sortSolution(nums, k);
	}

	int priorityQueueSolution(int[] nums, int k) {
		var pq = new PriorityQueue<Integer>(k);
		for (int e : nums)
			pq.add(e);
		return pq.toArray(Integer[]::new)[k - 1];
	}

	int sortSolution(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[k - 1];
	}
}
