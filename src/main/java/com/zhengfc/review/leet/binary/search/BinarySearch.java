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

	int findBitonicMax(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int mid = nums.length / 2;
		if (mid == 1 && nums.length == 2)
			return Math.max(nums[0], nums[1]);
		else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1])
			return findBitonicMax(Arrays.copyOfRange(nums, mid, nums.length));
		else if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1])
			return findBitonicMax(Arrays.copyOfRange(nums, 0, mid));
		return nums[mid];

	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		log.info("index: {}", bs.search(nums, 13));
	}
}
