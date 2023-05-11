package com.SC05LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("com/SC05LifeCycle/LifeCycleConfig.xml");
		
		context.registerShutdownHook();
		
		Samosa samosa1=context.getBean("SamosaBean1",Samosa.class);
		System.out.println(samosa1);
		
		Pepsi pepsi1=context.getBean("PepsiBean1",Pepsi.class);
		System.out.println(pepsi1);
		
		Example example1=context.getBean("ExampleBean1",Example.class);
		System.out.println(example1);
	}
}
