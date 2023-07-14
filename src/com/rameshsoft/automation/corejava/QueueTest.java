package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
public static void main(String[] args) {
	
	//Collection collection = new PriorityQueue();
	
	//Queue queue = new PriorityQueue();
	
	PriorityQueue queue = new PriorityQueue();
	
	queue.add(456);
	queue.add(91456);
	queue.add(56);
	queue.add(456456);
	queue.add(9456);
	//queue.add(null);
	//queue.add("hello");
	
	System.out.println(queue);
	
	
	
	
}
}
