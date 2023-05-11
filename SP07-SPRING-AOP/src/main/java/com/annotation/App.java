package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/annotation/config.xml");
        PaymentService bean = applicationContext.getBean("payment",PaymentService.class);
        
        bean.a();
        bean.b();
        bean.c();
    }
}
