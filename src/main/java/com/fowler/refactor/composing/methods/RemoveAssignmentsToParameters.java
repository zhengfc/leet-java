package com.fowler.refactor.composing.methods;

/**
 * 代码对一个参数进行赋值.
 * 以一个临时变量取代该参数的位置.
 */
public class RemoveAssignmentsToParameters {
	int discount(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50) inputVal -= 10;
		return inputVal;
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	int discount2(final int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		if (result > 50) result -= 10;
		return result;
	}
}
