package com.rameshsoft.automation.seleniumadv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollFwExam1 {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add(456);
	list.add("java");
	list.add("selenium");
	list.add(456);
	list.add(456);
	list.add("java");
	list.add("selenium");
	list.add(456);
	list.add(456);
	list.add("java");
	list.add("selenium");
	System.out.println(list);
	
	LinkedHashSet set3 = new LinkedHashSet();
	List listDup = new ArrayList();
	
	for(int i=0; i<list.size(); i++)
	{
		Object obj = list.get(i);
		boolean status = set3.add(obj);
		if (status) {
			;;;;;
		}
		else {
			listDup.add(obj);
		}
	}
	
	System.out.println("Removed duplicates are: "+listDup);
	
	
	
	
	
	
	
	
	
	Set set = new LinkedHashSet(list);
	System.out.println(set);
	
	LinkedHashSet set1 = new LinkedHashSet();
	set1.addAll(list);
	System.out.println(set1);
	
	
	HashSet set2 = new HashSet();
	for(int i=0; i<list.size(); i++)
	{
		Object obj = list.get(i);
		set2.add(obj);
	}
	System.out.println(set2);
	
	
	
	
}
}
