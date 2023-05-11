package com.spring.mvc.contoller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request)
	{
		System.out.println("using HttpServletRequest - this is home url called by Controller ");
		
		request.setAttribute("name","Anant Bangar");
		request.setAttribute("city","Thane");
		
		List<String> listFriends=new ArrayList<String>();
		listFriends.add("Ram");
		listFriends.add("Raju");
		listFriends.add("Ketaki");
		listFriends.add("Sadhana");
		listFriends.add("Pawan");
		listFriends.add("Anant");
		
		request.setAttribute("listFriends", listFriends);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		System.out.println("Using Model - this is about url called by Controller");
		
		model.addAttribute("name","Pawan Bangar");
		model.addAttribute("city","Thane");
		
		List<String> listFriends=new ArrayList<String>();
		listFriends.add("Ram");
		listFriends.add("Raju");
		listFriends.add("Ketaki");
		listFriends.add("Sadhana");
		listFriends.add("Pawan");
		listFriends.add("Anant");
		
		model.addAttribute("listFriends", listFriends);
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("name","Shailoo Bangar");
		modelAndView.addObject("city","Pune");
		
		List<String> listFriends=new ArrayList<String>();
		listFriends.add("Ram");
		listFriends.add("Raju");
		listFriends.add("Ketaki");
		listFriends.add("Sadhana");
		listFriends.add("Pawan");
		listFriends.add("Anant");
		
		modelAndView.addObject("listFriends", listFriends);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		
		modelAndView.addObject("time", localDateTime);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
