package com.zhengfc.review.leet.pointers.fastslow;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhengfc.review.leet.ListNode;

public class MiddleLinkedListTest {

	MiddleLinkedList mll = new MiddleLinkedList();

	@Test
	public void testMiddle() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.setNext(n2.setNext(n3.setNext(n4.setNext(n5))));

		ListNode e3 = new ListNode(3);
		ListNode e4 = new ListNode(4);
		ListNode e5 = new ListNode(5);
		e3.setNext(e4.setNext(e5));
		assertTrue(ListNode.equals(e3, mll.middle(n1)));

		ListNode n6 = new ListNode(6);
		n5.setNext(n6);
		ListNode e6 = new ListNode(6);
		e5.setNext(e6);
		
		assertTrue(ListNode.equals(e4, mll.middle(n1)));
	}
}
