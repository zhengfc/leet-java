package com.zhengfc.review.leet.topk;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ClosestKPointsTest {
	ClosestKPoints ckp = new ClosestKPoints();

	@Test
	public void closestK() {
		int[][] points1 = { { 1, 3 }, { -2, 2 } };
		int k1 = 1;
		int[][] exp1 = { { -2, 2 } };

		int[][] points2 = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int k2 = 2;
		int[][] exp2 = { { 3, 3 }, { -2, 4 } };
		assertArrayEquals(exp1, ckp.closestK(points1, k1));
		assertArrayEquals(exp2, ckp.closestK(points2, k2));
	}
}
