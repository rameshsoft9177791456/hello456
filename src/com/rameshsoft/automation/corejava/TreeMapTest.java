package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args) {
	
	//Map map = new TreeMap();
	
	TreeMap map = new TreeMap();
	
	map.put("hello", 456);
	map.put("java", "job");
	map.put("selenium", "job");
	map.put("demo", 91456);
	map.put("brand", "real time");
	//map.put(456, "java");
	map.put("hardwork", null);
	
	//map.put(null, "java");
	
	System.out.println(map);
	
	Set setKeys = map.keySet();
	System.out.println("Keys: "+setKeys);
	
	for(Object key : setKeys)
	{
		String str = (String) key;
		System.out.println(str);
	}
	
	Set setEntrys = map.entrySet();
	System.out.println("Entries : "+setEntrys);
	
	for(Object obj : setEntrys)
	{
		System.out.println(obj);
	}
	
	Collection values = map.values();
	System.out.println(values);
	
	
	
	
}
}
