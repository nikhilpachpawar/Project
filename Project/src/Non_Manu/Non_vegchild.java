package Non_Manu;

import java.util.Scanner;
import HotelManu.CodeMergee;

import ExceptionManu.YouWouldWrongChoice;

public class Non_vegchild implements Non_veg {
	
	Scanner sc=new Scanner(System.in);

	public static int PriceNon_Veg=0;
	
	int bm=0;
	public void Non_Veg() 
	{
		System.out.println("---Non-Veg Biryani---");
		System.out.println("1.Chicken_Dum_Biryani               Price= 220\n"
				          +"2.Chicken_65_Biryani                Price= 239\n"
				          +"3.SplChickenBiryaniBone             Price= 239\n"
				          +"4.SplChickenBiryaniBoneLess         Price= 249\n"
				          +"5.Mutton_Biryani                    Price= 259\n"
				          +"6.Eigg_Biryani                      Price= 189\n"
				          +"7.Family_Biryani                    Price= 520\n"
				          +"8.Manu\n"
				          +"9.Exist");
		
		System.out.println("Enter Choise");
		while(true) {
		
		int z=sc.nextInt();

	    bm=bm+z;
		if(z==1)
		{
			Chicken_Dum_Biryani();
			
		}
		else if(z==2)
		{
			Chicken_65_Biryani();
		}
		else if(z==3)
		{
			SplChickenBiryaniBone();
		}
		else if(z==4)
		{
			SplChickenBiryaniBoneLess();
		}
		else if(z==5)
		{
			Mutton_Biryani();
		}
		else if(z==6)
		{
			Eigg_Biryani();
		}
		else if(z==7)
		{
			Family_Biryani();
		}
		else if(z==8)
		{
			CodeMergee c=new CodeMergee();
			c.m1();
		}
		else if(z==9)
		{
			System.exit(0);
		}
		else
		{
			try
			{
				m1();
			}
			catch(YouWouldWrongChoice p)
			{
				System.out.println(p.getMessage());
			}
				
		}
		}
	}
	

	@Override
	public void Chicken_Dum_Biryani() {
		int Chicken_Dum_BiryaniPrice=220;
		PriceNon_Veg=PriceNon_Veg+Chicken_Dum_BiryaniPrice;
		
	}

	@Override
	public void Chicken_65_Biryani() {
		int Chicken_65_BiryaniPrice=239;
		PriceNon_Veg=PriceNon_Veg+Chicken_65_BiryaniPrice;
	}

	@Override
	public void SplChickenBiryaniBone() {
		int SplChickenBiryaniBonePrice=239;
		PriceNon_Veg=PriceNon_Veg+SplChickenBiryaniBonePrice;
	}

	@Override
	public void SplChickenBiryaniBoneLess() {
		int SplChickenBiryaniBoneLessPrice=249;
		PriceNon_Veg=PriceNon_Veg+SplChickenBiryaniBoneLessPrice;
	}

	@Override
	public void Mutton_Biryani() {
		int Mutton_BiryaniPrice=259;
		PriceNon_Veg=PriceNon_Veg+Mutton_BiryaniPrice;
	}

	@Override
	public void Eigg_Biryani() {
		int Eigg_BiryaniPrice=189;
		PriceNon_Veg=PriceNon_Veg+Eigg_BiryaniPrice;
	}

	@Override
	public void Family_Biryani() {
		int Family_BiryaniPrice=520;
		PriceNon_Veg=PriceNon_Veg+Family_BiryaniPrice;
	}
	public void m1() throws YouWouldWrongChoice
	{
		if(bm>=1 && bm<=9 )
		{
			System.out.println("");
		}
		
		else if(bm>9){
			throw new YouWouldWrongChoice("Wrong Choice");
		}
		
	}
	
	
}