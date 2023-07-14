package com.rameshsoft.automation.corejava;

class ConsOne1
{
	int practHrs = 9;
	String result = "JOBS";
	public void hardwork() {
		System.out.println("PC: HARDWORK");
	}
}

class ConsTestOne extends ConsOne1
{
	int practHrs;
	String result;

	public ConsTestOne(int practHrs,String result)
	{
		this.practHrs = practHrs;
		this.result = result;
	}
	public void hardwork() {
		System.out.println("CC: HARDWORK");
	}
	public void display() {
		int practHrs = 15;
		String result = "JOB";
		System.out.println(practHrs+"   "+result); //15 JOB
		System.out.println(this.practHrs+"   "+this.result); //5 JOB
		System.out.println(super.practHrs+"   "+super.result); //9 JOBS
		this.hardwork();
		super.hardwork();
	}
}
public class ConstructorsTestOne {
	
public static void main(String[] args) {
	ConsTestOne one = new ConsTestOne(5,"JOB");
	one.display();
	
}
}
