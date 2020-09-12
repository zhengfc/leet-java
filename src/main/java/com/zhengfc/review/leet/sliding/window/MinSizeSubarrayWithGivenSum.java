package com.zhengfc.review.leet.sliding.window;

public class MinSizeSubarrayWithGivenSum {
    public int minSize(int[] arr, int sum) {
        return solution1(arr, sum);
    }

    private int solution1(int[] arr, int sum) {
        for (int minSize = 1; minSize < arr.length + 1; minSize++) {
            for (int i = 0; i < arr.length - minSize + 1; i++) {
                int sumOne = sum(arr, i, i + minSize);
                if (sum == sumOne) {
                    return minSize;
                }
            }
        }
        return 0;
    }

    private int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}