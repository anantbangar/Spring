package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.entities.Student;

@Component
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insertStudent(Student st) 
	{
		Integer i =(Integer)hibernateTemplate.save(st);
		
		return i;
	}
	
	public Student selectStudent(int studentId) {
		
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	public List<Student> selectAllStudent() {
		
		List<Student> listStudent = this.hibernateTemplate.loadAll(Student.class);
		return listStudent;
	}
	
	@Transactional
	public int deleteStudent(int studentId) {
		
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
		return 1;
		
	}
	
	@Transactional
	public int updateStudent(int studentId) {
		
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		student.setName("Shalioo");
		this.hibernateTemplate.update(student);
				
		return 1;
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
