package com.extensiblejava.calculator.color;

import com.extensiblejava.calculator.*;
import com.extensiblejava.calculator.operation.Values;

import java.io.*;

import java.util.Map;
import java.util.HashMap;

public class RGBUIValues implements Values {

	public Map<String, Integer> getValues() {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		
		Map<String, Integer> vals = new HashMap<String, Integer>();
		try {
			System.out.print("Enter red: ");
			Integer red = new Integer(reader.readLine());
		
			System.out.print("Enter green: ");
			Integer green = new Integer(reader.readLine());
			
			System.out.print("Enter blue: ");
			Integer blue = new Integer(reader.readLine());
			
			vals.put("red",red);
			vals.put("green",green);
			vals.put("blue",blue);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vals;
	}
}