package com.zhengfc.review.leet;

import java.util.Comparator;

public class Utils {
	public static void swapInt(int[] arr, int i, int j) {
		int swap = arr[j];
		arr[j] = arr[i];
		arr[i] = swap;
	}
	
	public static final Comparator<Integer> COMPARATOR = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 > o2)
				return -1;
			else if (o1 < o2)
				return 1;
			return 0;
		}
	};
}
