package com.rameshsoft.automation.corejava;

class ThisSuperConsCallsTest1
{
	public ThisSuperConsCallsTest1() {
		System.out.println("PC: DC");
	}
	public ThisSuperConsCallsTest1(String str) {
		this();
		System.out.println("PC: PC");
	}
}

public class ThisSuperConsCallsTest extends ThisSuperConsCallsTest1{
	
	public ThisSuperConsCallsTest() {
		this("JOB");
		System.out.println("CC: DC");
	}
	public ThisSuperConsCallsTest(String str) {
		super("JOB");
		System.out.println("CC: PC :"+str);
	}
	
public static void main(String[] args) {
	
	ThisSuperConsCallsTest test = new ThisSuperConsCallsTest();
	//ThisSuperConsCallsTest test1 = new ThisSuperConsCallsTest("JOB");
	
	
}
}
