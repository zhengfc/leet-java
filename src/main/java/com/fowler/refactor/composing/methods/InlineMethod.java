package com.fowler.refactor.composing.methods;

/**
 * Inline Method Example
 * 一个函数的本体与名称同样清楚易懂.
 * 在函数调用点插入函数本体, 然后移除该函数.
 */
public class InlineMethod {
	private int _numberOfLateDeliveries;

	int getRating() {
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}

	boolean moreThanFiveLateDeliveries() {
		return _numberOfLateDeliveries > 5;
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	int getRating2() {
		return (_numberOfLateDeliveries > 5) ? 2 : 1;
	}
}
