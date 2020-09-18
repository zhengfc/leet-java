package com.zhengfc.review.leet.two.heaps;

import java.util.PriorityQueue;

import com.zhengfc.review.leet.Utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SlidingWindowMedian {
	PriorityQueue<Integer> small = new PriorityQueue<>();
	PriorityQueue<Integer> large = new PriorityQueue<>(Utils.COMPARATOR);

	public double[] slidingMedian(int[] nums, int k) {
		if (k > nums.length)
			throw new IllegalArgumentException("window size greater than nums length");
		double[] retNums = new double[nums.length - k + 1];
		for (int i = 0; i < k; i++)
			add(nums[i]);
		for (int i = k; i < nums.length; i++) {
			retNums[i - k] = findMedian();
			remove(nums[i - k]);
			add(nums[i]);
		}
		retNums[nums.length - k] = findMedian();
		log.info("ret nums: {}", retNums);
		return retNums;
	}

	private void add(int num) {
		if (large.peek() != null && num > large.peek())
			small.add(num);
		else
			large.add(num);

		rebalance();
	}

	private void rebalance() {
		if (small.size() > large.size())
			large.add(small.poll());
		else if (small.size() + 1 < large.size())
			small.add(large.poll());
	}

	private void remove(int num) {
		if (num > findMedian())
			small.remove(num);
		else
			large.remove(num);
		rebalance();
	}

	private double findMedian() {
		if (small.size() == large.size())
			return (small.peek() + large.peek()) / 2.0;
		return large.peek();
	}
}
