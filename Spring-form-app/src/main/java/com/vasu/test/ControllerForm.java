package com.vasu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ControllerForm {
	
	@GetMapping(value= {"/","/loadForm"})
	public String loadForm() {
		return "index";
	}
	
	
	@PostMapping(value="/saveproduct")
	public String handlesubmitBtn(HttpServletRequest req, Model model) {
		
		return "success";
		
	}

}
