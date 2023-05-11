package com.SC06AutoWiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/SC06AutoWiring/xml/AutoWiringConfig.xml");
		
		Emp emp1=context.getBean("EmpBean1",Emp.class);
		System.out.println(emp1);
	}
}
