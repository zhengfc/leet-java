package com.zhengfc.review.leet.two.heaps;

import java.util.PriorityQueue;

import com.zhengfc.review.leet.Utils;

public class MedianFinder {
	PriorityQueue<Integer> small = new PriorityQueue<>();
	PriorityQueue<Integer> large = new PriorityQueue<>(Utils.COMPARATOR);

	public void add(int num) {
		if (large.peek() != null && num > large.peek())
			small.add(num);
		else
			large.add(num);

		reblance();
	}

	private void reblance() {
		if (small.size() > large.size())
			large.add(small.poll());
		else if (small.size() + 1 < large.size())
			small.add(large.poll());
	}

	public double findMedian() {
		if (small.size() == large.size())
			return (small.peek() + large.peek()) / 2.0;
		return large.peek();
	}
}
