package com.rameshsoft.automation.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest2 {
public static void main(String[] args) {
	
	String str = "adp456";
	
	
	Pattern pattern = Pattern.compile("[0-9]");
	
	Matcher matcher = pattern.matcher(str);
	
	int sum = 0;//15
	
	while(matcher.find()) {
		String str1 = matcher.group(); //"4" "5" "6"
		
		System.out.println(str1);
		
		int i = Integer.parseInt(str1); //4 5 6
		sum = sum + i; //9 + 6
	}
	
	System.out.println("SUM IS: "+sum);
	
	
	
	
	
	
	
}
}
