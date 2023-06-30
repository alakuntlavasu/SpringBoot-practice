package com.vasu.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vasu.util.Motors;

@Configuration
public class Appconfig {
	
	public Appconfig () 
	{
		System.out.println("Appconfig::constuctor");
		
	}
	
}


