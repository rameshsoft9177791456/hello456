package com.rameshsoft.automation.corejava;

public class SwapingTest {
public static void main(String[] args) {
	
	int num1 = 65 , num2 = 456;
	int temp = 0;
	
	System.out.println("Before swapping: num1 = "+num1 + "  num2= "+num2);
	
	
	temp = num1; //temp = 65
	num1 = num2; //num1 = 456
	num2 = temp; //num2 = 65
	
	System.out.println("After swapping: num1 = "+num1 + "  num2= "+num2);
	
	
	
	
	
	
	
	
	
}
}
