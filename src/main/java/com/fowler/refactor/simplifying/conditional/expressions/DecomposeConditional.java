package com.fowler.refactor.simplifying.conditional.expressions;

import java.util.Date;

/**
 * 你有一个复杂的条件(if-then-else)语句; 
 * 从if, then, else三个段落中分别提炼出独立函数
 */
public class DecomposeConditional {

	private Date date;
	private Date SUMMER_START, SUMMER_END;
	@SuppressWarnings("unused")
	private double charge, _winterServiceCharge;
	private double quantity, _winterRate, _summerRate;

	{
		if (date.before(SUMMER_START) || date.after(SUMMER_END))
			charge = quantity * _winterRate + _winterServiceCharge;
		else
			charge = quantity * _summerRate;
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------
	
	{
		if (notSummer())
			winterCharge(quantity);
		else
			summerCharge(quantity);
	}
	
	private boolean notSummer(){
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}
	
	private double winterCharge(double quantity) {
		return quantity * _winterRate + _winterServiceCharge;
	}
	
	private double summerCharge(double quantity) {
		return quantity * _summerRate;
	}
}
