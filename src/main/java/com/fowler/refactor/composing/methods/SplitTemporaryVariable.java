package com.fowler.refactor.composing.methods;

/**
 * 你的程序有某个临时变量被赋值超过一次, 它既不是循环变量，也不被用于收集计算结果.
 * 针对每次赋值, 创造一个独立的临时变量.
 */
public class SplitTemporaryVariable {
	private int _height;
	private int _width;
	
	{
		double temp = 2 * (_height + _width);
		System.out.println(temp);  
		temp = _height + _width;  
		System.out.println(temp);
	}
	
	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------
	
	{
		final double perimeter = 2 * (_height + _width);  
		System.out.println(perimeter);  
		final double area = _height + _width;  
		System.out.println(area);
	}
}
