package com.zhengfc.review.leet.topk;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ClosestKPoints {
	public int[][] closestK(int[][] points, int k) {
		return priorityQueueSolution(points, k);
	}

	int[][] priorityQueueSolution(int[][] points, int k) {
		var pq = new PriorityQueue<int[]>(points.length, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				long oo1 = (o1[0] * o1[0]) + (o1[1] * o1[1]);
				long oo2 = (o2[0] * o2[0]) + (o2[1] * o2[1]);
				if (oo1 > oo2)
					return 1;
				else if (oo1 < oo2)
					return -1;
				return 0;
			}
		});
		for (int[] e : points)
			pq.add(e);
		int[][] retPoints = new int[k][];
		for (int i = 0; i < k; i++)
			retPoints[i] = pq.poll();
		return retPoints;
	}
}
