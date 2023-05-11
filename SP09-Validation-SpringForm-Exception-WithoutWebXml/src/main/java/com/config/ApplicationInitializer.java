package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer 
{
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		System.out.println("ApplicationInitializer Running....");
		
		//XmlWebApplicationContext webApplicationContext =new XmlWebApplicationContext();
		//webApplicationContext.setConfigLocation("/WEB-INF/spring-servlet.xml");
		
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SpringConfig.class);;
		
		//DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
		DispatcherServlet dispatcherServlet=new DispatcherServlet();
		dispatcherServlet.setApplicationContext(webApplicationContext);
		
		ServletRegistration.Dynamic servlet
			=servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

}
