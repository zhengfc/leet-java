package com.zhengfc.review.leet.sliding.window;

public class MaxSumSubarrayOfSizeK {
	public int maxSubarray(int[] arr) {
		return solution1(arr);
	}

	int solution1(int[] arr) {
		int maxSum = maxSubSum(arr, 1);
		for (int subSize = 2; subSize <= arr.length; subSize++) {
			int subSum = maxSubSum(arr, subSize);
			if (subSum > maxSum)
				maxSum = subSum;
		}
		return maxSum;
	}

	/**
	 * 长度为subSize数组的最大和
	 * 
	 * @param arr
	 * @param subSize
	 * @return
	 */
	private int maxSubSum(int[] arr, int subSize) {
		int maxOne = subSum(arr, 0, subSize);
		for (int i = 1; i < arr.length - subSize + 1; i++) {
			int sum = subSum(arr, i, subSize + i);
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
