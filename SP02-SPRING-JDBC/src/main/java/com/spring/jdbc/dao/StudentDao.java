package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	
	public int insertStudent(Student st);
	
	public int updateStudent(Student st);
	
	public int deleteStudent(int studentId);
	
	public Student selectStudent(int studentId);
	
	public List<Student> selectAllStudent();

}
