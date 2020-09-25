package com.zhengfc.review.leet.kway.merge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zhengfc.review.leet.ListNode;

public class MergeKSortedListsTest {
	MergeKSortedLists mksl = new MergeKSortedLists();

	@Test
	public void testMergeK() {
		ListNode g1node1 = new ListNode(1);
		ListNode g1node2 = new ListNode(4);
		ListNode g1node3 = new ListNode(5);
		g1node1.setNext(g1node2.setNext(g1node3));

		ListNode g2node1 = new ListNode(1);
		ListNode g2node2 = new ListNode(3);
		ListNode g2node3 = new ListNode(4);
		g2node1.setNext(g2node2.setNext(g2node3));

		ListNode g3node1 = new ListNode(2);
		ListNode g3node2 = new ListNode(6);
		g3node1.setNext(g3node2);

		ListNode expnode1 = new ListNode(1);
		ListNode expnode2 = new ListNode(1);
		ListNode expnode3 = new ListNode(2);
		ListNode expnode4 = new ListNode(3);
		ListNode expnode5 = new ListNode(4);
		ListNode expnode6 = new ListNode(4);
		ListNode expnode7 = new ListNode(5);
		ListNode expnode8 = new ListNode(6);
		expnode1.setNext(expnode2.setNext(expnode3.setNext(expnode4.setNext(expnode5.setNext(expnode6.setNext(expnode7.setNext(expnode8)))))));

		assertEquals(expnode1, mksl.mergeK(new ListNode[] { g1node1, g2node1, g3node1 }));
		assertEquals(null, mksl.mergeK(new ListNode[] {}));
	}
}
