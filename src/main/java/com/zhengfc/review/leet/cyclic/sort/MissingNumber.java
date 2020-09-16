package com.zhengfc.review.leet.cyclic.sort;

import java.util.Arrays;
import java.util.HashSet;

import com.zhengfc.review.leet.Swap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MissingNumber {
	public int missingOne(int[] arr) {
//		return setSolution(arr);
//		return sumSolution(arr);
		return cyclicSolution(arr);
	}

	int cyclicSolution(int[] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			int j = arr[i];
			if (j < n && i != j) {
				Swap.swapInt(arr, i, j);
			} else {
				i++;
			}
		}
		log.info("cyclic sortArr: {}", Arrays.toString(arr));
		for (int x = 0; x < n; x++) {
			if (arr[x] != x)
				return x;
		}
		return n;
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
