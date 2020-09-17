package com.zhengfc.review.leet.cyclic.sort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {

	MissingNumber ms = new MissingNumber();

	@Test
	public void testMissingOne() {
		int[] arr1 = { 3, 0, 1 };
		int exp1 = 2;
		assertEquals(exp1, ms.missingOne(arr1));

		int[] arr2 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int exp2 = 8;
		assertEquals(exp2, ms.missingOne(arr2));
	}

	@Test
	public void testMissingAll() {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int[] exp = { 5, 6 };
		assertArrayEquals(exp, ms.missingAll(arr));
	}
}
