package com.extensiblejava.calculator.color;

import com.extensiblejava.calculator.operation.Operation;
import com.extensiblejava.calculator.operation.Values;

import java.util.Map;

public class RGB implements Operation {
	private Integer red;
	private Integer green;
	private Integer blue;
	
	public void setValues(Values values) {
		Map<String,Integer> map = values.getValues();
		this.red = map.get("red").intValue();
		this.green = map.get("green").intValue();
		this.blue = map.get("blue").intValue();
	}
	
	public String execute() {
		int color = ( (this.red << 16) | (this.green << 8) | this.blue );
		return "#" + Integer.toHexString(color);
	}

}
