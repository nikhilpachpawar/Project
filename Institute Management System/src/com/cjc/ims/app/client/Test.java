package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.karvenager;

public class Test {
	public static void main(String[] args) {
		karvenager k=new karvenager();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("------Select-------\n"
				          +"1.Add Cource \n"
				          +"2.View Cource \n"
				          +"3.Add Faculty \n"
				          +"4.View Faculty\n"
				          +"5.Add Batch \n"
				          +"6.View Batch\n"
				          +"7.Add Student \n"
				          +"8.View Student\n"
				          +"9.Exist \n");
		
		System.out.println("Plese Select Your Option : ");
		int x=sc.nextInt();
		
		if(x==1)
		{k.addCource();}
		
		else if(x==2)
		{k.viewCource();}
		
		else if(x==3){
			k.addFaculty();}
		
		else if(x==4)
		{k.viewFaculty();}
		
		
		else if(x==5)
		{k.addBatch();}
		
		else if(x==6)
		{k.viewBatch();}
		
		else if(x==7)
		{k.addStudent();}
		
		else if(x==8)
		{k.viewStudent();}
		else if(x==9)
		{System.exit(0);}
		else
		{ 
			System.err.println("Wrong Choise");
			System.out.println("Please Select Correct Choise");
			
			
		}
		 
	}
		
		
	}

}
