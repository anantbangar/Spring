package com.SC07AutoWiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//@Autowired
	//@Qualifier("AddressBean2")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("AddressBean3")
	public void setAddress(Address address) {
		System.out.println("Setting values");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
