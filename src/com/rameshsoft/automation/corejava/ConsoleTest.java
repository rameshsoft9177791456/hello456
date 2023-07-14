package com.rameshsoft.automation.corejava;

import java.util.Scanner;

public class ConsoleTest {
	
	int practHrs;
	String res;
	
	public void hardwork() {
		System.out.println(practHrs+"  "+res);
	}
	
public static void main(String[] args) {
	ConsoleTest test = new ConsoleTest();
	
	System.out.println("Enter your practice hours"); //5
	Scanner scanner = new Scanner(System.in);
	
	int val1 = scanner.nextInt();//5
	//System.out.println("Enter the result");
	test.practHrs = val1;
	
	System.out.println("Enter the result");
	String val2 = scanner.next();
	test.res = val2;
	
	System.out.println(val1+"    "+val2);
	
	test.hardwork();
	
	scanner.close();
	
}
}
