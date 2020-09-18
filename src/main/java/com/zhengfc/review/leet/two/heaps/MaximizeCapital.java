package com.zhengfc.review.leet.two.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MaximizeCapital {
	PriorityQueue<Project> small = new PriorityQueue<>(new Comparator<Project>() {
		@Override
		public int compare(Project o1, Project o2) {
			return Integer.compare(o1.getCapital(), o2.getCapital());
		}
	});
	PriorityQueue<Project> large = new PriorityQueue<>(new Comparator<Project>() {
		@Override
		public int compare(Project o1, Project o2) {
			return Integer.compare(o2.getProfit(), o1.getProfit());
		}
	});

	public int ipo(int k, int w, int[] profits, int[] capital) {
		for (int i = 0; i < profits.length; i++) {
			if (capital[i] <= w)
				large.add(new Project(i, profits[i], capital[i]));
			else
				small.add(new Project(i, profits[i], capital[i]));
		}
		for (int i = 0; i < k; i++) {
			if (large.peek() == null)
				return w;
			w += large.poll().getProfit();
			reassignHeap(w);
		}
		return w;
	}

	private void reassignHeap(int w) {
		int length = small.size();
		for (int i = 0; i < length; i++) {
			if (small.peek().getCapital() <= w) {
				large.add(small.poll());
			} else {
				return;
			}
		}
	}

	@Data
	@AllArgsConstructor
	class Project {
		private int id;
		private int profit;
		private int capital;
	}
}
