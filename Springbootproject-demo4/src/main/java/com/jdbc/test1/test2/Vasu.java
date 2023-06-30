package com.jdbc.test1.test2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Vasu implements Cab 
{
     @Autowired	
    JdbcTemplate td;
     
	@Override
	public void set_student_Details() {
		td.update("insert into student7 values(5000125,'vasu','vasu@gmail.com','vijayawada')");
		td.update("insert into student7 values(5000173,'varun Taj','taj@gmail.com','Ananatapur')");
		td.update("insert into student7 values(5000152,'naveen kumar','nave@gmail.com','madanapalli')");
		td.update("insert into student7 values(5000161,'jaggu','jaggu@gmail.com','Guntoor')");
		td.update("insert into student7 values(5000182,'suhasini','suha@gmail.com','Kadapa')");
		System.out.println("Inserted successfully..,");
		
		
	}

	@Override
	public List get_student_Details()
	{
		// TODO Auto-generated method stub
		 return td.queryForList("select * from student7");
	}


		
	}

	


