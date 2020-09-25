package com.zhengfc.review.leet.binary.search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
	BinarySearch bs = new BinarySearch();

	@Test
	public void testFindNumber() {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		assertEquals(4, bs.search(nums, 9));
		assertEquals(-1, bs.search(nums, 2));
	}
}
