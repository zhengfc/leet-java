package com.zhengfc.review.leet.pointers.two;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumTest {
	TwoSum twoSum = new TwoSum();

	@Test
	public void testTargetSum() {
		int[] arr = new int[] { 2, 7, 11, 15 };
		int target = 9;
		assertTrue(Arrays.equals(new int[] { 2, 7 }, twoSum.forceSolution(arr, target)));
	}
}
