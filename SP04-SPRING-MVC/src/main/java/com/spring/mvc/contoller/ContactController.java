package com.spring.mvc.contoller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.models.User;

@Controller
public class ContactController {
		
	@RequestMapping("/contact1")
	public String showContact1()
	{
		return "contact1";
	}
	
	@RequestMapping(path = "/processContact1",method = RequestMethod.POST)
	public String processContact1(HttpServletRequest request,Model model)
	{
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		System.out.println("Email id is : "+email);
		System.out.println("User Name is : "+userName);
		System.out.println("Password is : "+password);
		
		model.addAttribute("email",email);
		model.addAttribute("userName",userName);
		model.addAttribute("password",password);
		
		return "success";
	}
	
	@RequestMapping("/contact2")
	public String showContact2()
	{
		return "contact2";
	}
	
	@RequestMapping(path = "/processContact2",method = RequestMethod.POST)
	public String processContact2(
			@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			Model model)
	{
		System.out.println("Email id is : "+email);
		System.out.println("User Name is : "+userName);
		System.out.println("Password is : "+password);
		
		model.addAttribute("email",email);
		model.addAttribute("userName",userName);
		model.addAttribute("password",password);
		
		return "success";
	}
	
	@RequestMapping("/contact3")
	public String showContact3()
	{
		return "contact3";
	}
	
	@RequestMapping(path = "/processContact3",method = RequestMethod.POST)
	public String processContact3(
			@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password, 
			Model model)
	{
		User user=new User();
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		
		System.out.println(user);
		
		model.addAttribute("user", user);
		
		return "success1";
	}
	
	@RequestMapping("/contact4")
	public String showContact4()
	{
		return "contact4";
	}
	
	@RequestMapping(path = "/processContact4",method = RequestMethod.POST)
	public String processContact3(@ModelAttribute User user)
	{
		System.out.println(user);
		
		return "success1";
	}

}
