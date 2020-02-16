package com.altimetrik.workshop.vehicleservice.model;

public class VariableDetails {

//	<VariableId>143</VariableId>
//	<Variable>Error Code</Variable>
//	<ValueId>0</ValueId>
//	<Value>0</Value>

	private String variable;
	private String value;

	public VariableDetails() {

	}

	public VariableDetails(String variable, String value) {
		this.variable = variable;
		this.value = value;

	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
