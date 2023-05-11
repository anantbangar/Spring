package com.SC12RemovingXMLforSpringConfig;

import org.springframework.stereotype.Component;

//@Component("StudentBean")
public class Student {
	
	private Samosa samosa;
			
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study()
	{
		this.samosa.display();
		System.out.println("Student is reading book ");
	}

}
