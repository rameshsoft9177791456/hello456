package com.rameshsoft.automation.corejava;

public class FactorialProg1 {
public static void main(String[] args) {
	
	int num = 6;
	
	
	int fact = 1;
	
	for(int i=1; i<=6; i++)
	{
		fact = fact * i; //fact = 120 * 6
	}//fact = 720
	
	System.out.println("Factorial num is: "+fact);
	
}
}
