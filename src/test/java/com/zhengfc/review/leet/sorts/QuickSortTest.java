package com.zhengfc.review.leet.sorts;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
	QuickSort qs = new QuickSort();

	@Test
	public void testQsort() {
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, qs.sort(new int[] { 8, 1, 7, 2, 3, 6, 5, 4 }));
	}
}
