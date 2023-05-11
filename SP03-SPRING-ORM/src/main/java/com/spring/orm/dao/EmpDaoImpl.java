package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Emp;

public class EmpDaoImpl implements EmpDao{

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insertEmp(Emp emp) {
		
		int i =(Integer) this.hibernateTemplate.save(emp);
		
		return i;
	}
	
	public Emp selectEmp(int id) {
		
		Emp emp = this.hibernateTemplate.get(Emp.class,id);
		return emp;
	}

	public List<Emp> selectAllEmp() {
		
		List<Emp> listEmp = this.hibernateTemplate.loadAll(Emp.class);
		return listEmp;
	}
	
	@Transactional
	public int updateEmp(int id,String ename) {

		Emp emp = this.hibernateTemplate.get(Emp.class,id);
		emp.setName(ename);
		this.hibernateTemplate.update(emp);
		return 1;
	}
	
	@Transactional
	public int deleteEmp(int id) {

		Emp emp = this.hibernateTemplate.get(Emp.class,id);
		this.hibernateTemplate.delete(emp);
		return 1;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
