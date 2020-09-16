package com.zhengfc.review.leet.cyclic.sort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CyclicSortTest {

	CyclicSort cs = new CyclicSort();

	@Test
	public void testSort() {
		int[] arr1 = {3, 2, 1, 4, 6, 5 };
		int[] exp1 = { 1, 2, 3, 4, 5, 6 };
		assertTrue(Arrays.equals(exp1, cs.sort(arr1)));
		
		int[] arr2 = { 1, 9, 2, 4, 2, 10, 45, 3, 2 };
		int[] exp2 = { 1, 2, 2, 2, 3, 4, 9, 10, 45 };
		assertTrue(Arrays.equals(exp2, cs.sort(arr2)));
	}
}
