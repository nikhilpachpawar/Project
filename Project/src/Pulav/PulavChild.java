package Pulav;

import java.util.Scanner;

import ExceptionManu.YouWouldWrongChoice;

import HotelManu.CodeMergee;


public class PulavChild implements Pulav {
	Scanner sc=new Scanner(System.in);
	public static int PulavPrice=0;

	int bm=0;
	public void Pulav()  {
		System.out.println("---Pulav---");
		System.out.println("1.VegPulav            Price= 179\n"
				          +"2.KajuPulav           Price= 199\n"
				          +"3.PannerPulav         Price= 149\n"
				          +"4.JeeraPulav          Price= 139\n"
				          +"5.RajugariKodiPulav   Price= 419\n"
				          +"6.Manu\n"
				          +"7.Exist");
	while(true) {
		
		int Pulav=sc.nextInt();
		bm=bm+Pulav;
		if(Pulav==1)
		{
			VegPulav();
		}
		else if(Pulav==2)
		{
			KajuPulav();
		}
		else if(Pulav==3)
		{
			PannerPulav();
		}
		else if(Pulav==4)
		{
			JeeraPulav();
		}
		else if(Pulav==5)
		{
			RajugariKodiPulav();
		}
		else if(Pulav==6)
		{
			CodeMergee c=new CodeMergee();
			c.m1();
		}
		else if(Pulav==7)
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
	public void VegPulav() {
		int VegPulavPrice=179;
		PulavPrice=PulavPrice+VegPulavPrice;
		
	}

	@Override
	public void KajuPulav() {
		int KajuPulavPrice=199;
		PulavPrice=PulavPrice+KajuPulavPrice;
		
	}

	@Override
	public void PannerPulav() {
		int PannerPulavPrice=189;
		PulavPrice=PulavPrice+PannerPulavPrice;
	}

	@Override
	public void JeeraPulav() {
		int JeeraPulavPrice=159;
		PulavPrice=PulavPrice+JeeraPulavPrice;
		
	}

	@Override
	public void RajugariKodiPulav() {
		int RajugariKodiPulavPrice=259;
		PulavPrice=PulavPrice+RajugariKodiPulavPrice;
		
	}
	public void m1() throws YouWouldWrongChoice
	{
		if(bm>=1 && bm<=7 )
		{
			System.out.println("");
		}
		
		else if(bm>7){
			throw new YouWouldWrongChoice("Wrong Choice");
		}

}
}