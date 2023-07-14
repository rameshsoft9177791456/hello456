package com.rameshsoft.automation.corejava;

import java.util.Scanner;

public class MultiplicationTableProg {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int val = scanner.nextInt();
	
	for(int i=1; i<=10; i++)
	{
		System.out.println(val +" * "+i+" = "+val * i);
	}
	//9 * 1 = 9
    //9 * 2 = 18
	//9 * 3 = 27
	//9 * 4 = 36
	//9 * 5 = 45
	//9 * 6 = 54
	;;;;;;;;;;;;
	
	
	scanner.close();
	

}
}
