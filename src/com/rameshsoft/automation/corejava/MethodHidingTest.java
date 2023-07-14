package com.rameshsoft.automation.corejava;

class MethodHidingDemo
{
	public void doHardwork() {
		System.out.println("Do hardwork");
	}
	
	static public void job() {
		System.out.println("Job");
	}
}

public class MethodHidingTest extends MethodHidingDemo{
	@Override
	public void doHardwork() {
		System.out.println("I Do hardwork");
	}
	static public void job() {
		System.out.println("I need Job");
	}
public static void main(String[] args) {
	
	MethodHidingDemo test = new MethodHidingTest();
	test.doHardwork();
	test.job();
	
	
	
	
	
}
}
