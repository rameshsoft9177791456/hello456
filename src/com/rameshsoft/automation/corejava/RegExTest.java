package com.rameshsoft.automation.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
public static void main(String[] args) {
	
	String str = "java javaJAVA@$ jobjava java456";
	
	Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
	
	Matcher matcher = pattern.matcher(str);
	
	int count = 0;
	
	while(matcher.find()) {
		
		count++;
		
		String grup = matcher.group();
		System.out.println(grup);
		
		int startIndx = matcher.start();
		System.out.println(startIndx);
		
		int endIndx = matcher.end();
		System.out.println(endIndx);
	}
	
	
	System.out.println("Noof occurences of a char a is: "+count);
	
	
	
	
	
	
}
}
