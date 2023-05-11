package com.SC12RemovingXMLforSpringConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.SC12RemovingXMLforSpringConfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name = {"StudentBean","st"})
	public Student getStudent()
	{
		Student student=new Student(getSamosa());
		return student;
	}

}
