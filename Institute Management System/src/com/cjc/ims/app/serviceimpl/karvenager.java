package com.cjc.ims.app.serviceimpl;

import java.io.*;

import com.cjc.ims.app.servicei.Cjc;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;
import com.cjc.ims.app.model.*;
import com.cjc.ims.app.servicei.*;

public class karvenager implements Cjc {
	static int num;
	Scanner sc;
	Scanner scc=null;
	
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();
	

	@Override
	public void addCource() {
		
		Course courceobj=new Course();
		sc=new Scanner(System.in);
		scc=new Scanner(System.in);
		System.out.println("Enter Cource ID :");
		int cid;
		try {
		 cid=sc.nextInt();
		    }catch(InputMismatchException e)
		    {
			System.out.println("Enter Integer Value :");
			cid=scc.nextInt();
			}
		courceobj.setCid(cid);
		System.out.println("Add Cource Name :");
		String d=scc.next();
		courceobj.setCname(d);
		clist.add(courceobj);	
	   
	
		
}

	@Override
	public void viewCource() {
		if(clist.isEmpty())
		{System.out.println("Plese Add First Cource");
		 addCource();
		}
		else{
		Iterator<Course> citr=clist.iterator();
		System.out.println("These Cource Is Available \n");
		num=0;
		while(citr.hasNext())
		{
			System.out.println("===============================");
			num=num+1;
			System.out.println("Cource No :"+num);
			Course c=(Course)citr.next();
			System.out.println("Cource Id :"+c.getCid());
			System.out.println("Cource Name :"+c.getCname());
			System.out.println("===============================");
			 this.num=num;
		}
	}
	}

