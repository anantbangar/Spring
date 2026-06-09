package com.SC12RemovingXMLforSpringConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.SC12RemovingXMLforSpringConfig")
public class JavaConfig {
	
	@Bean	
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name = {"StudentBean","st"})
	@Scope("prototype")
	public Student getStudent()
	{
		Student student=new Student(getSamosa());
		return student;
	}

}
