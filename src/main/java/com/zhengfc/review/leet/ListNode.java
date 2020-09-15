package com.zhengfc.review.leet;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ListNode {
	public ListNode(int val) {
		this.val = val;
	}

	private int val;
	private ListNode next;

	public static boolean equals(ListNode n1, ListNode n2) {
		if (n1 == null && n2 == null)
			return true;
		else if (n1 != null && n2 == null)
			return false;
		else if (n1 == null && n2 != null)
			return false;
		else if (n1.getVal() == n2.getVal())
			return equals(n1.getNext(), n2.getNext());
		else
			return false;
	}
}
