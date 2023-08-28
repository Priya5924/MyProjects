package com.cjc.seviceImpl;
import com.cjc.service.*;
import com.cjc.model.*;
import java.util.Scanner;

public class Sbi implements Rbi{
	
	Scanner sc=new Scanner(System.in);
	
	Accountcreate acc=new Accountcreate();
	@Override
	
	public void Accountcreate()
	{
		System.out.println("Enter Account No");
		int accno=sc.nextInt();
		
		System.out.println("Enter IFSC code");
		String ifsccode=sc.next();
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Adhar no");
		long adharno=sc.nextInt();
		
		System.out.println("Enter Pancard No");
		String Pancardno=sc.next();
		
		System.out.println("Enter Mobile nO");
		long mobno=sc.nextLong();
		
		System.out.println("Enter Gender");
		String gender=sc.next();
		
		System.out.println("Enter Age");
		byte age=sc.nextByte();
		
		System.out.println("Enter Balance");
		double balance=sc.nextDouble();
		
		acc.setAccno(accno);
		
		
		
	}
	
	public void ShowDetails()
	{
		System.out.println("Show Details");
		System.out.println("Account Id "+acc.getAccno());
	}
	@Override
	public void DepositeAmmount()
	{
		System.out.println("Deposite Ammount");
	}
	@Override
	public void WithdrawalAmmount()
	{
		System.out.println("Withdrawal Ammount");
	}
	@Override
	public void BalanceCheck()
	{
		System.out.println("Balance Check");
	}

}
