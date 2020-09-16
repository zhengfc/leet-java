package com.zhengfc.review.leet;

public class Swap {
	public static void swapInt(int[] arr, int i, int j) {
		int swap = arr[j];
		arr[j] = arr[i];
		arr[i] = swap;
	}
}
