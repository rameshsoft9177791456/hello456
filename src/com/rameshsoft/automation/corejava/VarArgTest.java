package com.rameshsoft.automation.corejava;

public class VarArgTest {
	
	public void hardwork() {
		System.out.println("No arg method");
	}
	
	public void hardwork(String str) {
		System.out.println("1 arg method");
	}
	
	public void hardwork(String... str) {
		System.out.println("var arg method");
	}
	
	public void job(String str,int... i) {
		System.out.println("int var arg method");
	}
	
public static void main(String[] args) {
	
	VarArgTest test = new VarArgTest();
	test.hardwork();
	test.hardwork("java");
	test.hardwork("java","selenium");
	test.hardwork("java","selenium","job");
	test.hardwork("java","selenium","job","hardwork");
	
	
	
}
}
