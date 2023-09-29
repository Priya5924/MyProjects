package com.cjc.ims.app.client;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.serviceimpl.Karvenagar;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		Karvenagar institute=new Karvenagar();
	
		while(true)
		{
			System.out.println("Select-----\n"
					+"1 AddCourse\n"
					+"2 ViewCourse\n"
					+"3 AddFaculty\n"
					+"4 ViewFaculty\n"
					+"5 AddBatch\n"
					+"6 ViewBatch\n"
					+"7 AddStudent\n"
					+"8 ViewStudent\n"
					+"9 Exit");
			
				
			System.out.println("Enter your choice:  ");
			int ch=sc1.nextInt();
			
			
			if(ch==1)
				institute.addCourse();
			
			else if(ch==2)
				institute.viewCourse();
			else if(ch==3)
				institute.addFaculty();
			else if(ch==4)
				institute.viewFaculty();
			else if(ch==5)
				institute.addBatch();
			else if(ch==6)
				institute.viewBatch();
			else if(ch==7)
				institute.addStudent();
			else if(ch==8)
				institute.viewStudent();
			
		}
	}
}

