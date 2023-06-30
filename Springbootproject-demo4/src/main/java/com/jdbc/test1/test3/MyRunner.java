package com.jdbc.test1.test3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.test1.test2.Vasu;

@Component
public class MyRunner implements CommandLineRunner 
{
	@Autowired
    Vasu td;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		td.set_student_Details();
		
//		List list= td.getstudentDetails();
//		   list.forEach(v->System.out.println(v));
		
		
	}

}
