package com.altimetrik.workshop.vehicleservice.model;

import java.util.LinkedList;

//
//<Count>142</Count>
//<Message>
//Results returned successfully. NOTE: Any missing decoded values should be interpreted as NHTSA does not have data on the specific variable. Missing value should NOT be interpreted as an indication that a feature or technology is unavailable for a vehicle.
//</Message>
//<SearchCriteria>VIN:2HKRM4H74FH695177</SearchCriteria>
//<Results>
//<DecodedVariable>
//<VariableId>142</VariableId>
//<Variable>Suggested VIN</Variable>
//<ValueId/>
//<Value/>
//</DecodedVariable>

public class Vehicle {
	private LinkedList<VehicleDecodedVariable> vehicleVariableList;
	private int count;
	private String message;

	public Vehicle() {

	}

	public Vehicle(LinkedList<VehicleDecodedVariable> vehicleVariableList, int count, String message) {
		this.vehicleVariableList = vehicleVariableList;
		this.count = count;
		this.message = message;
	}

	public LinkedList<VehicleDecodedVariable> getVehicleVariableList() {
		return vehicleVariableList;
	}

	public void setVehicleVariableList(LinkedList<VehicleDecodedVariable> vehicleVariableList) {
		this.vehicleVariableList = vehicleVariableList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
