package com.zhengfc.review.leet.reverse.linkedlist;

import java.util.ArrayList;

import com.zhengfc.review.leet.ListNode;

public class ReverseSubList {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		return forceSolution(head, m, n);
	}

	ListNode forceSolution(ListNode head, int m, int n) {
		if (head == null || head.getNext() == null)
			return head;
		var nodeList = new ArrayList<ListNode>();
		while (head != null) {
			nodeList.add(new ListNode(head.getVal()));
			head = head.getNext();
		}
		for (int i = n - 1; i > (n - m) / 2 + 1; i--) {
			ListNode swap = nodeList.get(i);
			nodeList.set(i, nodeList.get(n - 2 + m - i));
			nodeList.set(n - 2 + m - i, swap);
		}
		for (int i = 0; i < nodeList.size() - 1; i++)
			nodeList.get(i).setNext(nodeList.get(i + 1));
		return nodeList.get(0);
	}
}
