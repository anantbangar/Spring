package com.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmlConfig.service.Operation;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/xmlConfig/config.xml");
		Operation bean = context.getBean("operation",Operation.class);
		
		bean.msg();
		System.out.println();
		
		bean.m();
		System.out.println();

		bean.k();
	}

}
