package com.spring.mvc.contoller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController 
{
	@GetMapping("/barChart")
	public String getAllEmployee(Model model) 
	{
		List<String> nameList=new ArrayList<String>();
		List<Integer> ageList=new ArrayList<Integer>();
		nameList.add("Anant");
		nameList.add("shailoo");
		nameList.add("gulab");
		
		ageList.add(10);
		ageList.add(20);
		ageList.add(30);
		
		model.addAttribute("name", nameList);
		model.addAttribute("age", ageList);
		return "barChart";
	
	}
	
	
	@GetMapping("/chart")
	public String chart(Model model) 
	{
		List<String> nameList=new ArrayList<String>();
		List<Integer> ageList=new ArrayList<Integer>();
		nameList.add("Anant");
		nameList.add("shailoo");
		nameList.add("gulab");
		
		
		ageList.add(10);
		ageList.add(20);
		ageList.add(30);
		
		
		model.addAttribute("name", nameList);
		model.addAttribute("age", ageList);
		
		return "chart";
		
	}
	
	@GetMapping("/chart1")
    public String chart1(Model model) {
        // Replace these with your actual data retrieval logic
        List<String> labels = Arrays.asList("Label 1", "Label 2", "Label 3", "Label 4", "Label 5");
        List<Integer> data = Arrays.asList(12, 19, 3, 5, 2);

        model.addAttribute("chartLabels", labels);
        model.addAttribute("chartData", data);

        return "chart1"; // Return the name of your JSP page
    }

}
