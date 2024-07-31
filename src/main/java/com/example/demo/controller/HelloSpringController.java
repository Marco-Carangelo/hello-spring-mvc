package com.example.demo.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloSpringController {
	
	@GetMapping("/helloSpring")
	public String helloSpring(@RequestParam(name = "name") String name, Model model) {
		
		model.addAttribute("name",name);
		model.addAttribute("time",LocalTime.now());
		return "helloSpring";
		
	}
	

}
