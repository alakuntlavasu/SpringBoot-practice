package com.jdbc.vasu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controll {

	@RequestMapping("/wel")
	public ModelAndView data() {

//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", "welcom data");
//		mav.setViewName("index");
//
//		return mav;
		
		return new ModelAndView("index");
	}

}
