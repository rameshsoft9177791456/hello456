package com.rameshsoft.automation.corejava;

class ConsTestOne2
{
	int practHrs;
	String result;

	public ConsTestOne2(int hrs,String res)
	{
		//this.practHrs = hrs;
		//this.result = res;
		practHrs = hrs;
		result = res;
	}
	public ConsTestOne2()
	{
		System.out.println("Default constructor");
	}
	public ConsTestOne2(int practHrs)
	{
		System.out.println("Para constructor");
	}
	public void display() {
		System.out.println(practHrs+"   "+result);
	}
}
public class ConstructorsTestOne2 {
	
public static void main(String[] args) {
	ConsTestOne2 one = new ConsTestOne2(5,"JOB");
	one.display();
	
	ConsTestOne2 one1 = new ConsTestOne2(5,"JOB");
	one1.display();
	
	ConsTestOne2 one2 = new ConsTestOne2('d',"JOB");
	one2.display();
	
	ConsTestOne2 one3 = new ConsTestOne2(5,"JOB");
	one3.display();
}
}
