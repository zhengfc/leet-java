package com.zhengfc.review.leet.tree.traversal.subsets;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubsetsIITest {
	SubsetsII s = new SubsetsII();

	@Test
	public void testSubsets() {
		int[] nums = { 1, 2, 2 };
		int[][] expArr = { { 1 }, { 1, 2, 2 }, {}, { 2 }, { 2, 2 }, { 1, 2 } };
		var exp = new HashSet<List<Integer>>();
		for (int[] subset : expArr) {
			List<Integer> one = new ArrayList<>();
			for (Integer e : subset)
				one.add(e);
			exp.add(one);
		}
		log.info("subsets: {}", s.bitSolution(nums));
		assertEquals(exp, s.bitSolution(nums));
	}
}
