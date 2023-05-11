package com.SC01SetterInjection;

public class Student {
	
	private int id;
	private String name;
	private String address;
	
			
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public void setId(int id)
	{
		System.out.println("setting id");
		this.id=id;
	}
	
	public void setName(String name)
	{
		System.out.println("setting name");
		this.name=name;
	}
	
	public void setAddress(String address)
	{
		System.out.println("setting address");
		this.address=address;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
