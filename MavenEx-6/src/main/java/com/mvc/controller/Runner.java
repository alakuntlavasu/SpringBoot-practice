package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Runner 
{

	@GetMapping("/v")
	public ModelAndView getIndex()
	{
		System.out.println("inside the index..,");
		return new ModelAndView("index");
	}
}
