package com.zhengfc.review.leet.reverse.linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhengfc.review.leet.ListNode;

public class ReverseLinkedListTest {

	ReverseLinkedList rll = new ReverseLinkedList();
	
	@Test
	public void testReverse() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.setNext(n2.setNext(n3.setNext(n4.setNext(n5))));
		
		ListNode e1 = new ListNode(5);
		ListNode e2 = new ListNode(4);
		ListNode e3 = new ListNode(3);
		ListNode e4 = new ListNode(2);
		ListNode e5 = new ListNode(1);
		e1.setNext(e2.setNext(e3.setNext(e4.setNext(e5))));
		assertTrue(ListNode.equals(e1, rll.reverse(n1)));
	}
}
