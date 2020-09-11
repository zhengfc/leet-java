package com.fowler.refactor.composing.methods;

/**
 * 有一个大型函数, 其中对局部变量的使用使你无法采用Extract Method这种重构手法.
 * 将这个函数放进一个单独对象中, 这样, 局部变量就成了对象的字段, 然后就可以在同一个对象中将这个大型函数分解为多个小型函数.
 */
public class ReplaceMethodWithMethodObject {
	class Order {
		@SuppressWarnings("unused")
		double price() {
			double basePrice;
			double secondaryPrice;
			double thirdaryPrice;
			// compute()
			return 0;
		}
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	class Order2 {
		double price() {
			return new PriceCalculator(this).compute();
		}
	}

	class PriceCalculator {
		PriceCalculator(Order2 order) {
		}

		double basePrice;
		double secondaryPrice;
		double thirdaryPrice;

		double compute() {
			// ...
			return 0;
		}
	}
}
