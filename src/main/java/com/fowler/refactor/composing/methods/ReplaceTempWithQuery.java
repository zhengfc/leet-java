package com.fowler.refactor.composing.methods;

/**
 * Replace Temp with Query Example
 * 程序以一个临时变量保存某一表达式的运算结果.
 * 将这个表达式提炼到一个独立函数中. 将这个临时变量的所有引用点替换为对新函数的调用.
 * 此后, 新函数就可被其它函数使用.
 */
public class ReplaceTempWithQuery {

	private double _quantity;
	private double _itemPrice;

	double disCountPrice() {
		double basePrice = _quantity * _itemPrice;
		if (basePrice > 1000)
			return basePrice * 0.95;
		else
			return basePrice * 0.98;
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	double disCountPrice2() {
		if (basePrice() > 1000)
			return basePrice() * 0.95;
		else
			return basePrice() * 0.98;
	}

	double basePrice() {
		return _quantity * _itemPrice;
	}
}
