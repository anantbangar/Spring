package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("stDaoImpl")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertStudent(Student st) {
		
		String query="insert into student values(?,?,?)";
		int r = this.jdbcTemplate.update(query,st.getId(),st.getName(),st.getCity());
		return r;
	}
	
	public int updateStudent(Student st) {
		
		String query="update student set name=? where id=?";
		int i = this.jdbcTemplate.update(query,st.getName(),st.getId());
		return i;
	}
	
	public int deleteStudent(int studentId) {

		String query="delete from student where id=?";
		int i = this.jdbcTemplate.update(query,studentId);
		return i;
	}
	
	public Student selectStudent(int studentId) {
		
		String query="select * from student where id=?";
		//StudentRowMapperImpl rowMapperImpl = new StudentRowMapperImpl();
		//Student st = jdbcTemplate.queryForObject(query, rowMapperImpl,studentId);
		Student st = jdbcTemplate.queryForObject(query, new StudentRowMapperImpl(),studentId);
		
		return st;
	}
	
	public List<Student> selectAllStudent() {
		
		String query="select * from student";
		List<Student> stList = jdbcTemplate.query(query, new StudentRowMapperImpl());
		
		return stList;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	//@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

			
}
