package com.rameshsoft.automation.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtility {

	public static boolean isValidPhNum(String phNum)
	{
		boolean isValid = true;
		Pattern pattern = Pattern.compile("(0|91)?[5-9][0-9]{9}");
		
		Matcher matcher = pattern.matcher(phNum);
		
		if (matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
			System.out.println("It is valid phone number");
		}
		else {
			System.out.println("It is NOT a valid phone number");
			isValid = false;
		}
		return isValid;
	}
	
}
