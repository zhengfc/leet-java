package com.zhengfc.review.leet.two.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianFinderTest {

	MedianFinder mf = new MedianFinder();

	@Test
	public void testMedianFind() {
		mf.add(2);
		assertEquals(2, mf.findMedian(), 0.01);
		mf.add(3);
		assertEquals(2.5, mf.findMedian(), 0.01);
		mf.add(4);
		assertEquals(3, mf.findMedian(), 0.01);
		mf.add(1);
		assertEquals(2.5, mf.findMedian(), 0.01);
		mf.add(5);
		assertEquals(3, mf.findMedian(), 0.01);
	}

}
