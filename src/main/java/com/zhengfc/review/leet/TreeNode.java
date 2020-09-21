package com.zhengfc.review.leet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TreeNode {
	public TreeNode(int val) {
		this.val = val;
	}
	
	private Integer val;
	private TreeNode left;
	private TreeNode right;
}
