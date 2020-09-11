package com.fowler.refactor.composing.methods;

/**
 * Introduce Explaining Variable Example
 * 有一个复杂表达式.
 * 将该复杂表达式(或其中一部分)的结果放进一个临时变量, 以此变量名称来解释表达式用途.
 */
public class IntroduceExplainingVariable {
	//	if((platform.toUpperCase().indexOf("MAC") > -1)　&&  
	//	    (browser.toUpperCase().indexOf("IE") > -1) &&  
	//	    wasInitialized() && resize > 0)  
	//	{  
	//	    //do something  
	//	} 

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------
	
	//	final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;  
	//	final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;  
	//	final boolean wasResize = resize > 0;  
	//	  
	//	if(isMacOs &&　isIEBrowser　&& wasInitialized() && wasResize){  
	//	    //do something  
	//	}
}
