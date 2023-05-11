package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Emp;

@Component
public class EmpDaoImpl implements EmpDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertEmp(Emp emp) {
		
		String query="insert into emp values(?,?,?)";
		int i = jdbcTemplate.update(query,emp.getEid(),emp.getEname(),emp.getSalary());
		
		return i;
	}
	
	public int updateEmp(Emp emp) {
		
		String query="update emp set salary=? where ename=?";
		int i = jdbcTemplate.update(query,emp.getSalary(),emp.getEname());
		
		return i;
	}
	
	public int deleteEmp(int eid) {

		String query="delete from emp where eid=?";
		int i = jdbcTemplate.update(query,eid);
		
		return i;
	}
	
	public Emp selectEmp(int eid) {

		String query="select * from emp where eid=?";
		EmpRowMapperImpl rowMapper=new EmpRowMapperImpl();
		Emp emp = jdbcTemplate.queryForObject(query,rowMapper,eid);
		
		return emp;
	}
	
	public List<Emp> selectAllEmp() {
		
		String query="select * from emp";
		List<Emp> listEmp = jdbcTemplate.query(query,new EmpRowMapperImpl());
		
		return listEmp;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
