package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class StJdbcConfig {

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
	 * @Bean("stDaoImpl") public StudentDaoImpl getStDaoImpl() { StudentDaoImpl
	 * stDaoImpl=new StudentDaoImpl(); stDaoImpl.setJdbcTemplate(getJdbcTemplate());
	 * 
	 * return stDaoImpl;
	 * 
	 * }
	 */
}
