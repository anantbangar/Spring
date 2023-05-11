package com.exceptionHandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler 
{
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		System.out.println("In MyExceptinHandler Class");
		m.addAttribute("exceptionMsg","Null Pointer Exception occured");
		return "show";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m)
	{
		System.out.println("In MyExceptinHandler Class");
		m.addAttribute("exceptionMsg","Number Format Exception occured");
		return "show";
		
	}
	
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
		System.out.println("In MyExceptinHandler Class");
		m.addAttribute("exceptionMsg","Exception occured");
		return "show";
		
	}

}
