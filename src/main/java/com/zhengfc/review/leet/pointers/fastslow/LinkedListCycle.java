package com.zhengfc.review.leet.pointers.fastslow;

import java.util.HashSet;

import com.zhengfc.review.leet.ListNode;

public class LinkedListCycle {
	public boolean hasCycle(ListNode node) {
//		return fastSlowSolution(node);
		return setSolution(node);
	}

	boolean fastSlowSolution(ListNode node) {
		if (node == null || node.getNext() == null) {
			return false;
		}
		ListNode slow = node;
		ListNode fast = node.getNext();
		while (slow.getVal() != fast.getVal()) {
			if (fast == null || fast.getNext() == null)
				return false;
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return true;
	}

	boolean setSolution(ListNode node) {
		var vals = new HashSet<>();
		while (node.getNext() != null) {
			if (vals.contains(node.getVal())) {
				return true;
			} else {
				vals.add(node.getVal());
			}
		}
		return false;
	}
}
