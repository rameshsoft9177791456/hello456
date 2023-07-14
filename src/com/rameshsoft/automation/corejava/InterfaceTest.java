package com.rameshsoft.automation.corejava;

abstract interface BankAtm
{
	String bankName = "AXIS"; //public static final

	void bankBal(); //public abstract
	public abstract void pinChange();
	public void cashWithdraw();
	void setPin();
	public static void cashDeposit()
	{
		int k = 456;
		System.out.println("ISM: cashDeposit()");
	}
	default void accountCreation()
	{
		System.out.println("Default: accountCreation()");
	}
	/*private static void demo1() {
		System.out.println("demo1");
	}
	private void demo2() {
		System.out.println("demo2");
	}*/
}
abstract class BankAtmImpl implements BankAtm
{
	@Override
	public void bankBal() {
		System.out.println("bankbal");
	}
	@Override
	public void pinChange() {
		System.out.println("pinchange");
	}
	@Override
	public void cashWithdraw() {
		System.out.println("cashdeposit");
	}
	public void loans() {
		System.out.println("loans");
	}
	@Override
	public void accountCreation()
	{
		System.out.println("My own accountCreation()");
	}
}
class BankAtmImplOne extends BankAtmImpl
{
	@Override
	public void setPin() {
		System.out.println("set pin");
	}
	public void offers() {
		System.out.println("offers");
	}
}
class BankAtmImplOne1 extends BankAtmImplOne
{
	
}
public class InterfaceTest {
public static void main(String[] args) {
	
	//BankAtm atm = new BankAtm();
	
	//BankAtmImpl atm = new BankAtmImpl();
	
	/*BankAtmImplOne atm = new BankAtmImplOne();
	atm.bankBal();
	atm.cashDeposit();
	atm.loans();
	atm.offers();
	atm.pinChange();
	atm.setPin();*/
	
	/*BankAtmImpl atm = new BankAtmImplOne();
	atm.bankBal();
	atm.cashDeposit();
	atm.loans();
	atm.offers();
	atm.pinChange();
	atm.setPin();*/
	
	BankAtm atm = new BankAtmImplOne();
	atm.bankBal();
	atm.cashWithdraw();
	//atm.loans();
	//atm.offers();
	atm.pinChange();
	atm.setPin();
	
	BankAtm atm2 = new BankAtmImplOne1();
	
	atm2.bankBal();
	atm2.cashWithdraw();
	//atm.loans();
	//atm.offers();
	atm2.pinChange();
	atm2.setPin();
	
	BankAtm.cashDeposit();
	
	String nameResp = BankAtm.bankName;
	System.out.println(nameResp);
	
	atm.accountCreation();
	
	
}
}
