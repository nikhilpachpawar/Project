package com.cjc.bms.model;

public class Account {
	private String accNo;
	private String name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	
	
	public void setAccNo(String accNo)
	{
		this.accNo=accNo;
	}
	public String getAccNo()
	{
		return accNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMobNo(String mobNo)
	{
		this.mobNo=mobNo;
	}
	public String getMobNo()
	{
		return mobNo;
	}
	public void setAdharNo(String adharNo)
	{
		this.adharNo=adharNo;
	}
	public String getAdharNo()
	{
		return adharNo;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setBalence(double balance)
	{
		this.balance=balance;
	}
	public double getBalence()
	{
		return balance;
	}
	

}