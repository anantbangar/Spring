package com.SC10SpringBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/SC10SpringBeanScope/SpringBeanScopeConfig.xml");
		
		Student st1 = context.getBean("StudentBean",Student.class);
		System.out.println(st1.hashCode());
		
		Student st2=(Student)context.getBean("StudentBean");
		System.out.println(st2.hashCode());
		
		/*
		 * System.out.println(st);
		 * 
		 * System.out.println(st.getAddress().getClass().getName());
		 * 
		 * System.out.println(st.getCollege());
		 */
		
		
	}

}
