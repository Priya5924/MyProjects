package com.cjc.ims.app.serviceimpl;
import com.cjc.ims.app.model.*;


import java.util.*;

import com.cjc.ims.app.servicei.Cjc;

public  class Karvenagar implements Cjc{
	int num;
	Scanner scc=new Scanner(System.in);
	
	Scanner sc=new Scanner(System.in);
	
	
	List<Course>clist=new ArrayList<>();
	
	List<Faculty>flist=new ArrayList<>();
	
	List<Batch>blist=new ArrayList<>();
	
	List<Student>slist=new ArrayList<>();
	
	public void addCourse() {
		Course c=new Course();
        System.out.println("Enter Course id: ");
        int cid;
        try {
        	cid=sc.nextInt();
        }catch(InputMismatchException e)
        {
        	System.out.println("Enter Integer Value: ");
        	cid=scc.nextInt();
        }
        c.setCid(cid);
        System.out.println("Enter Course name: ");
        String d=scc.next();
        c.setCname(d);
        clist.add(c);
		
		
		
	}

	@Override
	public void viewCourse() {
		if(clist.isEmpty())
		{
			System.out.println("Please Add First Course");
		}
		Iterator<Course> itr=clist.iterator();
		System.out.println("These Courses Is Available \n");
		num=0;
		while(itr.hasNext())
		{
			System.out.println("==================================");
			num=num+1;
			System.out.println("Course No :"+num);
			Course co=(Course)itr.next();
			System.out.println("Course id :"+co.getCid());
			System.out.println("Course name :"+co.getCname());
			System.out.println("===================================");
			this.num=num;
		}
		
		
	}

	@Override
	public void addFaculty() {
		Faculty f=new Faculty();
		System.out.println("Enter Faculty id: ");
		int x;
		try
		{
			x=sc.nextInt();
			
		}catch(InputMismatchException u)
		{
			System.out.println("Enter Integer Value");
			x=scc.nextInt();
		}
		f.setFid(x);
		System.out.println("Enter Faculty name: ");
		String Fname=scc.next()+scc.nextLine();
		f.setFname(Fname);
		System.out.println("\n Assign Course Id to Faculty");
		viewCourse();
		System.out.println("Assign Course(Enter Integer Value Only)");
		int x1=scc.nextInt();
		if(num>x1)
		{
			try
			{
				throw new Not_Valid_Number("Enter Right Value");
			}catch(Not_Valid_Number e)
			{
				System.out.println(e.getMessage());
				x1=scc.nextInt();
			}
		}
		Iterator<Course> fitr=clist.iterator();
		while(fitr.hasNext())
		{
			Course s=fitr.next();
			for(int i=0;i<=x1;i++) {
				if(x1==i)
				{
					try
					{
						f.setCourse(clist.get(i-1));
					}catch(IndexOutOfBoundsException e)
					{
						System.out.println("Enter value Only For Choice Code");
						int y=scc.nextInt();
						f.setCourse(clist.get(y-1));
					}
				}
			}
		}
		
		flist.add(f);
		
		
	}

	@Override
	public void viewFaculty() {
		Iterator<Faculty> fitr=flist.iterator();
		num=0;
		while(fitr.hasNext())
		{
			System.out.println("===========================================");
			num=num+1;
			System.out.println("Faculty No :" +num);
			Faculty fa=fitr.next();
			System.out.println("Faculty id :"+fa.getFid());
			System.out.println("Faculty name :"+fa.getFname());
			System.out.println("Course Id:"+fa.getCourse().getCid());
			System.out.println("Course Name :"+fa.getCourse().getCname());
			System.out.println("===============================================");
			this.num=num;
		}
		
		
		
	}

