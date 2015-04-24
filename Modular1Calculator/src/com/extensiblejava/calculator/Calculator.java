package com.extensiblejava.calculator;

import java.util.HashMap;
import java.util.Map;


public class Calculator {

	private String message;
	private Map<String, Operation> operations = new HashMap();
	private Map<String, Values> values = new HashMap();	
	
	public void calculate(String operation) {
		//op.registerHandler(this);
		//return op.execute();
		
		Operation opSvc = this.operations.get(operation);
		Values valSvc = this.values.get(operation+"UI");
		//Calculator calc = new Calculator();
		opSvc.setValues(valSvc);
		String result = opSvc.execute();
		System.out.println(result);
	}
	

	public void setOperation(Operation opSvc, Map<String, Object> props) {
		String name = (String) props.get("name");
		operations.put(name, opSvc);
	}

	public void setValues(Values valSvc, Map<String, Object> props) {
		String name = (String) props.get("name");
		values.put(name, valSvc);
	}

}