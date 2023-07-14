package com.rameshsoft.automation.corejava;

public class WrapperTest {
public static void main(String[] args) {
	
	String str = "456";
	
	
	int val = Integer.parseInt(str);
	
	System.out.println(val);
	
	float f = Float.parseFloat(str);
	System.out.println(f);
	
	
	Double d1 = Double.valueOf(str);
	
	System.out.println(d1);
	
	Integer i2 = Integer.valueOf(str);
	System.out.println(i2);
	
	Integer i3 = Integer.valueOf(val);
	System.out.println(i3);
	
	
	
	
}
}
