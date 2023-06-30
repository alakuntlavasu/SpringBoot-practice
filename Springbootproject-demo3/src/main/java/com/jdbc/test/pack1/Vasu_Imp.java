package com.jdbc.test.pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Vasu_Imp implements vasu 
{
    @Autowired
	JdbcTemplate td;
    
	public void setDetails() 
	{
		// insert Query....
		td.update("insert into student6 values(104,'suhasini','Anatapur')");
		td.update("insert into student6 values(105,'jaggu','vizag')");
		td.update("insert into student6 values(106,'shafi','Ts')");
		
	}

	public List getDetails() {
		
		return td.queryForList("select * from student6");
	}

}
