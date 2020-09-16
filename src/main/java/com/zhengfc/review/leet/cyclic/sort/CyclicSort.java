package com.zhengfc.review.leet.cyclic.sort;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CyclicSort {
	public int[] sort(int[] arr) {
		var indexSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			cyclic(arr, i, indexSet);
		}
		return arr;
	}

	int[] cyclic(int[] arr, int index, Set<Integer> indexSet) {
		int position = position(arr, arr[index]);
		if (indexSet.contains(position))
			return arr;
		indexSet.add(position);
		log.info("cur {}, position {}, arr: {}", arr[index], position, arr);
		int next = arr[position];
		arr[position] = arr[index];
		arr[index] = next;
		return cyclic(arr, index, indexSet);
	}

	int position(int[] arr, int x) {
		int position = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < x)
				position++;
		return position;
	}
}
