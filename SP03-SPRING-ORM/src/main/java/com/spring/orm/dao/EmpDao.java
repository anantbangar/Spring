package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Emp;

public interface EmpDao {
	
	public int insertEmp(Emp emp);
	
	public Emp selectEmp(int id);
	
	public List<Emp> selectAllEmp();
	
	public int updateEmp(int id,String ename);
	
	public int deleteEmp(int id);

}
