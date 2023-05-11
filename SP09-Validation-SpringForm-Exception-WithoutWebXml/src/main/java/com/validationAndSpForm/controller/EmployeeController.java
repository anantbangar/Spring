package com.validationAndSpForm.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.validationAndSpForm.model.Employee;

@Controller
public class EmployeeController 
{
	@RequestMapping("/")
	public String home()
	{		
		return "index";
	}
	
	@RequestMapping("/validationAndSpForm")
	public String validationAndSpForm(Model m)
	{		
		m.addAttribute("emp",new Employee());
		return "validationAndSpForm";
	}
		
	@RequestMapping("/validationAndSpFormSubmit")
	public String validationAndSpFormSubmit(@Valid @ModelAttribute("emp") Employee e,BindingResult br)
	{
		System.out.println(e.getName());
		System.out.println(e.getPassword());
		System.out.println(e.getAge());
		
		if(br.hasErrors())
		{			
			return "validationAndSpForm";
		}
		else
		{
			return "success";
		}
			
	}

}
