package com.rameshsoft.automation.corejava;

interface I1
{
	void hello1();
	void hello2();
	
	interface I2 //public static
	{
		void hello1();
		void hello3();
		void hello4();
	}
}
class I1Impl implements I1
{
	@Override
	public void hello1() {
		System.out.println("hello1");
	}
	@Override
	public void hello2() {
		System.out.println("hello2");
	}
}
class I2Impl implements I1.I2
{
	@Override
	public void hello1() {
		System.out.println("hello1");
	}
	@Override
	public void hello3() {
		System.out.println("hello3");
	}
	@Override
	public void hello4() {
		System.out.println("hello4");
	}
}
class I1I2Impl implements I1,I1.I2
{
	@Override
	public void hello3() {
		
	}
	@Override
	public void hello4() {
		
	}
	@Override
	public void hello1() {
		
	}
	@Override
	public void hello2() {
		
	}
}
public class InnerInterfacesTest {
public static void main(String[] args) {
	
	I1 i1 = new I1Impl();
	i1.hello1();
	i1.hello2();
	
	
	I1.I2 i2 = new I2Impl();
	i2.hello1();
	i2.hello3();
	i2.hello4();
	
	
	
	
	
	
	
	
	
}
}
