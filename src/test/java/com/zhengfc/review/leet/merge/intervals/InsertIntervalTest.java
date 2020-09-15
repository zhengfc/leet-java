package com.zhengfc.review.leet.merge.intervals;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class InsertIntervalTest {

	InsertInterval ii = new InsertInterval();

	@Test
	public void testInsert() {
		int[][] arr1 = { { 1, 3 }, { 6, 9 } };
		int[] insert1 = { 2, 5 };
		int[][] exp1 = { { 1, 5 }, { 6, 9 } };

		int[][] arr2 = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] insert2 = { 4, 8 };
		int[][] exp2 = { { 1, 2 }, { 3, 10 }, { 12, 16 } };

		int[][] arr3 = {};
		int[] insert3 = { 5, 7 };
		int[][] exp3 = { { 5, 7 } };

		int[][] arr4 = { { 1, 5 } };
		int[] insert4 = { 2, 3 };
		int[][] exp4 = { { 1, 5 } };

		int[][] arr5 = { { 1, 5 } };
		int[] insert5 = { 2, 7 };
		int[][] exp5 = { { 1, 7 } };

		assertTrue(Arrays.deepEquals(exp1, ii.insert(arr1, insert1)));
		assertTrue(Arrays.deepEquals(exp2, ii.insert(arr2, insert2)));
		assertTrue(Arrays.deepEquals(exp3, ii.insert(arr3, insert3)));
		assertTrue(Arrays.deepEquals(exp4, ii.insert(arr4, insert4)));
		assertTrue(Arrays.deepEquals(exp5, ii.insert(arr5, insert5)));
	}
}
