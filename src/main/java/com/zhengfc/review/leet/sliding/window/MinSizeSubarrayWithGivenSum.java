package com.zhengfc.review.leet.sliding.window;

public class MinSizeSubarrayWithGivenSum {
    public int minSize(int[] arr, int sum) {
        // return solution1(arr, sum);
        return solution2(arr, sum);
    }

    private int solution2(int[] arr, int sum) {
        int length = arr.length;
        int left = 0;

        int minSize = Integer.MAX_VALUE;
        int s = 0;
        for (int i = 0; i < length; i++) {
            s += arr[i];
            while (s >= sum) {
                minSize = Math.min(minSize, i + 1 - left);
                s -= arr[left++];
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    int solution1(int[] arr, int sum) {
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