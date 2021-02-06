package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * */
public class AggregateFunction {
private String function,field;

	public AggregateFunction(String function, String field) {
	super();
	this.function = function;
	this.field = field;
}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}