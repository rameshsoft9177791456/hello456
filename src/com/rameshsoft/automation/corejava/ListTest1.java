package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest1 {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("hello");
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	list.add("practice");
	list.add("java");
	list.add("java");
	
	System.out.println(list);
	
	Collections.sort(list);
	
	System.out.println(list);
	
	
	
	
	
	
	
	
	
	
}
}
