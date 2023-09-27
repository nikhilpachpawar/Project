package HotelManu;

import java.util.Scanner;

import ExceptionManu.YouWouldWrongChoice;
import Non_Manu.Non_vegchild;
import Veg.VegChildd;
import Pulav.PulavChild;

public class CodeMergee {
	Scanner sc=new Scanner(System.in);
	int bm=0;
	public void m1()  {
	System.out.println("-----Welcome------");
	System.out.println("1.Veg Biryani \n"
			          +"2.Non-Veg Biryani \n"
			          +"3.Pulav   \n"
			          +"4.Bill \n"
			          +"5.Exist");
	
	System.out.println("Please Enter Your Choise");
	while(true) {
	int x=sc.nextInt();
	bm=bm+x;
	
	if(x==1) 
	{
		VegChildd a=new VegChildd();
		a.VegManu();
		
	}
	else if(x==2)
	{
		Non_vegchild b=new  Non_vegchild();
		b.Non_Veg();
	}
	else if(x==3)
	{
		PulavChild c=new PulavChild();
		c.Pulav();
	}
	else if(x==4)
	{
		int a=Non_vegchild.PriceNon_Veg;
		int b=PulavChild.PulavPrice;
		int c=VegChildd.VegPrice;
		int Bill_Amount=(a+b+c);
		System.err.println("Your Total Bill :"+Bill_Amount);
		
		
		
		System.out.println("---Bill Pay----\n"
				           +"1.Cash \n"
				           +"2.UPI ");
		
		int d=sc.nextInt();
		
		if(d==1)
		{  System.out.println("Enter Amount To Pay :");
			int pay_amount=sc.nextInt();
			if(Bill_Amount==pay_amount)
			{
				System.out.println("Payment Sussefull");
				System.out.println("Your Order Is Place");
				System.out.println("---Thank You---");
				System.exit(0);
			}
			else
			{
				System.err.println("Fund InSufficint");
				System.out.println("Please Enter Rignt Value");
				int pay_amount1=sc.nextInt();
				if(pay_amount1==Bill_Amount)
				{
					System.out.println("Payment Sussefull");
					System.out.println("Your Order Is Place");
					System.out.println("---Thank You---");
					
					System.exit(0);
				}
				else 
				{
					System.err.println("Fund InSufficint / You Get Wrong Input");
					System.err.println("Your Order Is Cancle");
					System.err.println("Plese Enter Your Order Again ");
					System.out.println("---Thank You---");
					System.exit(0);
					
				}
			}
		}
		else if(d==2)
		{
			 System.out.println("Enter Amount To Pay :");
				int pay_amount=sc.nextInt();
				if(Bill_Amount==pay_amount)
				{
					System.out.println("Payment Sussefull");
					System.out.println("Your Order Is Place");
					System.out.println("---Thank You---");
					System.exit(0);
				}
				else
				{
					System.err.println("Fund InSufficint");
					System.out.println("Please Enter Rignt Value");
					int pay_amount1=sc.nextInt();
					if(pay_amount1==Bill_Amount)
					{
						System.out.println("Payment Sussefull");
						System.out.println("Your Order Is Place");
						System.out.println("---Thank You---");
						System.exit(0);
					}
					else 
					{
						System.err.println("Fund InSufficint / You Get Wrong Input");
						System.err.println("Your Order Is Cancle");
						System.err.println("Plese Enter Your Order Again ");
						System.out.println("---Thank You---");
						System.exit(0);
						
					}
				}
		}
		else
		{
			System.out.println("Please Enter Write Choice ");
		}
		
		
	}
	else if(x==5) 
	{
    System.exit(0);
   }
	else
	{
		try
		{
			m2();
		}
		catch(YouWouldWrongChoice p)
		{
			System.out.println(p.getMessage());
		}
	}
	
	}	
	}
	public void m2() throws YouWouldWrongChoice
	{
		if(bm>=1 && bm<=5 )
		{
			System.out.println("");
		}
		
		else if(bm>5){
			throw new YouWouldWrongChoice("Wrong Choice");
		}
	
	
	}	
	

}
