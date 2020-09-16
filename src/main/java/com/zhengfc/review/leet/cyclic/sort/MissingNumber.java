package com.zhengfc.review.leet.cyclic.sort;

import java.util.HashSet;

public class MissingNumber {
	public int missingOne(int[] arr) {
		var nset = new HashSet<Integer>();
		for (int i = 0; i <= arr.length; i++)
			nset.add(i);
		for (int i = 0; i < arr.length; i++)
			nset.remove(arr[i]);
		return nset.iterator().next();
	}

	public int[] missingAll(int[] arr) {
		var nset = new HashSet<Integer>();
		for (int i = 1; i <= arr.length; i++)
			nset.add(i);
		for (int i = 0; i < arr.length; i++)
			nset.remove(arr[i]);
		return nset.stream().mapToInt(x -> x).toArray();
	}
}
