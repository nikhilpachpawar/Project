package com.cjc.bms.serviceImpl;

import java.util.Scanner;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;

public class Sbi implements Rbi {
	double Withdraw;
	double balance;
       Scanner sc=new Scanner(System.in);
      Account a1=new Account();
     

	@Override
	public void createAccount()  {
		
		
		
		
		System.out.println("Enter Create Account Information \n");
		System.out.println("Enter Your Full Name");
		a1.setName(sc.next()+sc.nextLine());
		System.out.println("Enter Your Mobile Number");
		a1.setMobNo(sc.next());
		
		System.out.println("Enter Your Adhar Card Number");
		a1.setAdharNo(sc.next()+sc.nextLine());
		System.out.println("Gender  (Male / Female)");
		a1.setGender(sc.next());
		System.out.println("Enter Your Age");
		a1.setAge(sc.nextInt());
		String a=("91")+a1.getMobNo();
		a1.setAccNo(a);
		
		System.out.println("\n Your Account Number Is : "+a1.getAccNo()+"\n");
		System.err.println("\n Your Account Created \n");
		
		
	}

	
	


	public void displayAllDetails() {
		
		System.out.println("Enter Account Number");
		String no=sc.next(); 
		
		if(no.equals(a1.getAccNo())) {
		System.err.println("\n Your Information \n ");
		System.out.println("Account No     :"+a1.getAccNo());
		System.out.println("Full Name      :"+a1.getName());
		System.out.println("Mobile Number  :"+a1.getMobNo());
		System.out.println("Adhar Card No  :"+a1.getAdharNo());
		System.out.println("Gender         :"+a1.getGender());
		System.out.println("Age            :"+a1.getAge());
		}
		else {System.out.println("Account Number Is not currect");}
		
	}


	public void depositeMoney() {
		System.out.println("Enter Your Deposite Money");
		double d=(sc.nextDouble());
		balance=balance+d;
		a1.setBalence(balance);
		
		
		System.out.println("\n Money Deposite Succesfull \n");
		

		
		
	}

	
	public void withdrawal() {
		System.out.println("Enter Withdrawal Money");
		double Withdraw=sc.nextDouble();
		if( Withdraw >a1. getBalence())
		{
			System.err.println("EnSufficent Money");
		}
		else {
		
		this.Withdraw=Withdraw;
		System.err.println("\n WithDrawal Money Sucessfull \n");
		}
	}

	
	public void balenceCheck() {
		
		System.out.println("Balence Check : " +(a1.getBalence()- Withdraw));
		
		
	}
	
	public void YourAccount()
	{
		
	}
	

}