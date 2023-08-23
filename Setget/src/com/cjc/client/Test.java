package com.cjc.client;

import com.cjc.model.Laptop;

public class Test{
	public static void main(String[] args) {
		
		Laptop l=new Laptop();
		l.setLmodelno(1011);
		l.setLname("HP");
		l.setLprice(50.3f);
		
		Laptop l1=new Laptop();
		l1.setLmodelno(1022);
		l1.setLname("Lenovo");
		l1.setLprice(60000.5f);
		
		System.out.println(l.getLmodelno());
		System.out.println(l.getLname());
		System.out.println(l.getLprice());
		System.out.println(l1.getLmodelno());
		System.out.println(l1.getLname());
		System.out.println(l1.getLprice());
		
		
	}

}
