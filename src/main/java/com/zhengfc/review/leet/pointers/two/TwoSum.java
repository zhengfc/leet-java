package com.zhengfc.review.leet.pointers.two;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TwoSum {
	public int[] targetSum(int[] arr, int target) {
		return forceSolution(arr, target);
	}

	int[] forceSolution(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == target - arr[i]) {
					log.info("target: i: {}, j: {}", i, j);
					return new int[] { arr[i], arr[j] };
				}
			}
		}
		return null;
	}
}
