/**
 * Provides composing methods demo
 * 
 * 几乎所有时候问题都源于过长函数(Long Methods), 对于过长函数一项重要的重构手法就是Extract Method.
 * Extract Method最大的困难就是处理局部变量, 此时可以运用Replace Temp with Query去掉所有可去掉的临时变量;
 * 如果很多地方使用了某个临时变量, 运用Split Temporary Variable将它变得容易替换;
 * 有时候临时变量是在太混乱, 难以替换, 这时候就需要使用Replace Method with Method Object.
 * 参数带来问题比临时变量稍微少一些, 前提是不在函数内赋值给它们, 如果你已经这么做了, 就使用Remove Assignments to Parameters.
 * 运用Substitute Algorithm引入更清晰的算法.
 */
package com.fowler.refactor.composing.methods;