package com.rameshsoft.automation.corejava;

class Parent
{
	final int practHrs = 6;
	
	public void play() {
		//practHrs = 14;
		System.out.println("PC: Play()");
		System.out.println(practHrs);
	}
	public void education() {
		System.out.println("PC: Education()");
	}
	public void job() {
		System.out.println("PC: Job()");
	}
	public void marriage() {
		System.out.println("PC: Marriage");
	}
}
class Child extends Parent
{
	@Override
	public void education() {
		System.out.println("CC: I don't Education()");
	}
	public void hardwork() {
		System.out.println("CC: Hardwork()");
	}
}

public class OverridingTest {
public static void main(String[] args) {
	
	/*Parent parent = new Parent();
	parent.education();
	parent.job();
	parent.marriage();
	parent.play();*/
	
/*	Child child = new Child();
	child.education();
	child.hardwork();
	child.job();
	child.marriage();
	child.play();*/
	
	Parent parent = new Child();
	parent.education();
	parent.job();
	parent.marriage();
	parent.play();
	
	
	
	
	
}
}
