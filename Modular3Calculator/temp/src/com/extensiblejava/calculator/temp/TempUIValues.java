package com.extensiblejava.calculator.temp;

import com.extensiblejava.calculator.*;
import com.extensiblejava.calculator.operation.*;
import java.io.*;

import java.util.Map;
import java.util.HashMap;

public class TempUIValues implements Values {

	public Map getValues() {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		
		Map<String, Integer> vals = new HashMap<String, Integer>();
		try {
			System.out.print("Enter temperature: ");
			Integer temp = new Integer(reader.readLine());
			
			vals.put("temp",temp);			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vals;
	}
}