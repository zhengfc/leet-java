package com.zhengfc.review.leet.two.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximizeCapitalTest {
	@Test
	public void testIpo() {
		int k = 2;
		int w = 0;
		int[] profits = { 1, 2, 3 };
		int[] capital = { 0, 1, 1 };
		MaximizeCapital mc = new MaximizeCapital();
		assertEquals(4, mc.ipo(k, w, profits, capital));
		
		int k2 = 1;
		int w2 = 0;
		int[] p2 = {1,2,3};
		int[] c2 = {1,1,2};
		MaximizeCapital mc2 = new MaximizeCapital();
		assertEquals(0, mc2.ipo(k2, w2, p2, c2));
	}
}
