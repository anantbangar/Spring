package com.SC11ExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ABCBean")
public class ABC {
	
	@Value("#{2+3*10}")
	private int x;
	
	@Value("#{8>6?1:0}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{new java.lang.String('Anant Bangar')}")
	private String name;
	
	@Value("#{new com.SC11ExpressionLanguage.PQR(100,200)}")
	private PQR pqr;
	
	@Value("#{8>2}")
	private boolean isActive;
	
				
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "ABC [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", pqr=" + pqr
				+ ", isActive=" + isActive + "]";
	}
	
}
