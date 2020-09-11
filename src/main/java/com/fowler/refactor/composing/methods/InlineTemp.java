package com.fowler.refactor.composing.methods;

/**
 * Inline Temp Example
 * 你有一个临时变量, 只被一个简单表达式赋值一次, 而它妨碍了其他重构手法.
 * 将所有对该变量的引用动作, 替换为对它赋值的那个表达式自身
 */
public class InlineTemp {
	// double basePrice = anOrder.basePrice();
	// return (basePrice > 1000);

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	// return (anOrder.bacePrice() > 1000);
}
