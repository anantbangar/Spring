package com.SC12RemovingXMLforSpringConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		 * ApplicationContext context= new ClassPathXmlApplicationContext(
		 * "com/SC12RemovingXMLforSpringConfig/RemovingXMLConfig.xml");
		 */
		
		ApplicationContext context=
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student st = context.getBean("StudentBean",Student.class);
		System.out.println(st);
		st.study();
		
		Samosa sm = context.getBean("getSamosa",Samosa.class);
		System.out.println(sm);
		sm.display();
	}

}
