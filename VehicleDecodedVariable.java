package com.altimetrik.workshop.vehicleservice.model;

public class VehicleDecodedVariable {
//	
//	<VariableId>143</VariableId>
//	<Variable>Error Code</Variable>
//	<ValueId>0</ValueId>
//	<Value>0</Value>

	private String variableId;
	private String variable;
	private String valueId;
	private String value;

	public VehicleDecodedVariable() {

	}

	public VehicleDecodedVariable(String variableId, String variable, String valueId, String value) {
		this.variableId = variableId;
		this.variable = variable;
		this.valueId = valueId;
		this.value = value;

	}

	public String getVariableId() {
		return variableId;
	}

	public void setVariableId(String variableId) {
		this.variableId = variableId;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getValueId() {
		return valueId;
	}

	public void setValueId(String valueId) {
		this.valueId = valueId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
