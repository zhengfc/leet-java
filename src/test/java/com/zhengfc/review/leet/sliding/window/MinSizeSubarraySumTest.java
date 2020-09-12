package com.zhengfc.review.leet.sliding.window;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinSizeSubarraySumTest {
    MinSizeSubarrayWithGivenSum minSizeSubarray = new MinSizeSubarrayWithGivenSum();

    @Test
    public void testMinSizeSubarray() {
        int[] arr = {2,3,1,2,4,3};
        int sum = 7;
        assertEquals(2, minSizeSubarray.minSize(arr, sum));
    }
}
