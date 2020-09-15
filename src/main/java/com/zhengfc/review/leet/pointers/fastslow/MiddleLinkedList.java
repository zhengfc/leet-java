package com.zhengfc.review.leet.pointers.fastslow;

import java.util.ArrayList;

import com.zhengfc.review.leet.ListNode;

public class MiddleLinkedList {
	public ListNode middle(ListNode head) {
		return fastSlowSolution(head);
	}

	ListNode fastSlowSolution(ListNode head) {
		if (head == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;

	}

	ListNode forceSolution(ListNode head) {
		if (head == null)
			return head;
		var nodeLists = new ArrayList<ListNode>();
		while (head != null) {
			nodeLists.add(head);
			head = head.getNext();
		}
		return nodeLists.get(nodeLists.size() / 2);
	}
}
