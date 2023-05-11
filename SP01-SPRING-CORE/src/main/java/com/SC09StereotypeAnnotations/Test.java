package com.SC09StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/SC09StereotypeAnnotations/StereotypeAnnoConfig.xml");
		
		Student st = context.getBean("StudentBean",Student.class);
		
		System.out.println(st);
		
		System.out.println(st.getAddress().getClass().getName());
		
		System.out.println(st.getCollege());
	}

}
