package com.example.model;

public class OperationModel {
	 private String operation;
	 private int value1;
	 private int value2;
	 private int value3;
	 
	public OperationModel() {}
	 
	public OperationModel(String operation, int value1, int value2, int value3) {
		super();
		this.operation = operation;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public int getValue3() {
		return value3;
	}
	public void setValue3(int value3) {
		this.value3 = value3;
	}

}
