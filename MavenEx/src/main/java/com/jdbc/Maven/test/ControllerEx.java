package com.jdbc.Maven.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerEx {
	@GetMapping("Index")
	 public ModelAndView  getindexpage() 
	 {
		return new ModelAndView("index") ;
		
	}
	@GetMapping("About")
	 public ModelAndView  getAboutpage() 
	 {
		return new ModelAndView("index") ;
		
	}

}
