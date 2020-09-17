package com.zhengfc.review.leet.topk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthSmallestNumberTest {
	KthSmallestNumber kthNumber = new KthSmallestNumber();

	@Test
	public void testKthSmallest() {
		int[] nums = { 7, 10, 4, 3, 20, 15 };
		int k1 = 3;
		int k2 = 4;

		int exp1 = 7;
		int exp2 = 10;
		assertEquals(exp1, kthNumber.kthSmallest(nums, k1));
		assertEquals(exp2, kthNumber.kthSmallest(nums, k2));
	}
}
