package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsTest {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("hello");
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	System.out.println(list);
	
	for(Object obj : list)
	{
		String str = (String) obj;
		if (str.equalsIgnoreCase("java")) {
			System.out.println("   Hello do practice");
		}
		else if (str.equalsIgnoreCase("job")) {
			System.out.println("   congratulations");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String[] str = {"hello","java","selenium","hardwork","job"};
	
	for(String str1 : str)
	{
		if (str1.equalsIgnoreCase("java")) {
			System.out.println("   Hello do practice");
		}
		else if (str1.equalsIgnoreCase("job")) {
			System.out.println("   congratulations");
		}
	}
	*/
	
	/*
	List list = new ArrayList();
	list.add("hello");
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	System.out.println(list);
	
	Iterator itr = list.iterator();
	
	while(itr.hasNext())
	{
		Object obj = itr.next();
		String str = (String) obj;
		if (str.equalsIgnoreCase("java")) {
			System.out.println("   Hello do practice");
		}
		else if (str.equalsIgnoreCase("job")) {
			System.out.println("   congratulations");
		}
	}
	*/
	
	
	/*List list = new ArrayList();
	list.add("hello");
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	System.out.println(list);
	
	ListIterator itr = list.listIterator();
	
	while(itr.hasNext())
	{
		Object obj = itr.next();
		String str = (String) obj;
		if (str.equalsIgnoreCase("java")) {
			System.out.println("   Hello do practice");
		}
		else if (str.equalsIgnoreCase("job")) {
			System.out.println("   congratulations");
		}
	}
	
	*/
	
	/*Vector vector = new Vector();
	vector.add("hello");
	vector.add("java");
	vector.add("selenium");
	vector.add("hardwork");
	vector.add("job");
	System.out.println(vector);
	
	Enumeration enumeration = vector.elements();
	
	while(enumeration.hasMoreElements())
	{
		Object object = enumeration.nextElement();
		String str = (String) object;
		if (str.equalsIgnoreCase("java")) {
			System.out.println("   Hello do practice");
		}
		else if (str.equalsIgnoreCase("job")) {
			System.out.println("   congratulations");
		}
	}
	
	
	*/
	
	
	
	
	
	
	
}
}
