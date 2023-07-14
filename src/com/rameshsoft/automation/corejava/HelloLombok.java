package com.rameshsoft.automation.corejava;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
public class HelloLombok {

	@Getter @Setter private int id;
	@Getter @Setter private String res;
	@Getter @Setter private double sal;
	;;;;;;;;;;;;;;;;;;
	@Getter @Setter private String profession;
	@Getter @Setter private static int num;
	//200 variables
	
	
    public static void main(String[] args) {
		
		HelloLombok lombok = new HelloLombok();
		lombok.setId(456);
		lombok.setProfession("SOFTWARE");
		lombok.setRes("JOB");
		lombok.setSal(125000);
	    lombok.setNum(456456);
		
		System.out.println(lombok.getId());
		System.out.println(lombok.getProfession());
		System.out.println(lombok.getRes());
		System.out.println(lombok.getSal());
		System.out.println(lombok.getNum());
		
		
		
		
		
	}

}
