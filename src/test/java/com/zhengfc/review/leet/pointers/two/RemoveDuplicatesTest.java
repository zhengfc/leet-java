package com.zhengfc.review.leet.pointers.two;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicatesTest {

	RemoveDuplicates removeDuplicates = new RemoveDuplicates();

	@Test
	public void testRemoveExists() {
		Integer[] arr1 = { 1, 1, 2 };
		Integer[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		assertTrue(Arrays.equals(new Integer[] { 1, 2 }, removeDuplicates.removeExists(arr1)));
		assertTrue(Arrays.equals(new Integer[] { 0, 1, 2, 3, 4 }, removeDuplicates.removeExists(arr2)));
	}
}
