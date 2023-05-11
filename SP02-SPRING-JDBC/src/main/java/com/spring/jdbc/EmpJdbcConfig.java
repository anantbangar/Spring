package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.EmpDaoImpl;
import com.spring.jdbc.dao.EmpRowMapperImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class EmpJdbcConfig {
	
	@Bean("dds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dds=new DriverManagerDataSource();
		dds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dds.setUsername("root");
		dds.setPassword("system123");
		
		return dds;
		
	}
		
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
	/*
	 * @Bean("empDaoImpl") public EmpDaoImpl getEmpDaoImpl() { EmpDaoImpl
	 * empDaoImpl=new EmpDaoImpl(); empDaoImpl.setJdbcTemplate(getJdbcTemplate());
	 * 
	 * return empDaoImpl; }
	 */

}
