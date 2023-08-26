package com.cjc.client;
import com.cjc.service.*;
import com.cjc.seviceImpl.*;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Rbi bank=new Sbi();
		
		System.out.println("Select-----\n"
				+"1 AccountCreate\n"
				+"2 ShowDetails\n"
				+"3 DepositeAmmount\n"
				+"4 WithdrawalAmmount\n"
				+"5 BalanceCheck\n"
				+"6 Exit"
				);
		
		int ch=sc.nextInt();
		
		if(ch==1)
		bank.Accountcreate();
		
		
		else if(ch==2)
			bank.ShowDetails();
		
		else if(ch==3)
			bank.DepositeAmmount();
		
		else if(ch==4)
			bank.WithdrawalAmmount();
		
		else if(ch==5)
			bank.BalanceCheck();
		
		
		else {
			System.out.println("Please enter correct choice");
		}
		
		
		
	}

}
