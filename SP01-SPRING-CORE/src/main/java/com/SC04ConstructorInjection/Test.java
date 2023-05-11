package com.SC04ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/SC04ConstructorInjection/ConstructorInjectionConfig.xml");

		Person p1 = context.getBean("PersonBean1", Person.class);
		Person p2 = (Person) context.getBean("PersonBean2");
		Person p3 = context.getBean("PersonBean3", Person.class);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Addition addition1=context.getBean("AdditionBean1",Addition.class);
		Addition addition2=context.getBean("AdditionBean2",Addition.class);
		Addition addition3=context.getBean("AdditionBean3",Addition.class);
		
		addition1.doSum();
		addition2.doSum();
		addition3.doSum();

	}

}
