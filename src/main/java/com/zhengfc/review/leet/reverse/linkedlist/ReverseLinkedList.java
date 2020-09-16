package com.zhengfc.review.leet.reverse.linkedlist;

import java.util.ArrayList;

import com.zhengfc.review.leet.ListNode;

public class ReverseLinkedList {
	public ListNode reverse(ListNode head) {
		return forceSolution(head);
	}

	ListNode forceSolution(ListNode head) {
		if (head == null || head.getNext() == null)
			return head;
		var nodeList = new ArrayList<ListNode>();
		while (head != null) {
			nodeList.add(new ListNode(head.getVal()));
			head = head.getNext();
		}
		for (int i = nodeList.size() - 1; i > 0; i--)
			nodeList.get(i).setNext(nodeList.get(i - 1));
		return nodeList.get(nodeList.size() - 1);
	}
}
