package com.zhengfc.review.leet.pointers.fastslow;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhengfc.review.leet.ListNode;

public class LinkedListCycleTest {
	LinkedListCycle lls = new LinkedListCycle();

	@Test
	public void testHasCycle() {
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(-4);
		n1.setNext(n2).setNext(n3).setNext(n4).setNext(n2);

		ListNode m1 = new ListNode(1);
		ListNode m2 = new ListNode(2);
		m1.setNext(m2).setNext(m1);

		ListNode k1 = new ListNode(1);

		assertTrue(lls.hasCycle(n1));
		assertTrue(lls.hasCycle(m1));
		assertFalse(lls.hasCycle(k1));
	}
}
