package com.rameshsoft.automation.seleniumadv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExamTest {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(456);
	list.add(56);
	list.add(1);
	list.add(91456);
	list.add(456);
	list.add(56);
	list.add(1);
	list.add(91456);
	list.add(5);
	list.add(95);
	list.add(75);
	list.add(789);
	list.add(91456456);
	
	System.out.println(list);
	
	Set<Integer> set = new TreeSet<Integer>(list);
	System.out.println(set);
	
	//Collections.sort(list);
	//System.out.println(list);
	
	List<Integer> list1 = new ArrayList<Integer>(set);
	int minValue = list1.get(0);
	System.out.println("Min value is: "+minValue);
	
	int maxValue = list1.get(list1.size()-1);
	System.out.println("Max value is: "+maxValue);
	
	
	
}
}
