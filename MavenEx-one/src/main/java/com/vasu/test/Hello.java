package com.vasu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Hello 
{
       @GetMapping("/D")	
       public ModelAndView WelcomeAll() {
        	
    	   return new ModelAndView("vasu");
        }
}
