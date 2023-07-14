package com.rameshsoft.automation.corejava;

class OverloadTest
{
	public int addition(int num1,int num2) {
		int result = num1 + num2;
		System.out.println("int int Result is: "+result);
		return result;
	}
	public float addition(float num1,float num2) {
		float result = num1 + num2;
		System.out.println("float float Result is: "+result);
		return result;
	}
	public int addition(char num1,char num2) {
		int result = num1 + num2;
		System.out.println("char char Result is: "+result);
		return result;
	}
	public double addition(double num1,double num2) {
		double result = num1 + num2;
		System.out.println("double double Result is: "+result);
		return result;
	}	
}
public class OverloadTest1 {
public static void main(String[] args) {
	OverloadTest test = new OverloadTest();
	test.addition(450, 450);
	test.addition('a', 'b');
	test.addition(350.50f, 350.50f);
	test.addition(450.0, 2500.50);
	
	
	
	
	
	
	
	
}
}


