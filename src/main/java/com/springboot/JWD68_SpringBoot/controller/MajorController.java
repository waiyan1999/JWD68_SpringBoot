package com.springboot.JWD68_SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.JWD68_SpringBoot.model.MajorBean;

@Controller
@RequestMapping("/major")
public class MajorController {
	
	@GetMapping("/form")
	public ModelAndView showForm() {
		
		return new ModelAndView("major-create","majorObj",new MajorBean());
	}
	
	@PostMapping("/create")
	public String majorCreate(@ModelAttribute("majorObj") MajorBean major, Model m) {
		
		m.addAttribute("major",major);
		return "major-info";
	}

}
