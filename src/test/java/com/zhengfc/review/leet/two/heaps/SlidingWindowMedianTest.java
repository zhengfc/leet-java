package com.zhengfc.review.leet.two.heaps;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SlidingWindowMedianTest {
	SlidingWindowMedian swm = new SlidingWindowMedian();

	@Test
	public void testSlidingMedian() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		double[] exp = { 1, -1, -1, 3, 5, 6 };
		assertTrue(Arrays.equals(exp, swm.slidingMedian(nums, k)));
	}
}
