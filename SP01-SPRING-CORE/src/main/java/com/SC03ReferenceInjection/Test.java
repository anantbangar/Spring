package com.SC03ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/SC03ReferenceInjection/RefInjectionConfig.xml");
		
		A a1=(A)context.getBean("ABean1");
		
		System.out.println(a1.getX());
		System.out.println(a1.getObj());
		System.out.println(a1);

	}

}
