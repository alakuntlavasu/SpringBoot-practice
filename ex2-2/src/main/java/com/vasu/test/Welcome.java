package com.vasu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Welcome {
	@GetMapping("/vasu")
	public ModelAndView display() {
		System.out.println("contact page..,");
		return new ModelAndView("contact");
		
	}
	@GetMapping("/varuns")
	public ModelAndView wecome() {
		System.out.println("contact page..,");
		return new ModelAndView("service");
		
	}

}
