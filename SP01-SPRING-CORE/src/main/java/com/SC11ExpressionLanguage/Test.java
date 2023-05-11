package com.SC11ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/SC11ExpressionLanguage/ExpressionLanguageConfig.xml");
		
		ABC abc1 = context.getBean("ABCBean",ABC.class);
		System.out.println(abc1);
	}

}
