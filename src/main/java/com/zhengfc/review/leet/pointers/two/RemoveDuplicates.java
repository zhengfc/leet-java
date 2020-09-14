package com.zhengfc.review.leet.pointers.two;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public Integer[] removeExists(Integer[] arr) {
		return forceSolution(arr);
//		return listSolution(arr);
	}

	Integer[] listSolution(Integer[] arr) {
		var retList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			if (!retList.contains(arr[i]))
				retList.add(arr[i]);
		return retList.stream().toArray(Integer[]::new);
	}

	Integer[] forceSolution(Integer[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return Arrays.copyOfRange(arr, 0, i + 1);
	}
}
