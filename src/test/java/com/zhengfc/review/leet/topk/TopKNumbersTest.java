package com.zhengfc.review.leet.topk;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TopKNumbersTest {
	TopKNumbers topKNumbers = new TopKNumbers();

	@Test
	public void testTokK() {
		int[] nums = { 3, 10, 1000, -99, 4, 100 };
		int k = 3;
		int[] exps = { 1000, 100, 10 };

		assertArrayEquals(exps, topKNumbers.topK(nums, k));
	}
}
