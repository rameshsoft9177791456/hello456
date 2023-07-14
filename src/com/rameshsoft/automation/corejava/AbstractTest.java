package com.rameshsoft.automation.corejava;

abstract class AbstractDemo
{
	public void practice() {
		System.out.println("practice()");
	}
	public void interviews() {
		System.out.println("interviews()");
	}
	abstract public void job();
	abstract public void subject();
}
abstract class AbstractDemoOne extends AbstractDemo
{
	@Override
	public void subject() {
		System.out.println("subject()");
	}
	public void sal() {
		System.out.println("sal()");
	}
}
class AbstractDemoTwo extends AbstractDemoOne
{
	@Override
	public void job() {
		System.out.println("job()");
	}
	public void hike() {
		System.out.println("hike()");
	}
}
public class AbstractTest {
public static void main(String[] args) {
	
	//AbstractDemo demo = new AbstractDemo();
	
	//AbstractDemoOne one = new AbstractDemoOne();
	
	/*AbstractDemoTwo two = new AbstractDemoTwo();
	two.hike();
	two.interviews();
	two.job();
	two.practice();
	two.sal();
	two.subject();*/
	
	AbstractDemoOne one = new AbstractDemoTwo();
	//one.hike();
	one.interviews();
	one.job();
	one.practice();
	one.sal();
	one.subject();
	
	
}
}
