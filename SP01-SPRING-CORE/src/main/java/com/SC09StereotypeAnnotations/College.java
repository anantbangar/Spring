package com.SC09StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("CollegeBean")
public class College {
	
	@Value("PVPPCOE")
	private String name;
	
	@Value("Pune")
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + "]";
	}
	
	
	
	

}
