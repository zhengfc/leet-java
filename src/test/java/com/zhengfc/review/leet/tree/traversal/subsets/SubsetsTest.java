package com.zhengfc.review.leet.tree.traversal.subsets;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubsetsTest {
	Subsets s = new Subsets();

	@Test
	public void testSubsets() {
		int[] nums = { 1, 2, 3 };
		int[][] expArr = { {}, { 1 }, { 2 }, { 1, 2 }, { 3 }, { 1, 3 }, { 2, 3 }, { 1, 2, 3 } };
		var exp = new ArrayList<List<Integer>>();
		for (int[] subset : expArr) {
			List<Integer> one = new ArrayList<>();
			for (Integer e : subset)
				one.add(e);
			exp.add(one);
		}
		log.info("subsets: {}", s.subsets(nums));
		assertEquals(exp, s.subsets(nums));
	}
}
