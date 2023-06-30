package com.jas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Data {

	@GetMapping("/DATA")
	public ModelAndView data() {
		
		
		return new ModelAndView("index");
	}
	
}
