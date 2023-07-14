package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsTest {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	
    list.add("hello");
    list.add("java");
    list.add("selenium");
	list.add("hardwork");
	list.add("job");
	list.add("subject");
	
	
	for(String str : list)
	{
		if (str.equalsIgnoreCase("subject")) {
			System.out.println("   sure you will get job");
		}
		System.out.println(str);
	}
	
	HashSet<Integer> hs = new HashSet<Integer>();
	hs.add(456);
	hs.add(91456);
	hs.add(56);
	hs.add(914564566);
	hs.add(456);
	//hs.add("java");
	
	Iterator<Integer> itr = hs.iterator();
	while(itr.hasNext())
	{
		int val = itr.next();
		if (val == 456) {
			System.out.println("Hello do practice");
		}
		System.out.println(val);
	}
	
	
	Map<String, Double> map = new HashMap<String, Double>();
	
	map.put("java", 456.456);
	map.put("hardwork", 456.56);
	map.put("job", 0.456);
	map.put("course", 15.456);
	map.put("job", 456.456456);
	
	
	Set<String> setKeys = map.keySet();
	System.out.println(setKeys);
	
	Set entrySet = map.entrySet();
	System.out.println(entrySet);
	
}
}
