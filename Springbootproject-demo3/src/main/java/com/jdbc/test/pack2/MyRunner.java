package com.jdbc.test.pack2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.test.pack1.Vasu_Imp;

@Component
public class MyRunner implements CommandLineRunner
{
	@Autowired
    Vasu_Imp obj;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//
		obj.setDetails();
		
		List list= obj.getDetails();
		   list.forEach(v->System.out.println(v));
	}

}
