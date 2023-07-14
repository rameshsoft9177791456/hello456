package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilityClassesTest {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	list.add("java");
	list.add("abc");
	
	
	for(Object obj : list)
	{
		String str = (String) obj;
		if (str.equalsIgnoreCase("job")) {
			System.out.println("   Yes i will get a job");
		}
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String[] str = {"hello","abc","java","selenium","hardwork"};
	
	for(String str1 : str)
	{
		System.out.println(str1);
	}
	
	
	Arrays.sort(str);
	
	System.out.println(" **************** ");
	
	for(String str1 : str)
	{
		System.out.println(str1);
	}
	
	System.out.println(Arrays.binarySearch(str, "java"));
	System.out.println(Arrays.binarySearch(str, "java456"));
	
	
	List list1 = Arrays.asList(str);
	System.out.println(list1);
	
	*/
	
	/*List list = new ArrayList();
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	list.add("java");
	list.add("abc");
	
	
	System.out.println(list);
	
	Collections.sort(list);
	
	System.out.println(list);
	
	boolean status = list.contains("job");
	if (status) {
		System.out.println("Yes it is available");
	}
	else {
		System.out.println("It is NOT available");
	}
	
	System.out.println(Collections.binarySearch(list, "job"));;
	System.out.println(Collections.binarySearch(list, "job456"));;
	*/

	
	
	
	
}
}
