package com.zhengfc.review.leet.sliding.window;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSumSubarrayOfSizeKTest {

	@Test
	public void maxSubarray() {
		int[] arr1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		assertEquals(6, MaxSumSubarrayOfSizeK.maxSubarray(arr1));

		int[] arr2 = { 1 };
		int[] arr3 = { 0 };
		int[] arr4 = { -1 };
		int[] arr5 = { -2147483647 };
		assertEquals(1, MaxSumSubarrayOfSizeK.maxSubarray(arr2));
		assertEquals(0, MaxSumSubarrayOfSizeK.maxSubarray(arr3));
		assertEquals(-1, MaxSumSubarrayOfSizeK.maxSubarray(arr4));
		assertEquals(-2147483647, MaxSumSubarrayOfSizeK.maxSubarray(arr5));
	}
}
