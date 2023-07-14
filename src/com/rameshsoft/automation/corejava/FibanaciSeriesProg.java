package com.rameshsoft.automation.corejava;

public class FibanaciSeriesProg {
public static void main(String[] args) {
	
	int num = 5;
	
	int num1 = 0,num2 = 1; //sum = 1
	
	for(int i=0; i<=num; i++)
	{
		System.out.println();
		int sum = num1 + num2; //3 + 5
		num1 = num2;
		num2 = sum;
		System.out.println(sum);
	}
	
	
	//num1 =3  num2=5 sum=5
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
