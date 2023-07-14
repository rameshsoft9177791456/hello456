package com.rameshsoft.automation.corejava;

class Loan
{
	public void hardwork1() {
		System.out.println("OC: HW1");
	}
	public static void hardwork2() {
		System.out.println("OCS: HW2");
	}
	class HomeLoan
	{
		public void homeLoan1() {
			System.out.println("NIC: HL1");
		}
	}
	static class CarLoan
	{
		public void carLoan1() {
			System.out.println("SIC: CL1");
		}
		public static void carLoan2() {
			System.out.println("SIC: CL2");
		}
	}
}
public class InnerClassesTest {
public static void main(String[] args) {
	/*Loan loan = new Loan();
	loan.hardwork1();
	loan.hardwork2();
	Loan.hardwork2();*/
	
	/*Loan.CarLoan.carLoan2();
	Loan.CarLoan carLoan = new Loan.CarLoan();
	carLoan.carLoan1();
	*/
	
	Loan loan = new Loan();
	Loan.HomeLoan homeLoan = loan.new HomeLoan();
	homeLoan.homeLoan1();
	
	
	
	
	
	
	
	
}
}
