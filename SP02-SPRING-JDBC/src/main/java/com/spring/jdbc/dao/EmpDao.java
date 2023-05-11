package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Emp;

public interface EmpDao {
	
	public int insertEmp(Emp emp);
	
	public int updateEmp(Emp emp);
	
	public int deleteEmp(int eid);
	
	public Emp selectEmp(int eid);
	
	public List<Emp> selectAllEmp();

}
