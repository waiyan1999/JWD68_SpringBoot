package com.springboot.JWD68_SpringBoot.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("/")
	public String showIndex(Model m) {
		m.addAttribute("msg","Hello World");
		m.addAttribute("today", LocalDate.now());
		m.addAttribute("utilToday",new Date());
		return "index";
	}
	
	@GetMapping("/user-list")
	public String userList(Model m) {
		List<String> userList = new ArrayList<>();
		userList.add("Aung Aung");
		userList.add("Kyaw Kyaw");
		m.addAttribute("user_list",userList);
		return "user-list";
		
	}
}











