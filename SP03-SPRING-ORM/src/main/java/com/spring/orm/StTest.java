package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.StudentDaoImpl;
import com.spring.orm.entities.Student;

public class StTest 
{
    public static void main( String[] args )
    {
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("Stconfig.xml");
        
        StudentDao studentDao = context.getBean("studentDaoImpl",StudentDao.class);
        
		
		/*
		 * Student st=new Student(103,"Gulab","Mumbai"); int i =
		 * studentDao.insertStudent(st); 
		 * System.out.println(i+"done");
		 */
		 
		 
        
		
		  Student student = studentDao.selectStudent(100); 
		  System.out.println(student);
		  
		  List<Student> listStudent = studentDao.selectAllStudent(); 
		  for(Student st : listStudent) 
		  { 
		  		System.out.println(st); 
		  }
		 
        
        
		/*
		 * int i = studentDao.deleteStudent(103);
		 * System.out.println(i+" record is deleted from Student table");
		 */
        
        
		/*
		 * int i = studentDao.updateStudent(100);
		 * System.out.println(i+"record is updated in Student table");
		 */
    }
}
