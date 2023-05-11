package com.validationAndSpForm.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee 
{
	@Min(value = 18,message = "must be equal or greater than 18")
	@Max(value = 45,message = "must be equal or less than 45")
	private int age;
	
	private String name;
	
	//@Size(min=1,message="required")
	@Pattern(regexp = "^[a-zA-Z0-9]{3}",message = "length must be 3 and not contain any special character")
	private String password;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
