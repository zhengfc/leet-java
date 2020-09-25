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

	@Test
	public void testFindBitonicMax() {
		int[] nums1 = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };
		int[] nums2 = { 1, 3, 50, 10, 9, 7, 6 };
		int[] nums3 = { 10, 20, 30, 40, 50 };
		int[] nums4 = { 120, 100, 80, 20, 0 };
		assertEquals(500, bs.findBitonicMax(nums1));
		assertEquals(50, bs.findBitonicMax(nums2));
		assertEquals(50, bs.findBitonicMax(nums3));
		assertEquals(120, bs.findBitonicMax(nums4));
	}
}
