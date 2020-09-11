package com.zhengfc.review.leet.sliding.window;

public class MaxSumSubarrayOfSizeK {
	public int maxSubarray(int[] arr) {
		return solution1(arr);
	}

	int solution1(int[] arr) {
		int maxSum = 0;
		for (int subSize = 1; subSize <= arr.length; subSize++) {
			int subSum = maxSubSum(arr, subSize);
			if (subSum > maxSum)
				maxSum = subSum;
		}
		return maxSum;
	}

	private int maxSubSum(int[] arr, int subSize) {
		int maxOne = 0;
		for (int i = subSize; i < arr.length; i++) {
			int sum = subSum(arr, i - 1, subSize + i - 1);
			if (sum > maxOne) {
				maxOne = sum;
			}
		}
		return maxOne;
	}

	private int subSum(int[] arr, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
