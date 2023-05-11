package com.SC04ConstructorInjection;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private Certi certi;
	private List<String> list;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, Certi certi, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.certi=certi;
		this.list=list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + ", list=" + list + "]";
	}
	
	
		
}
