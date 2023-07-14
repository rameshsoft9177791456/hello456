package com.rameshsoft.automation.corejava;

public class InitObjectTest {
	
	int practHrs;
	String res;
	
	public void display() {
		System.out.println(practHrs+" ********* "+res);
	}
	
public static void main(String[] args) {
	
	InitObjectTest test = new InitObjectTest();
	test.display();
	
	System.out.println("After initialisation");
	
	test.practHrs = 9;
	test.res = "JOB";
	test.display();
	
	InitObjectTest test1 = new InitObjectTest();
	test1.display();
	test1.practHrs = 15;
	test1.res = "HARDWORK";
	
	test1.display();
	
	
	
	
	
}
}
