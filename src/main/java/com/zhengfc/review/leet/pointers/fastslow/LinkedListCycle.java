package com.zhengfc.review.leet.pointers.fastslow;

import java.util.HashSet;

import com.zhengfc.review.leet.ListNode;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
//		return fastSlowSolution(node);
		return setSolution(head);
	}

	boolean fastSlowSolution(ListNode head) {
		if (head == null || head.getNext() == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.getNext();
		while (slow.getVal() != fast.getVal()) {
			if (fast == null || fast.getNext() == null)
				return false;
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return true;
	}

	boolean setSolution(ListNode head) {
		var vals = new HashSet<>();
		while (head.getNext() != null) {
			if (vals.contains(head.getVal())) {
				return true;
			} else {
				vals.add(head.getVal());
				head = head.getNext();
			}
		}
		return false;
	}
}
