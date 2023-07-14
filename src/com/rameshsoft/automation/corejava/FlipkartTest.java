package com.rameshsoft.automation.corejava;

class FpMen
{
	public void login() {
		System.out.println("FpMen: login()");
		;;;;;;;;;;;;;;;;;;;;;;;;;;//40 lines of code
	}
	public void clothes() {
		System.out.println("FpMen: clothes()");
		;;;;;;;;;;;;;;;;;;;;;;;;;;;//500 lines of code
	}
	public void logout() {
		System.out.println("FpMen: logout()");
		;;;;;;;;;;;;;;;;;;;;;;;;;//15 lines of code
	}
}

class FpWoMen extends FpMen //FpWoMen--->Child class  FpMen----->Parent class
{
	public void jewelleryGold() {
		System.out.println("FpWoMen: jewelleryGold()");
		;;;;;;;;;;;;;;;;;;;;;;;;;;//400 lines of code
	}
}
class FpKids extends FpWoMen
{
	public void toys() {
		System.out.println("FpKids: jewelleryGold()");
		;;;;;;;;;;;;;;;;;;;;;;;;;;//600 lines of code
	}
}
public class FlipkartTest {
public static void main(String[] args) {
	
	//1. creating parent class object
	/*FpMen fpMen = new FpMen();
	
	fpMen.login();
	fpMen.clothes();
	fpMen.logout();*/
	
	
	//2. creating child class object
	/*FpWoMen fpWoMen = new FpWoMen();
	fpWoMen.login();
	fpWoMen.clothes();
	fpWoMen.jewelleryGold();
	fpWoMen.logout();
	*/
	
	//3. using parent class reference we can create child class object
	FpMen fpMen = new FpWoMen();
	fpMen.login();
	fpMen.clothes();
	fpMen.logout();
	
	
	
	
	
	
	
	
	
	
	
}
}
