package com.rameshsoft.automation.corejava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
public static void main(String[] args) {
	
	//Map map = new Map();
	//Map map = new HashMap();
	//HashMap map = new HashMap();
	//LinkedHashMap map = new LinkedHashMap();
	//IdentityHashMap map = new IdentityHashMap<>();
	
	
	//ConcurrentHashMap map = new ConcurrentHashMap();
	
	Hashtable map = new Hashtable();
	
	map.put("name", "rameshsoft");
	map.put(456, "job");
	map.put("hardwork", "job");
	map.put(91456, "job");
	map.put(456.456, 456);
	//map.put(null, null);
	//map.put(null, "java");
	map.put("job", null);
	map.put(456, "job is must");
	
	Object obj = map.get("name");
	System.out.println(obj);
	
	Object obj1 = map.getOrDefault("name456", "RAMESHSOFT");
	System.out.println(obj1);
	
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
