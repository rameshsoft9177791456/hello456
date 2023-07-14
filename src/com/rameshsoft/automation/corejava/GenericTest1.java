package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GenericTest1 {
	
	public List hello() {
		List list = new ArrayList();
		list.add(456);
		list.add("job");
		list.add("do hardwork");
		list.add(456.456);
		return list;
	}
	
	public Set<String> hardwork() {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("job");
		set.add("hardwork");
		set.add("practice");
		return set;
	}
	
	public void job(ArrayList list) {
		list.add("hardwork");
		list.add("java");
		System.out.println(list);
	}
	
	public void job(Map<String, String> map) {
		System.out.println(map);
	}
	
public static void main(String[] args) {
	
	GenericTest1 test = new GenericTest1();
	List list = test.hello();
	System.out.println(list);
	
	Set<String> set = test.hardwork();
	System.out.println(set);
	
	ArrayList list1 = new ArrayList();
	list1.add(456);
	list1.add("job");
	list1.add("selenium");
	list1.add(456);
	test.job(list1);
	
	Map<String, String> map = new HashMap<String,String>();
	map.put("do", "hardwork");
	map.put("job", "practice");
	map.put("hardwork", "selenium");
	map.put("practice", "job");
	
	test.job(map);
	
	
	
	
}
}
