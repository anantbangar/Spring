package com.annotation.service;

import org.springframework.stereotype.Component;

@Component("payment")
public class PaymentServiceImp implements PaymentService{

	public void a() 
	{
		System.out.println("a() invoked....");
						
	}
	
	public void b() 
	{
		System.out.println("b() invoked....");
						
	}
	
	public void c() 
	{
		System.out.println("c() invoked....");
						
	}
	

}
