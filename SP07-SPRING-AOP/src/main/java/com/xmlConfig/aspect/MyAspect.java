package com.xmlConfig.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect 
{
	public void printBefore()
	{
		System.out.println("Before printing...");
	}
	
	public void printAfter()
	{
		System.out.println("After printing...");
	}
	
	public Object printAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Around printing...");
		Object obj=pjp.proceed();
		return obj;
	}

}
