package com.zhengfc.review.leet.binary.search;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		else if (nums.length == 1 && nums[0] != target)
			return -1;
		int mid = nums.length / 2;
		if (nums[mid] < target) {
			int y = search(Arrays.copyOfRange(nums, mid + 1, nums.length), target);
			return y == -1 ? -1 : mid + 1 + y;
		} else if (nums[mid] > target) {
			return search(Arrays.copyOfRange(nums, 0, mid), target);
		} else {
			return mid;
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		log.info("index: {}", bs.search(nums, 13));
	}
}
