package com.cjc.seviceImpl;
import com.cjc.service.*;
import com.cjc.client.Test;
import com.cjc.model.*;
import java.util.Scanner;

public class Sbi implements Rbi{
	
	Scanner sc=new Scanner(System.in);
	
	Accountcreate acc=new Accountcreate();
	@Override
	
	public void Accountcreate()
	{
		System.out.println("Enter Account No");
		acc.setAccno(sc.nextInt());
		
		System.out.println("Enter IFSC code");
		acc.setIFSCcode(sc.next());
		
		System.out.println("Enter Name");
		acc.setName(sc.next());
		
		System.out.println("Enter Adhar no");
		acc.setAdharno(sc.nextLong());
		
		System.out.println("Enter Pancard No");
		acc.setPancardno(sc.next());
		
		System.out.println("Enter Mobile nO");
		acc.setMobno(sc.nextLong());
		
		System.out.println("Enter Gender");
		acc.setGender(sc.next());
		
		System.out.println("Enter Age");
		acc.setAge(sc.nextByte());
		
		System.out.println("Enter Balance");
		acc.setBalance(sc.nextDouble());
}
	
	public void ShowDetails()
	{
		System.out.println("Show Details");
		System.out.println("Account Id:-  "+acc.getAccno());
		System.out.println("Ifsccode:- "+acc.getIFSCcode());
		System.out.println("Name:- "+acc.getName());
		System.out.println("Adharno:- "+acc.getAdharno());
		System.out.println("Pancard:- "+acc.getPancardno());
		System.out.println("Mobileno:- "+acc.getMobno());
		System.out.println("Gender:- "+acc.getGender());
		System.out.println("Age:- "+acc.getAge());
		System.out.println("Balance:- "+acc.getBalance());
	}
	@Override
	public void DepositeAmmount()
	{
		System.out.println("Deposite Ammount");
		
		System.out.println("Enter the ammount to deposite: ");
		double ammount=acc.getBalance()+sc.nextDouble();
		acc.setBalance(ammount);
	}
	@Override
	public void WithdrawalAmmount()
	{
		System.out.println("Withdrawal Ammount");
		
		System.out.println("Enter the ammount to withdrawal: ");
		double ammount=sc.nextDouble();
		
		acc.setBalance(acc.getBalance()-ammount);
		System.out.println("Ammount withdrawal successfully");
	}
	
	public void BalanceCheck()
	{
		System.out.println("Enter Account No");
		int accNO=sc.nextInt();
		try {
		if(accNo!=acc.getAccno())
		{
			throw new InvalidAccountNoException("Invalid Acc No")
		}
		catch(Exception e) {
			System.out.println();
		System.out.println("Account Balance: "+ acc.getBalance());
	}

}
}