	@Override
	public void addFaculty() {
		if(clist.isEmpty()==false)
		{
				
		Faculty facultyobj=new Faculty();
		sc=new Scanner(System.in);
		scc=new Scanner(System.in);
		System.out.println("Enter Faculty ID");
	    int x;
		try {
	    	x=sc.nextInt();
	        }catch(InputMismatchException u)
	         {
	    	System.out.println("Enter Integer Value");
	    	x=scc.nextInt();
	    	 }
		facultyobj.setFid(x);
		System.out.println("Add Faculty Name");
		String Fname=scc.next()+scc.nextLine();
		facultyobj.setFname(Fname);
		System.out.println("\nAssign Cource ID For Faculty ");
		viewCource();
		System.out.println("Assign Cource(Enter Integer Value Onley)");
		
		int x1=scc.nextInt();
		if(num>x1) 
		{
			try {
				throw new Not_Valid_Number("Enter Write Value");
				
			}
			catch(Not_Valid_Number e)
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
				try {
				facultyobj.setCourse(clist.get(i-1));
				}catch(IndexOutOfBoundsException e)
				{
					System.out.println("Enter Valu Only For Choice Code");
					
					int y =scc.nextInt();
					facultyobj.setCourse(clist.get(y-1));
					}
				}
			}
		}
		flist.add(facultyobj);
	}
		else if(clist.isEmpty())
		{
			System.out.println("Add First Cource");
		}
	}

	@Override
	public void viewFaculty() {
		if(clist.isEmpty() || flist.isEmpty())
		{
			System.out.println("Plese Enter Correct Information");
		     if(clist.isEmpty())
		{System.out.println("Plese Add Cource");
			addCource();
		}
		else {
			System.out.println("Plese Enter Faculty Information");
			addFaculty();
		}
		}else {
		Iterator<Faculty> fitr=flist.iterator();
		num=0;
		while(fitr.hasNext()) {
			System.out.println("===============================");
			num=num+1;
			System.out.println("Faculty No :" +num);
			Faculty fa=fitr.next();
			System.out.println("Faculty ID :"+fa.getFid());
			System.out.println("Faculty Name :"+fa.getFname());
			System.out.println("Cource ID :"+fa.getCourse().getCid());
			System.out.println("Cource Name :"+fa.getCourse().getCname());
			System.out.println("===============================");
			this.num=num;
		}
		}
	}

	@Override
	public void addBatch() {
		if(flist.isEmpty()==false)
		{
		Batch batchobj=new Batch();
		sc=new Scanner(System.in);
		scc=new Scanner(System.in);
		
		System.out.println("Enter Batch ID");
		int bi;
		try {
			 bi=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter Integer Value ");
			bi=scc.nextInt();	
		}
		batchobj.setBid(bi);
		System.out.println("Add Batch Name");
		String batc=scc.next()+scc.nextLine();
		batchobj.setBname(batc);
		System.out.println("Choose Faculty No");
		viewFaculty();
		System.out.println("Enter Faculty No");
		int x2=scc.nextInt();
		if(num>x2) 
		{
			try {
				throw new Not_Valid_Number("Enter Write Value");
			}
			catch(Not_Valid_Number e)
			{
				System.out.println(e.getMessage());
				x2=scc.nextInt();
			}
		}
		
		Iterator<Faculty> fitr=flist.iterator();
		
		while(fitr.hasNext())
		{
			Faculty s=fitr.next();
			for(int i=0;i<=x2;i++) {
			if(x2==i)
			{
				try{
					batchobj.setFaculty(flist.get(i-1));
				}
				catch(IndexOutOfBoundsException ie){
					System.out.println("Enter Value from choice of faculty");
					int y=sc.nextInt();
					batchobj.setFaculty(flist.get(y-1));
				}
			}
		}
		}
		blist.add(batchobj);
		}else if(flist.isEmpty())
		{
			System.out.println("Add First Faculty");
		}
	}


	@Override
	public void viewBatch(){
		if(clist.isEmpty()||flist.isEmpty()||blist.isEmpty())
		{
			if(clist.isEmpty())
			{
				System.out.println("Plese Enter Cource Information");
				addCource();
			}else if(flist.isEmpty()) 
			{
				System.out.println("Plese Enter Faculty Information");
				addFaculty();
			}else {
				System.out.println("Plese Batch Information");
				addBatch();
			}
		}else {
		Iterator<Batch> bitr=blist.iterator();
		num=0;
		while(bitr.hasNext()) {
			System.out.println("===============================");
			num=num+1;
			System.out.println("Batch No :"+ num);
			Batch B=bitr.next();
			System.out.println("Batch ID :"+B.getBid());
			System.out.println("Batch Name :"+B.getBname());
			System.out.println("Faculty ID :"+B.getFaculty().getFid());
			System.out.println("Faculty Name :"+B.getFaculty().getFname());
			System.out.println("Course ID :"+B.getFaculty().getCourse().getCid());
			System.out.println("Course Name :"+B.getFaculty().getCourse().getCname());
			System.out.println("===============================");
			this.num=num;
		}
	}
	}

	@Override
	public void addStudent() {
		if(blist.isEmpty()==false)
		{
		Student studentobj=new Student();
		sc=new Scanner(System.in);
		scc=new Scanner(System.in);
		System.out.println("Enter Student ID");
		int si;
		try{
		si=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Enter Only Integer");
			si=scc.nextInt();
		}
		studentobj.setSid(si);
		System.out.println("Add Student Name");
		String stud=scc.next()+scc.nextLine();
		studentobj.setSname(stud);
		System.out.println("\nAssign Batch ID For Student");
		viewBatch();
		System.out.println("Assign Id");
		
		int x3=scc.nextInt();
		if(num>x3) 
		{
			try {
				throw new Not_Valid_Number("Enter Write Value");
				
			}
			catch(Not_Valid_Number e)
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
				try{
					studentobj.setBatch(blist.get(i-1));
				}catch(IndexOutOfBoundsException ie){
					System.out.println("Enter No from choice Of Batch");
					int y=sc.nextInt();
					studentobj.setBatch(blist.get(y-1));
				}
			}
			}
		}
		slist.add(studentobj);
		}else if(blist.isEmpty())
		{
			System.out.println("Add First Batch Information");
		}
	}
	
	@Override
	public void viewStudent() {
		Iterator<Student> sitr=slist.iterator();
		num=0;
		if(clist.isEmpty()||flist.isEmpty()||blist.isEmpty()||slist.isEmpty())
		{
			if(clist.isEmpty())
			{System.out.println("Plest Enter Cource Information");
			addCource();
			}
			else if(flist.isEmpty())
			{System.out.println("Plese Enter Faculty Information");
			addFaculty();}
			else if(blist.isEmpty())
			{System.out.println("Plese Enter Batch Information");
			addBatch();	
			}
			else {
				System.out.println("Plese Enter Student Information");
				addStudent();
			}
		}
		else {
		while(sitr.hasNext()) {
			System.out.println("===============================");
			num=num+1;
			System.out.println("Student No :"+ num);
			Student st=sitr.next();
			System.out.println("Student ID :"+st.getSid());
			System.out.println("Student Nmae :"+st.getSname());
			System.out.println("Batch ID :"+st.getBatch().getBid());
			System.out.println("Batch Name :"+st.getBatch().getBname());
			System.out.println("Faculty ID :"+st.getBatch().getFaculty().getFid());
			System.out.println("Faculty Name :"+st.getBatch().getFaculty().getFname());
			System.out.println("Cource ID :"+st.getBatch().getFaculty().getCourse().getCid());
            System.out.println("Cource Name :"+st.getBatch().getFaculty().getCourse().getCname());
            System.out.println("===============================");
         
		}
		}
	}

	
	

}
