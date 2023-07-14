package com.rameshsoft.automation.corejava;

class PojoDemo2
{
	private int practHrs;
	private String result;
	
	public int getPractHrs() {
		return practHrs;
	}
	public void setPractHrs(int pract) {
		practHrs = pract;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String res) {
		result = res;
	}
	
}

public class PojoTest2 {
public static void main(String[] args) {
	PojoDemo2 pojoDemo = new PojoDemo2();
	pojoDemo.setPractHrs(9);
	pojoDemo.setResult("JOB");
	
	System.out.println(pojoDemo.getPractHrs());
	System.out.println(pojoDemo.getResult());
}
}
