package com.rameshsoft.automation.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	
	//Set set = new Set();
	
	//Set set = new HashSet();
	HashSet set = new HashSet();
	
	System.out.println(set.add(456)); //true
	System.out.println(set.add("job")); //true
	System.out.println(set.add(91456)); //true
	System.out.println(set.add("hardwork")); //true
	System.out.println(set.add(456)); //false
	System.out.println(set.add("job")); //false
	System.out.println(set.add(91456)); //false
	System.out.println(set.add("hardwork")); //false
	System.out.println(set.add(null));
	System.out.println(set.add("hardwork never fails"));
	
	
	LinkedHashSet set1 = new LinkedHashSet();
	
	System.out.println(set1.add(456)); //true
	System.out.println(set1.add("job")); //true
	System.out.println(set1.add(91456)); //true
	System.out.println(set1.add("hardwork")); //true
	System.out.println(set1.add(456)); //false
	System.out.println(set1.add("job")); //false
	System.out.println(set1.add(91456)); //false
	System.out.println(set1.add("hardwork")); //false
	System.out.println(set1.add(null));
	System.out.println(set1.add("hardwork never fails"));
	
	System.out.println("HashSet: "+set);
	
	System.out.println("LinkedhHashSet: "+set1);
	
	
	
	
	
	
	
	
}
}
