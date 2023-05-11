package com.SC01SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/SC01SetterInjection/SetterInjectionConfig.xml");

		Student st1 = (Student) context.getBean("StudentBean1");

		Student st2 = context.getBean("StudentBean2", Student.class);
		
		Student st3=(Student)context.getBean("StudentBean3");

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}
}
