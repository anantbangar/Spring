package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class TestStudent {

	public static void main(String[] args) {

		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/spring/jdbc/Stconfig.xml");
		 */
		 
		
		ApplicationContext context= new AnnotationConfigApplicationContext(StJdbcConfig.class);
				
		/*
		 * JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",
		 * JdbcTemplate.class); String query="insert into student values(?,?,?)"; int
		 * update = jdbcTemplate.update(query,102,"Gulab","Pune");
		 * System.out.println("student added : "+update);
		 */
		
		StudentDaoImpl studentDaoImpl=context.getBean("stDaoImpl",StudentDaoImpl.class);
				
		/*
		 * Student st=new Student(); st.setId(104); st.setName("Pawan");
		 * st.setCity("Nashik");
		 * 
		 * int i = studentDaoImpl.insertStudent(st);
		 * 
		 * System.out.println("student added : "+i);
		 */
			
		
		/*
		 * Student st=new Student(); st.setId(103); st.setName("Ram");
		 * 
		 * int i = studentDaoImpl.updateStudent(st);
		 * 
		 * System.out.println(i+" record updated");
		 */
				
		
		/*
		 * int i = studentDaoImpl.deleteStudent(104);
		 * 
		 * System.out.println(i+ " record deleted");
		 */
				
		/*
		 * Student st = studentDaoImpl.selectStudent(101);
		 * 
		 * System.out.println(st);
		 */
			
		
		List<Student> stList = studentDaoImpl.selectAllStudent();
		for(Student s : stList)
		{
			System.out.println(s);
		}
		
		
		 
	
	}

}
