package com.cjc.bms.client;
import java.util.Scanner;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;

public class Test {
	public static void main(String[] args) {
		Rbi bank=new Sbi();
		System.out.println("\n Welcome To Rbi \n");
		while(true) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n----- Select Option-------- "+
		                   "\n 1.Create Account" +
				           "\n 2.Check Your Information"+
		                   "\n 3.Deposite Money"+
				           "\n 4.WithDrawal Money"+
		                   "\n 5.Balence Check"+
				           "\n 6.End My Processes");
		int x=sc.nextInt();
		if(x==1)
		{
			bank.createAccount();
		}
		else if(x==2)
		{
			bank.displayAllDetails();
		}
		else if(x==3)
		{
			bank.depositeMoney();
		}
		else if(x==4)
		{
			bank.withdrawal();
		}
		else if(x==5)
		{
			bank.balenceCheck();
		}
		else if(x==6)
		{
			System.exit(0);
			System.out.println("End Your Processes  ");
		}
		else
		{
			System.err.println("Wrong Choice");
		}
		
	}
		
	}
	

}