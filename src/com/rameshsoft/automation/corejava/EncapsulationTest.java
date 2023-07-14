package com.rameshsoft.automation.corejava;

class EncapsulationTest1
{
	private int practHrs = 9;
	private String res = "JOB";
	
	public void hello() {
		System.out.println(practHrs+"  ********  "+res);
	}
	public int getPractHrs() {
		return practHrs;
	}
	public String getRes() {
		return res;
	}
	
}

public class EncapsulationTest {
public static void main(String[] args) {
	
	EncapsulationTest1 test = new EncapsulationTest1();
	System.out.println(test.getPractHrs());
	System.out.println(test.getRes());
	
}
}
