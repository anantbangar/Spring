package com.SC05LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String subject;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("setting subject");
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("inside init method of Example class");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("inside destroy method of Example class");
	}

}
