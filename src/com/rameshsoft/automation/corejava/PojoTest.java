package com.rameshsoft.automation.corejava;

class PojoDemo
{
	private int practHrs;
	private String result;
	
	public int getPractHrs() {
		return practHrs;
	}
	public void setPractHrs(int practHrs) {
		this.practHrs = practHrs;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}

public class PojoTest {
public static void main(String[] args) {
	PojoDemo pojoDemo = new PojoDemo();
	pojoDemo.setPractHrs(9);
	pojoDemo.setResult("JOB");
	
	System.out.println(pojoDemo.getPractHrs());
	System.out.println(pojoDemo.getResult());
}
}
