package com.SC09StereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("StudentBean")
public class Student {
	
	@Value("101")
	private int id;
	
	@Value("Anant Bangar")
	private String name;
	
	@Value("#{AddressList}")
	private List<String> address;
	
	@Value("#{CollegeBean}")
	private College college;
	
		
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", college=" + college + "]";
	}

	
}
