package com.zhengfc.review.leet.binary.search;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
	public int findNumber(int[] nums, int input) {
		return bsFind(nums, input);
	}

	int bsFind(int[] nums, int input) {
		if (nums.length == 1 && nums[0] != input)
			return -1;
		int mid = nums.length / 2;
		if (nums[mid] < input) {
			int y = findNumber(Arrays.copyOfRange(nums, mid + 1, nums.length), input);
			return y == -1 ? -1 : mid + 1 + y;
		} else if (nums[mid] > input) {
			return findNumber(Arrays.copyOfRange(nums, 0, mid), input);
		} else {
			return mid;
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		log.info("index: {}", bs.findNumber(nums, 3));
	}
}