	@Override
	public void addBatch() {
		Batch b=new Batch();
		sc=new Scanner(System.in);
		scc=new Scanner(System.in);
		System.out.println("Enter Batch id: ");
	    int bi;
	    try {
	    	bi=sc.nextInt();
	    }catch(InputMismatchException e)
	    {
	    	System.out.println("Enter Integer Value:");
	    	bi=sc.nextInt();
	    }
	    b.setBid(bi);
		System.out.println("Enter Batch name: ");
		String batc=scc.next()+	scc.nextLine();
		b.setBname(batc);
		System.out.println("Chose Faculty No: ");
		viewFaculty();
		System.out.println("Enter Faculty No:");
		int x2=scc.nextInt();
		if(num>x2)
		{
			try {
				throw new Not_Valid_Number("Enter Write Value: ");
			}catch(Not_Valid_Number e)
			{
				System.out.println(e.getMessage());
				x2=scc.nextInt();
				
				
			}
		}
		Iterator<Faculty> fitr=flist.iterator();
		while(fitr.hasNext())
		{
			Faculty s=fitr.next();
			for(int i=0;i<=x2;i++)
			{
				if(x2==i)
				{
					try {
						b.setFaculty(flist.get(i-1));
					}
					catch(IndexOutOfBoundsException ie) {
						System.out.println("Enter Value From Faculty Id ");
						int y=sc.nextInt();
						b.setFaculty(flist.get(i-y));
					}
				}
			}
		}
		blist.add(b);
		
	}

	@Override
	public void viewBatch() {
		Iterator<Batch> bitr=blist.iterator();
		num=0;
		while(bitr.hasNext())
		{
			System.out.println("=======================================");
			num=num+1;
			System.out.println("Batch No :" +num);
			Batch ba=bitr.next();
			System.out.println("Batch id :"+ba.getBid());
			System.out.println("Batch name :"+ba.getBname());
			System.out.println("Faculty Id :"+ba.getFaculty().getFid());
			System.out.println("Faculty Name :"+ba.getFaculty().getFname());
			System.out.println("Course Id :"+ba.getFaculty().getCourse().getCid());
			System.out.println("Course Name :"+ba.getFaculty().getCourse().getCname());
			System.out.println(("============================================="));
			this.num=num;
		}
		
		
		
	}

	@Override
	public void addStudent() {
		Student s=new Student();
		sc=new Scanner(System.in);
		scc=new Scanner(System.in);
		System.out.println("Enter Student id: ");
		int si;
		try {
			si=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Enter Only Integer Value :");
			si=scc.nextInt();
		}
		s.setSid(si);
		System.out.println("Enter Student name: ");
		String stud=scc.next()+scc.nextLine();	
		s.setSname(stud);
		System.out.println(("\nAssign Batch Id for Student"));
		viewBatch();
		System.out.println("Assign Batch No ");
		int x3=scc.nextInt();
		if(num>x3)
		{
			try {
				throw new Not_Valid_Number("Enter Write Value");
			}catch(Not_Valid_Number e)
			{
				System.out.println(e.getMessage());
				x3=scc.nextInt();
			}
		}
		Iterator<Batch> bitr=blist.iterator();
		while(bitr.hasNext())
		{
			Batch k=bitr.next();
			for(int i=0;i<=x3;i++) {
				if(x3==i)
				{
					try {
						s.setBatch(blist.get(i-1));
					}catch(IndexOutOfBoundsException ie) {
					System.out.println("Enter No from choice of Batch");
					int y=sc.nextInt();
					s.setBatch(blist.get(y-1));
					}
				}
			}
		}
		slist.add(s);
		
		
	}

	@Override
	public void viewStudent() {
		Iterator<Student> itr=slist.iterator();
		num=0;
		while(itr.hasNext())
		{
			System.out.println(("============================"));
			num=num+1;
			System.out.println("Student No :"+num);
			Student st=itr.next();
			System.out.println("Student id :"+st.getSid());
			System.out.println("Student name :"+st.getSname());
			System.out.println("Batch id:"+st.getBatch().getBid());
			System.out.println("Batch Name:"+st.getBatch().getBname());
			System.out.println("Faculty Id:"+st.getBatch().getFaculty().getFid());
			System.out.println("Faculty Name:"+st.getBatch().getFaculty().getFname());
			System.out.println(("Course Id:"+st.getBatch().getFaculty().getCourse().getCid()));
			System.out.println("Course Name:"+st.getBatch().getFaculty().getCourse().getCname());
			System.out.println("=============================================");

			
		}
		
	}
	
	
	
	

}
