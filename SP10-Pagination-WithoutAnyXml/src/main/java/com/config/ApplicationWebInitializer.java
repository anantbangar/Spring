package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationWebInitializer implements WebApplicationInitializer 
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		System.out.println("ApplicationWebInitializer Class is running....");
		
		//XmlWebApplicationContext applicationContext=new XmlWebApplicationContext();
		//applicationContext.setConfigLocation("/WEB-INF/spring-servlet.xml");
		
		AnnotationConfigWebApplicationContext applicationContext
			=new AnnotationConfigWebApplicationContext();
		
		applicationContext.register(SpringConfig.class);
		
		
		//DispatcherServlet dispatcherServlet=new DispatcherServlet(applicationContext);
		DispatcherServlet dispatcherServlet =new DispatcherServlet();
		dispatcherServlet.setApplicationContext(applicationContext);
		
		ServletRegistration.Dynamic myDispatcherServlet 
			=servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myDispatcherServlet.setLoadOnStartup(1);
		myDispatcherServlet.addMapping("/");
		
		
	}

}
