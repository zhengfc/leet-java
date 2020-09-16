package com.zhengfc.review;

public class Swap {
	public static void swapInt(int[] arr, int i, int j) {
		int swap = arr[j];
		arr[j] = arr[i];
		arr[i] = swap;
	}
}
