package com.SC05LifeCycle;

public class Samosa {
	
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("setting samosa's price ");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("inside init method of Samosa class ");
	}
	
	public void destroy()
	{
		System.out.println("inside destroy method of Samosa class ");
	}

}
