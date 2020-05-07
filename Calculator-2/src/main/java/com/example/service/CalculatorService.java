package com.example.service;

import com.example.model.OperationModel;

public interface CalculatorService {
public int add(OperationModel operationModel);
public int subtract(OperationModel operationModel);
public int multiply(OperationModel operationModel);
public int divide(OperationModel operationModel);
public double sqrt(OperationModel operationModel);
public int power(OperationModel operationModel);
public OperationModel clear(OperationModel operationModel);
}
