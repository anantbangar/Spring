package com.validationAndSpForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyExceptionController1 
{		
	@RequestMapping("/showException")
	public String showException(Model m)
	{
		//String str=null;
		//System.out.println(str.length());
		
		String name="anant";
		System.out.println(Integer.parseInt(name));
		
		m.addAttribute("exceptionMsg","There is NO Exception");
		return "show";
	}
	
	/*
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("exceptionMsg","Null Pointer Exception occured");
		return "show";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m)
	{
		m.addAttribute("exceptionMsg","Number Format Exception occured");
		return "show";
		
	}
	
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
		m.addAttribute("exceptionMsg","Exception occured");
		return "show";
		
	}
	*/

}
