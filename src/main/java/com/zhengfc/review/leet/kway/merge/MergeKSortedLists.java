package com.zhengfc.review.leet.kway.merge;

import java.util.Arrays;

import com.zhengfc.review.leet.ListNode;

public class MergeKSortedLists {
	ListNode mergeK(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		else if (lists.length == 1)
			return lists[0];
		ListNode left = mergeK(Arrays.copyOfRange(lists, 0, lists.length / 2));
		ListNode right = mergeK(Arrays.copyOfRange(lists, lists.length / 2, lists.length));
		return merge(left, right);
	}

	ListNode merge(ListNode node1, ListNode node2) {
		if (node1 == null && node2 == null)
			return null;
		else if (node1 == null)
			return node2;
		else if (node2 == null)
			return node1;
		else if (node1.getVal() <= node2.getVal()) {
			ListNode node = new ListNode(node1.getVal());
			node.setNext(merge(node1.getNext(), node2));
			return node;
		} else {
			ListNode node = new ListNode(node2.getVal());
			node.setNext(merge(node2.getNext(), node1));
			return node;
		}
	}

}
