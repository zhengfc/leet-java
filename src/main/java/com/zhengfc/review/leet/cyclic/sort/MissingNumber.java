package com.zhengfc.review.leet.cyclic.sort;

import java.util.HashSet;

public class MissingNumber {
	public int missingOne(int[] arr) {
//		return setSolution(arr);
		return sumSolution(arr);
	}

	int sumSolution(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return n * (n + 1) / 2 - sum;
	}

	int setSolution(int[] arr) {
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
