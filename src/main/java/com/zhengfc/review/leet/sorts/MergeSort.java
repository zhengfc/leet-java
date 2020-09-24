package com.zhengfc.review.leet.sorts;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSort {
	int[] msort(int[] nums) {
		if (nums.length < 2)
			return nums;
		int[] left = msort(Arrays.copyOfRange(nums, 0, nums.length / 2));
		int[] right = msort(Arrays.copyOfRange(nums, nums.length / 2, nums.length));
		return merge(left, right);
	}

//	void divide(int[] nums) {
//		log.info("divided nums: {}", nums);
//		if (nums.length < 2)
//			return;
//		divide(Arrays.copyOfRange(nums, 0, nums.length / 2));
//		divide(Arrays.copyOfRange(nums, nums.length / 2, nums.length));
//	}

	int[] merge(int[] sorted1, int[] sorted2) {
		log.info("sorted1: {}, sorted2: {}", sorted1, sorted2);
		int[] sorted = new int[sorted1.length + sorted2.length];
		int indexSorted1 = 0;
		int indexSorted2 = 0;
		for (int i = 0; i < sorted1.length + sorted2.length; i++) {
			if (indexSorted2 == sorted2.length) {
				System.arraycopy(sorted1, indexSorted1, sorted, i, sorted1.length - indexSorted1);
				return sorted;
			} else if (indexSorted1 == sorted1.length) {
				System.arraycopy(sorted2, indexSorted2, sorted, i, sorted2.length - indexSorted2);
				return sorted;
			} else if (sorted1[indexSorted1] <= sorted2[indexSorted2]) {
				sorted[i] = sorted1[indexSorted1];
				indexSorted1++;
			} else {
				sorted[i] = sorted2[indexSorted2];
				indexSorted2++;
			}
		}
		return sorted;
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
//		ms.divide(new int[] { 8, 1, 7, 2, 3, 6, 5, 4 });
		log.info("sorted nums: {}", ms.msort(new int[] { 8, 1, 7, 2, 3, 6, 5, 4 }));
	}
}
