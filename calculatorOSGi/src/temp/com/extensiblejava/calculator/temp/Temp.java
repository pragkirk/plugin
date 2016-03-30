package com.extensiblejava.calculator.temp;

import com.extensiblejava.calculator.operation.Operation;
import com.extensiblejava.calculator.operation.Values;
import java.util.Map;

import aQute.bnd.annotation.component.Component;

@Component(properties="name=Temp")
public class Temp implements Operation {
	private Integer temp;
	
	public void setValues(Values values) {
		Map<String,Integer> map = values.getValues();
		this.temp = map.get("temp").intValue();
	}
	
	public String execute() {
		int conv1 = new Integer(this.temp).intValue() - 32;
		float conv2 = conv1 * 5 / 9;
		String celsius = new Float(conv2).toString();
		return new String(celsius) + "celsius";
	}

}
