package com.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.ProductBean;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com")
@PropertySource(value = {"classpath:application.properties"})
public class SpringConfig 
{
	@Autowired
	private Environment env;
	
	@Bean
	public ViewResolver getViewResolver()
	{
		System.out.println("inside getViewResolver()....");

		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		System.out.println("inside getDataSource()....");

		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("dataSource.driverClassName"));
		dataSource.setUrl(env.getProperty("dataSource.url"));
		dataSource.setUsername(env.getProperty("dataSource.userName"));
		dataSource.setPassword(env.getProperty("dataSource.password"));
		
		/*
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_mvc_orm");
		dataSource.setUsername("root");
		dataSource.setPassword("system123");
		*/
				
		return dataSource;
	}
	
	private Properties getHibernateProperties()
	{
		System.out.println("inside getHibernateProperties()....");

		Properties props=new Properties();
		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql") );
		props.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		
		/*
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.setProperty("hibernate.show_sql","true" );
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		*/
		
		return props;
	}
	
	@Bean("sessionFactory")
	public LocalSessionFactoryBean getSessionFactory()
	{
		System.out.println("inside getSessionFactory()....");
		
		LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setHibernateProperties(getHibernateProperties());
		sessionFactoryBean.setAnnotatedClasses(ProductBean.class);
				
		return sessionFactoryBean;
	}
	
	@Bean("hibernateTemplate")
	@Autowired
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
	{
		System.out.println("inside getHibernateTemplate()....");

		HibernateTemplate hibernateTemplate=new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory);
		
		return hibernateTemplate;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager gethiberHibernateTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("inside gethiberHibernateTransactionManager()....");

		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(sessionFactory);
		
		return hibernateTransactionManager;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getjJdbcTemplate()
	{
		System.out.println("inside getjJdbcTemplate()....");

		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}

}
