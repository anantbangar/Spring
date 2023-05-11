package com.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.jdbc.dao.EmpDaoImpl;
import com.spring.jdbc.entities.Emp;

public class TestEmp {
	
	public static void main(String[] args) {
		
		/*
		 * Resource r=new ClassPathResource("com/spring/jdbc/EmpConfig.xml");
		 * BeanFactory factory=new XmlBeanFactory(r); EmpDaoImpl daoImpl =
		 * factory.getBean("empDaoImpl",EmpDaoImpl.class);
		 * 
		 * List<Emp> listEmp = daoImpl.selectAllEmp();
		 * 
		 * for(Emp emp : listEmp) { System.out.println(emp); }
		 */
		
		/*
		 * ApplicationContext context= new
		 * ClassPathXmlApplicationContext("com/spring/jdbc/EmpConfig.xml");
		 */
		
		ApplicationContext context=
				new AnnotationConfigApplicationContext(EmpJdbcConfig.class);
		
		EmpDaoImpl empDaoImpl = context.getBean("empDaoImpl",EmpDaoImpl.class);
		
		
		/*
		 * Emp emp=new Emp(); emp.setEid(103); emp.setEname("Gulab");
		 * emp.setSalary(80000);
		 * 
		 * int i = empDaoImpl.insert(emp);
		 * 
		 * System.out.println(i+" record inserted into emp table");
		 */
		
		
		/*
		 * Emp emp=new Emp(); emp.setSalary(40000); emp.setEname("Anant");
		 * 
		 * int i = empDaoImpl.update(emp);
		 * 
		 * System.out.println(i+" record updated into emp table");
		 */
		
		
		/*
		 * int i = empDaoImpl.delete(103);
		 * System.out.println(i+" record deleted from emp table");
		 */
		
		
		/*
		 * Emp emp = empDaoImpl.selectEmp(100); System.out.println(emp);
		 */
		
		
		List<Emp> listEmp1 = empDaoImpl.selectAllEmp();
		
		for(Emp emp : listEmp1)
		{
			System.out.println(emp);
		}
		
	}

}
