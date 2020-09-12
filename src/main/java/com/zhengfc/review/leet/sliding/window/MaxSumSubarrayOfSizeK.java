package com.zhengfc.review.leet.sliding.window;

public class MaxSumSubarrayOfSizeK {
	public int maxSubarray(int[] arr) {
		//return solution1(arr);
		return solution2(arr);
	}

	int solution2(int[] arr) {
		int length = arr.length;
		int[] curMax = new int[length];
		int max = arr[0];
		for (int i = 1; i < length; i++) {
			curMax[i] = Math.max(curMax[i - 1] + arr[i], arr[i]);
			max = Math.max(max, curMax[i]);
		}
		return max;
	}

	int solution1(int[] arr) {
		int maxSum = maxSubSum(arr, 1);
		for (int sizeK = 2; sizeK <= arr.length; sizeK++) {
			int subSum = maxSubSum(arr, sizeK);
			if (subSum > maxSum)
				maxSum = subSum;
		}
		return maxSum;
	}

	/**
	 * 长度为sizeK数组的最大和
	 * 
	 * @param arr
	 * @param sizeK
	 * @return
	 */
	private int maxSubSum(int[] arr, int sizeK) {
		int maxOne = subSum(arr, 0, sizeK);
		for (int i = 1; i < arr.length - sizeK + 1; i++) {
			int sum = subSum(arr, i, sizeK + i);
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
