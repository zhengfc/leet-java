package com.zhengfc.review.leet.topk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConnectRopesTest {
	ConnectRopes cr = new ConnectRopes();

	@Test
	public void testConnect() {
		int[] rope1 = { 8, 4, 6, 12 };
		int[] rope2 = { 20, 4, 8, 2 };
		int[] rope3 = { 1, 2, 5, 10, 35, 89 };
		int[] rope4 = { 2, 2, 3, 3 };

		int exp1 = 58;
		int exp2 = 54;
		int exp3 = 224;
		int exp4 = 21;
		assertEquals(exp1, cr.connect(rope1));
		assertEquals(exp2, cr.connect(rope2));
		assertEquals(exp3, cr.connect(rope3));
		assertEquals(exp4, cr.connect(rope4));
	}
}
