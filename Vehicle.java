package com.altimetrik.workshop.vehicleservice.model;

import java.util.LinkedList;

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
