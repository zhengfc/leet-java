package com.zhengfc.review.leet.merge.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
	public int[][] merge(int[][] arr) {
		return intervalMerge(arr);
	}

	int[][] intervalMerge(int[][] arr) {
		if (arr == null || arr.length == 1)
			return arr;
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		var result = new ArrayList<int[]>();
		int[] newInterval = arr[0];
		result.add(newInterval);
		for (int[] interval : arr) {
			if (newInterval[1] >= interval[0]) {
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			} else {
				newInterval = interval;
				result.add(newInterval);
			}
		}
		return result.toArray(new int[result.size()][]);
	}
}
