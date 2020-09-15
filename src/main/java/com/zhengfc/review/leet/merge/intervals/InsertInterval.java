package com.zhengfc.review.leet.merge.intervals;

import java.util.ArrayList;

public class InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		var resArr = new ArrayList<int[]>();
		for (int[] interval : intervals) {
			if (interval[1] < newInterval[0]) { // interval的end小于newInterval的start
				resArr.add(interval);
			} else if (interval[0] > newInterval[1]) { // interval的start大于newInterval的end
				resArr.add(newInterval);
				newInterval = interval;
			} else { // 当前的interval与newInterval有重叠
				int min = Math.min(interval[0], newInterval[0]);
				int max = Math.max(interval[1], newInterval[1]);
				newInterval = new int[] { min, max };
			}
		}
		resArr.add(newInterval);
		return resArr.toArray(new int[resArr.size()][]);
	}
}
