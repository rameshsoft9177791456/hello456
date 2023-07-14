package com.rameshsoft.automation.corejava;

class BlocksTest1
{
	static
	{
		System.out.println("PC: SB456");
	}
	static
	{
		System.out.println("PC: SB4561");
	}
	{
		System.out.println("PC: IB1");
	}
	public BlocksTest1() {
		System.out.println("PC: DC");
	}
}

public class BlocksTest extends BlocksTest1{
	public BlocksTest() {
		System.out.println("CC: DC");
	}
	static
	{
		System.out.println("CC: SB91456");
	}
	{
		System.out.println("CC: IB1");
	}
	static
	{
		System.out.println("CC: SB914561");
	}
public static void main(String[] args) {
	//BlocksTest1 test = new BlocksTest1();
	BlocksTest test = new BlocksTest();
	
}
}
