package com.example.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
	
	@GetMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("name","Aryan Prajapati");
		
		model.addAttribute("currentDate",new Date().toLocaleString());
		
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iterator(Model model) {
		List<String> names = List.of("Aryan","Lucky","Hetal","Harsh");
		model.addAttribute("names",names);
		return "iterator";
	}
	
	
	@GetMapping("/condition")
	public String condition(Model model) {
		model.addAttribute("isActive",true);
		model.addAttribute("gender","F");
		List<Integer> list = List.of();
		model.addAttribute("mylist",list);
		return "condition";
	}
	
	@GetMapping("/service")
	public String fragment(Model model) {
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newabout() {
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

}
