package com.zhengfc.review.leet.merge.intervals;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeIntervalsTest {
	MergeIntervals mi = new MergeIntervals();

	@Test
	public void testMerge() {
		int[][] arr1 = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] exp1 = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] act1 = mi.merge(arr1);
		log.info("act1: {}", Arrays.deepToString(act1));
		assertTrue(Arrays.deepEquals(exp1, act1));

		int[][] arr2 = { { 1, 4 }, { 4, 5 } };
		int[][] exp2 = { { 1, 5 } };
		int[][] act2 = mi.merge(arr2);
		log.info("act2: {}", Arrays.deepToString(act2));
		assertTrue(Arrays.deepEquals(exp2, act2));
	}
}
