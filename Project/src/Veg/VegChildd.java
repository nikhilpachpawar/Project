package Veg;

import java.util.Scanner;

import ExceptionManu.YouWouldWrongChoice;

import HotelManu.CodeMergee;


public class VegChildd implements Veg {
	Scanner sc=new Scanner(System.in);
	public static int VegPrice=0;
	
	int bm=0;
	public void VegManu() 
	{
		System.out.println("---Veg Biryani---");
		System.out.println("1.VegBiryani         Price= 179\n"
				          +"2.PannerBiryani      Price= 199\n"
				          +"3.JeeraRise          Price= 149\n"
				          +"4.CurdRise           Price= 139\n"
				          +"5.SteamRise          Price= 109\n"
				          +"6.VegFamilyBiryani   Price= 419\n"
				          +"7.Manu \n"
				          +"8.Exist");
		while(true) {
	
	
          
		int v=sc.nextInt();
		bm=bm+v;
		
		if(v==1)
		{
			VegBiryani();
		}
		else if(v==2)
		{
			PannerBiryani();
		}
		else if(v==3)
		{
			JeeraRise();
		}
		else if(v==4)
		{
			CurdRise();
		}
		else if(v==5)
		{
			SteamRise();
		}
		else if(v==6)
		{
			VegFamilyBiryani();
		}
		else if(v==7)
		{
			
			CodeMergee c=new CodeMergee();
			c.m1();
			
		}
		else if(v==8)
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
	public void VegBiryani() {
		int VegBiryaniPrice =179 ;
		
		VegPrice=VegPrice+VegBiryaniPrice;
	}

	@Override
	public void PannerBiryani() {
		int PannerBiryaniPrice =199 ;
		VegPrice=VegPrice+PannerBiryaniPrice;
	}

	@Override
	public void JeeraRise() {
		int JeeraRisePrice =149 ;
		VegPrice=VegPrice+JeeraRisePrice;
	}

	@Override
	public void CurdRise() {
		int CurdRisePrice =139 ;
		VegPrice=VegPrice+CurdRisePrice;
	}

	@Override
	public void SteamRise() {
		int SteamRisePrice =109 ;
		VegPrice=VegPrice+SteamRisePrice;
	}

	@Override
	public void VegFamilyBiryani() {
		int VegFamilyBiryaniPrice =419 ;
		VegPrice=VegPrice+VegFamilyBiryaniPrice;
	}
	public void m1() throws YouWouldWrongChoice
	{
		if(bm>=1 && bm<=8 )
		{
			System.out.println("");
		}
		
		else if(bm>8){
			throw new YouWouldWrongChoice("Wrong Choice");
		}
	

}
}
