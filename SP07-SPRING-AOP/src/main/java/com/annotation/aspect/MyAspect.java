package com.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyAspect 
{
	@Before("execution(* com.annotation.service.PaymentServiceImp.a())")
	public void printBefore() 
	{
		System.out.println("before printing..");
	}
	
	@After("execution(* com.annotation.service.PaymentServiceImp.b())")
	public void printAfter()
	{
		System.out.println("after printing...");
	}
	
	@Pointcut("execution(* com.annotation.service.PaymentServiceImp.c())")
	public void pointCutAround()
	{
		
	}
	
	@Around("pointCutAround()")
	public Object printAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("around printing before...");
		Object obj=pjp.proceed();
		System.out.println("around printing after...");
		return obj;
	}
}
