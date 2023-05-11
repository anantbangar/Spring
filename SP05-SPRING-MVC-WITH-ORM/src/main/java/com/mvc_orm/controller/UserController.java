package com.mvc_orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc_orm.model.User;
import com.mvc_orm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String home()
	{
		return "form";
	}
	@RequestMapping("/form")
	public String form()
	{
		return "form";
	}
	
	@RequestMapping("/string")
	@ResponseBody
	public String string()
	{
		return "string as it is......";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute User user)
	{
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}

}
