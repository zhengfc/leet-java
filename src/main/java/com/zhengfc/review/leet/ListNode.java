package com.zhengfc.review.leet;

import lombok.Data;

@Data
public class ListNode {
	public ListNode(int val) {
		this.val = val;
	}
	private int val;
	private ListNode next;
}
