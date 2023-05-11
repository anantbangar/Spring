package com.SC08StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/SC08StandaloneCollections/StandaloneCollectionConfig.xml");
		
		Person person = context.getBean("PersonBean1",Person.class);
		
		System.out.println("List :-");
		System.out.println(person.getFriendsList());
		System.out.println(person.getFriendsList().getClass().getName());
		
		System.out.println("---------------------------------------");
		
		System.out.println("Map :-");
		System.out.println(person.getCourseFeesMap());
		System.out.println(person.getCourseFeesMap().getClass().getName());
		
		System.out.println("----------------------------------------");
		System.out.println("Properties :-");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
		
	}

}
