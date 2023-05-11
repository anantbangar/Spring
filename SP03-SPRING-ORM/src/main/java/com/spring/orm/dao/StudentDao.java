package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Student;

public interface StudentDao {
	
	public int insertStudent(Student st);
	
	public Student selectStudent(int studentId);
	
	public List<Student> selectAllStudent();
	
	public int deleteStudent(int studentId);
	
	public int updateStudent(int studentId);

}
