package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.OperationModel;
@Service
public class CalculatorServiceImpl implements CalculatorService {
	@Autowired
	OperationModel operation;

	@Override
	public int add(OperationModel operationModel) {
		
		return operation.getValue1()+operation.getValue2()+operation.getValue3();
	}

	@Override
	public int subtract(OperationModel operationModel) {
		// TODO Auto-generated method stub
		return operation.getValue1()-operation.getValue2()-operation.getValue3();
	}

	@Override
	public int multiply(OperationModel operationModel) {
		// TODO Auto-generated method stub
		return operation.getValue1()*operation.getValue2()*operation.getValue3();
	}

	@Override
	public int divide(OperationModel operationModel) {
		// TODO Auto-generated method stub
		if(operation.getValue2()==0||operation.getValue3()==0) {
			return 0;
		}
		return (operation.getValue1()/operation.getValue2())/operation.getValue3();
	}

	@Override
	public double sqrt(OperationModel operationModel) {
		// TODO Auto-generated method stub
		double result;
		if(operation.getValue1()!=0) {
			result=Math.sqrt(operation.getValue1());
		}else if(operation.getValue2()!=0) {
			result=Math.sqrt(operation.getValue2());

		}else {
			result=Math.sqrt(operation.getValue3());
		}
		return result;
	}

	@Override
	public int power(OperationModel operationModel) {
		int result;
		if(operation.getValue1()!=0) {
			result=operation.getValue1()*operation.getValue1();
		}else if(operation.getValue2()!=0) {
			result=operation.getValue2()*operation.getValue2();
		}else {
			result=operation.getValue3()*operation.getValue3();
		}
		return result;
	}

	@Override
	public OperationModel clear(OperationModel operationModel) {
		// TODO Auto-generated method stub
		operation.setValue1(0);
		operation.setValue2(0);
		operation.setValue3(0);
		return operation;
	}

}
