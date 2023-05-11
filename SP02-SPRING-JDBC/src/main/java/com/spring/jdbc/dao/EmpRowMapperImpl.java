package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Emp;

public class EmpRowMapperImpl implements RowMapper<Emp>{

	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Emp emp=new Emp();
		emp.setEid(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setSalary(rs.getInt(3));
		
		return emp;
	}

}
