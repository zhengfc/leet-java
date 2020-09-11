package com.fowler.refactor.composing.methods;

/**
 * Extract Method Example
 * 你有一段代码可以被组织在一起并独立出来.
 * 将这段代码放进一个独立函数中, 并让函数名称解释该函数的用途.
 */
public class ExtractMethod {
	private static final String _name = "";

	void printOwing(double amount) {
		printBanner();

		// print details
		System.out.println("name:" + _name);
		System.out.println("amount:" + amount);
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	void printOwing2(double amount) {
		printBanner();
		printDetails(amount);
	}

	void printDetails(double amount) {
		System.out.println("name:" + _name);
		System.out.println("amount:" + amount);
	}

	void printBanner() {

	}
}
