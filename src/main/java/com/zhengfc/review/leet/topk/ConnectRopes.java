package com.zhengfc.review.leet.topk;

import java.util.PriorityQueue;

public class ConnectRopes {
	public int connect(int[] ropes) {
		return priorityQueueSolution(ropes);
	}

	int priorityQueueSolution(int[] ropes) {
		int length = ropes.length;
		var ropePR = new PriorityQueue<Integer>(length);
		for (int e : ropes)
			ropePR.add(e);
		int first = ropePR.peek();
		int x = 0;
		for (int i = 0; i < length; i++) {
			x += ropePR.poll() * (length - i);
		}
		return x - first;
	}
}
