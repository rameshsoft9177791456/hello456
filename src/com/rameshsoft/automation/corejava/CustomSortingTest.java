package com.rameshsoft.automation.corejava;

import java.util.Comparator;
import java.util.TreeSet;

class SortingTest implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		//return str1.compareTo(str2);
		//return -str1.compareTo(str2);
		//return -str2.compareTo(str1);
		return str2.compareTo(str1);
	}
}
public class CustomSortingTest {
public static void main(String[] args) {	
	
	SortingTest compa = new SortingTest();
	TreeSet ts = new TreeSet(compa);
	ts.add("hello");
	ts.add("hello");
	ts.add("java");
	ts.add("selenium");
	ts.add("hardwork");
	ts.add("job");
	
	System.out.println(ts);
	
}
}
